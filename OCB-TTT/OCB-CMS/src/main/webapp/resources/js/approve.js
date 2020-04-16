/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {

    var request = function () {
        var is = this;
        this.render = function (data)
        {
        }
        this.call = function (obj)
        {
            $.ajax({
                url: "get_approve_close_card",
                type: "GET",
                data: obj,
                async: false,
                contentType: 'application/json',
                dataType: 'json',
                success: function (data)
                {
                    var d = data;
                    is.render(d);
                }
            }).done(function (data) {
                var d = data;
                is.render(d);
            });
        }
        this.get = function (obj,url,fn)
        {
            $.ajax({
                url: url,
                type: "GET",
                data: obj,
                async: false,
                contentType: 'application/json',
                success: function (data)
                {
                    var d = data;
                    fn(data)
                }
            }).done(function (data) {
                var d = data;
                fn(data);
            });
        };
        this.post=function(obj,url,fn)
        {
            $.ajax({
                url: url,
                type: "POST",
                data: JSON.stringify(obj),
                async: false,
                contentType: 'application/json',
                success: function (data)
                {
                    if(data==="FAIL")
                    {
                        window.location.href = 'login/';
                    }
                    var d = data;
                    fn(data)
                }
            }).done(function (data) {
                var d = data;
                fn(data);
            });
        }
        
    };
        

    var columns = [
        {title: "CIF", data: 'cif'},
        {title: "Contract_Number", data: 'cardNumber'},
        {title: "Type", data: 'type'},
        {title: "Function", data: 'function'},
        {title: "Reason    ", data: 'reason'},
        {title: "BatchId", data: 'batchId'},
        {title: "User", data: 'users'},
        {title: "DateProcess", data: 'dateAuthorize'},
        {title: "Result", data: 'rs'},
        {title: "Selected", className: "check_box"}

    ];
    var columnDefs = [];
    for (var i = 0; i < columns.length; i++)
    {

        columnDefs[i] = {
            render: function (data, type, row) {
                return data;
            },
            targets: i
        };
        if (i === 9)
        {
            columnDefs[i] = {
                render: function (data, type, row) {
                    if(row.authorize==='N')
                    return '<input type="checkbox" checked   id="myCheck">';
                    return '<input type="checkbox" disabled id="myCheck">';
                },
                targets: i
            };
        }
    }
    var table
    var data_set;
    function checkBox(_data,is_check)
    {
        if(is_check)
        {
            
        }else
        {
            
        }
       
    }   
    var rq = new request();      
    rq.render = function (d)
    {
        data_set=d;
        for(var i=0;i<data_set.length;i++)
        {
            if(data_set[i].authorize==='N')
               data_set[i].isCheck=true;
        }
        var config = {
            data: data_set,
            columns: columns,
            columnDefs: columnDefs,
            order: [[0, "desc"]],
            paging: true,
            searching: false,
            bDestroy: true,
            lengthChange: false,
            createdRow: function( row, data, dataIndex ) {               
              $(row).find("input").on("click", function (e){                  
                 
                var checked = $(this).is(":checked");
                   checkBox(data,checked);
                   data.isCheck=checked;                  
              });
               
            }
        };        
        table = $('#table_CARD').DataTable(config);
        table.on( 'draw', function () {            
        } );
    };
    rq.call({});
    $("#pref-search").on("click", function () {
        reload_table();        
    });
    
    var reload_table=function()
    {
         var obj={
            status:$('#perpage_status :selected').val(),
            type:$('#perpage_type :selected').val(),
            batchId:$('#batch_id').val(),
            fromDate:$('#from_id').val(),
            toDate:$('#to_id').val()
        };
        rq.call(obj);
    };

    var export_file=function(batch_id,perpage_status,perpage_type,from_id,to_id,e)
    {
        rq.get({batchId:batch_id,status:perpage_status,type:perpage_type,fromDate:from_id,toDate:to_id},"approve_report_close_card",function(data){
           
           var html="<html> <head> <meta charset='UTF-8'> <meta name='viewport' content='width=device-width, initial-scale=1.0'> </head> <body> <table>";
           html+="<tr>  <td>CIF</td>\n\
                        <td>TYPE</td>\n\
                        <td>CONTRACT_NUMBER</td>\n\
                        <td>USER_CREATE</td>\n\
                        <td>DATE_CREATE</td>\n\
                        <td>USER_AUTHORIZE</td>\n\
                        <td>DATE_AUTHORIZE</td>\n\
                        <td>FUNCTION</td>\n\
                        <td>AUTHORIZE</td>\n\
                        <td>RESULT</td>\n\
                        <td>REASON</td>\n\
                </tr>"
           for(i=0;i<data.length;i++)
           {
               html+="<tr>";
               html+="<td>"+data[i].cif+"</td>";
               html+="<td>"+data[i].type+"</td>";
               html+="<td>\'"+data[i].cardNumber+"</td>";
               html+="<td>"+data[i].user+"</td>";
               html+="<td>"+data[i].dateCreate+"</td>";
               html+="<td>"+data[i].userAuthorize+"</td>";
               html+="<td>"+data[i].dateAuthorize+"</td>";
               html+="<td>"+data[i].function+"</td>";
               html+="<td>"+data[i].authorize+"</td>";
               html+="<td>"+data[i].result+"</td>";
               html+="<td>"+data[i].reason+"</td>";
               html+="</tr>";
                
           }      
           html+="</table> </body> </html>";
            window.open('data:application/vnd.ms-excel,' +encodeURIComponent(html));
                 e.preventDefault(); 
            
        })
    }
    var loadProgress=function()
    {
        var is_process=true;        
        rq.get({},"get_progress",function(data){           
            
            if(data.PROCESS_CARD_STATUS==="DONE")
            {
                is_process=false;         
            }else
            {
                $(".modal-body").html("Processing ... "+data.PROCESS_CARD_STATUS);
            }
            
        });        
        if(is_process)
        {
            setTimeout(function(){ loadProgress(); }, 1000);
        }else
        {            
          reload_table();
          $("#close").show();
          //  $('#exampleModal').modal('hide');
          
             $("#report").on("click", function (e) { 
              export_file($("#batch_id").val(),e);
                     
        
         });
           
        }
    }
    $("#update").on("click", function () {          
        $("#update").hide();      
        $("#close").show();        
        var list=new Array();
        table.rows().every( function (e) {                                               
            var d = this.data();
            if(d.isCheck&d.authorize==='N')
            {             
                list[list.length]=d;
            };            
        } );           
        var _url="update_close_card";            
        rq.post(list,_url,function(data){     
            
//            loadProgress(); 
            window.location.href = 'success_approve_card/';
            
            
        });       
        
    });
    
    $("#active").on("click", function () {          
        $("#active").hide();              
        var list=new Array();
        table.rows().every( function (e) {                                               
            var d = this.data();
            if(d.isCheck&d.authorize==='N')
            {             
                list[list.length]=d;
            };            
        } );           
        var _url="update_active_card";            
        rq.post(list,_url,function(data){     
            window.location.href = 'success_approve_card/';   
        });              
    });
    
    $("#return").on("click", function () {          
        $("#return").hide();              
        var list=new Array();
        table.rows().every( function (e) {                                               
            var d = this.data();
            if(d.isCheck&d.authorize==='N')
            {             
                list[list.length]=d;
            };            
        } );           
        var _url="update_return_card";            
        rq.post(list,_url,function(data){     
            window.location.href = 'success_approve_card/';   
        });              
    });
    
    $("#close_card").on("click", function () {          
        $("#close_card").hide();              
        var list=new Array();
        table.rows().every( function (e) {                                               
            var d = this.data();
            if(d.isCheck&d.authorize==='N')
            {             
                list[list.length]=d;
            };            
        } );           
        var _url="update_card_close";            
        rq.post(list,_url,function(data){     
            window.location.href = 'success_approve_card/';   
        });              
    });
    
    $("#close_account").on("click", function () {          
        $("#close_account").hide();              
        var list=new Array();
        table.rows().every( function (e) {                                               
            var d = this.data();
            if(d.isCheck&d.authorize==='N')
            {             
                list[list.length]=d;
            };            
        } );           
        var _url="update_account_close";            
        rq.post(list,_url,function(data){     
            window.location.href = 'success_approve_card/';   
        });              
    });
    
    $("#close_account_number").on("click", function () {          
        $("#close_account_number").hide();              
        var list=new Array();
        table.rows().every( function (e) {                                               
            var d = this.data();
            if(d.isCheck&d.authorize==='N')
            {             
                list[list.length]=d;
            };            
        } );           
        var _url="update_account_number_close";            
        rq.post(list,_url,function(data){     
            window.location.href = 'success_approve_card/';   
        });              
    });
    
    $("#show_model").on("click", function () { 
       
         $("#update").show();
         $("#close").show();
    });
    $("#reject").on("click", function () {          
        $("#reject").hide();      
        $("#close").hide();        
        var list=new Array();
        table.rows().every( function (e) {                                               
            var d = this.data();
            if(d.isCheck&d.authorize==='N')
            {             
                list[list.length]=d;
            };            
        } );           
        var _url="update_reject_status";            
        rq.post(list,_url,function(data){                              
//            loadProgress(); 
            window.location.href = 'success_reject_card/';
        });       
        
    });
    $("#report").on("click", function (e) { 
        export_file($("#batch_id").val(),$("#perpage_status").val(),$("#perpage_type").val(),$("#from_id").val(),$("#to_id").val(),e);
   
    });
    
    
    
    /*
     
     $('#table_id').DataTable(config);
     */
});

