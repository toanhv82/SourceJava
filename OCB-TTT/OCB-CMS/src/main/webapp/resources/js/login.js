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
       var user=$("#user_id").val();
       var pw=$("#pw").val();  
       
       var obj={
           user:user,pw:pw          
       }
       request(obj);
    });
    
    var request = function (obj) {
        
           $.ajax({
                url: "../login",
                type: "POST",
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
    var isLogin=false;
    var login = function (obj) {        
        var data={batch_id:obj};
           $.ajax({
                url: "/OCB-CMS/loginCMS",
                type: "GET",               
                data:data,
                async: false,
                success: function (data) {                    
                  
                  isLogin=data.status;
                  
                }
            }).done(function(data) {               
                isLogin=data.status;
              });;
       
    };    
    
    var checkLogin=function()
    {
        login();   
        
        if(isLogin)
        {
            setTimeout(function(){ checkLogin(); }, 30000);
        }else
        {
           window.location.href = 'login/';
        }
        
    };
    checkLogin();
    
});
