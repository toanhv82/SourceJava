
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    var request = new function ()
    {
        this.GET = function (obj, url, fn)
        {
            var _ajax = $.ajax({
                url: url,
                type: "GET",
                data: obj,
                async: false,
                contentType: 'application/json',
                dataType: 'json',
                success: function (data)
                {
                    fn(data);
                }
            }).done(function (data) {
                fn(data);
            });
            ;
        };
        this.POST = function (obj, url, fn)
        {
            $.ajax({
                url: url,
                type: "POST",
                data: JSON.stringify(obj),
                async: false,
                contentType: 'application/json',
                success: function (data)
                {
                    fn(data);
                }
            }).done(function (data) {
                fn(data);
            });
        };
    };

    $("#pref-search").on("click", function () {
        var obj = {
            cardNumber: "901338181510001"
        };
        request.GET(obj, "getCustInfo", function (data) {
            renderInfo(data);
        });

    });
     var _policy;
    var listPolicy=new Array();
    renderInfo({});
   
    function renderInfo(data)
    {
        _policy=data;
        var columns = [
            {title: "ContractName", data: 'contractName'},
            {title: "contractNuber", data: 'contractNuber'},           
            {title: "CardType", data: 'cardType'},
             {title: "policyCode", data: 'policyCode'}
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
            if (columns[i].title==="policyCode")
            {
                columnDefs[i] = {
                    render: function (data, type, row) {
                      return '<select id="select_policy" >'+ '<option value="none">'+data+renderPolicy()+'</option>'+"</select>";
                    },
                    targets: i
                };
            }
        }
        var config = {
            data: data,
            columns: columns,
            columnDefs: columnDefs,
            order: [[0, "desc"]],
            paging: false,
            searching: false,
            destroy: true,
            info:false ,
            createdRow: function( row, data, dataIndex ) {               
            //  $(row).find("#select_policy").append(renderPolicy());
              
              $(row).find("#select_policy").change(function(e) {
                  var v=$(this).find(":selected").val();
                  data.policyCode=v;
              });
               
               
            }

        };
        $(document).ready(function () {
          var table=  $('#example').DataTable(config);
          table.on( 'draw', function () {            
        } );
        });
        
  

    }
    function renderPolicy()
    {
                
        var html='';
        
        for(var i=0;i<listPolicy.length;i++)
        {
         html+=  '<option value="'+listPolicy[i].code+'">'+listPolicy[i].policyName+'</option>';
        }        
        html+="";   
        
        return html;
        
    }
    function getPolicies()
    {
        var obj = {
            MachinhSach:"OCB_POLICY_CAT"
          };
        request.GET(obj, "getchinhsach", function (data) {
           listPolicy=data;
        });
    };    

    getPolicies();

    function updatePolicy(obj)
    {
        
          request.POST(obj[0],"updateClassifier",function(data){
              
                     alert(data);
               });   
        
    }
    $("#update").on("click", function () {
        updatePolicy(_policy);        
    });
});
