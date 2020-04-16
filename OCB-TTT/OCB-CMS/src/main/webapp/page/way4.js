/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$( document ).ready(function() {
    
    
    $("#btn_request").on("click", function () {
        
       var batch_id=$("#batch_id").val();
       request(batch_id);      
     
    });
     $("#Approve").on("click", function () {        
       var batch_id=$("#batch_id").val();
       approve(batch_id);      
     
    });
    
    var request = function (obj) {
        
           $.ajax({
                url: "../ws_way4",
                type: "GET",
                data:{batch_id:obj},
                async: false,
                success: function (data) {                    
                   var d=data;
                   $("#total").html(data.total);
                }
            }).done(function(data) {               
                var d=data;
              });;
       
    }
    var approve = function (obj) {
        
        var data={batch_id:obj};
           $.ajax({
                url: "../ws_way4",
                type: "POST",               
                data:data,
                async: false,
                success: function (data) {                    
                   var d=data;
                   $("#success").html(data.Success);
                }
            }).done(function(data) {               
                var d=data;
              });;
       
    }
});
