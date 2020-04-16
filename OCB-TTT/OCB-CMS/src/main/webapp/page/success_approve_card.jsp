<%-- 
    Document   : index
    Created on : Jul 24, 2019, 9:15:35 AM
    Author     : Win 10
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/bootstrap-4.3/css/bootstrap.min.css" />" rel="stylesheet" type="text/css">
<script src="<c:url  value="/resources/js/jquery-3.4.1.min.js" />"  ></script>
<html>
    <body>
        <div> 
            <jsp:include page="/page/index.jsp" /> 
        </div>
        <div>
            <div class="wrapper fadeInDown">
                <div  class="formContent">
                   Total:<h4 id="total">${total}</h4>
                </div>
                <div class="formContent">
                   Processing:<h4 id="process">${process}</h4>
                </div>
                <div  class="formContent">
                   Successful:<h4 id="success">${success}</h4>
                </div>
                <div  class="formContent">
                   Error:<h4 id="error">${error}</h4>
                </div>
                <div class="formContent">
                    <h3 id="content">${content}</h3>
                </div>
            </div> 
         </div>               
        
        <script type="text/javascript">
          
            var _isProgress=true;
            var _get = function (obj,url,fn)
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
        
        var getProgress=function()
        {
              $(".btn-primary").hide();
            
            if(_isProgress)
            {            
                 setTimeout(function(){ getProgress(); }, 1000);
             }
             _get({},"/OCB-CMS/get_progress",function(data){      
                
                if(data.PROCESS_CARD_STATUS===false)
                {
                    _isProgress=false;
                     $("#content").html("Done");                     
               
                     $("#total").html(data.PROCESS_CARD_UPLOAD==undefined?"0":data.PROCESS_CARD_UPLOAD.TOTAL);
                     $("#process").html(data.PROCESS_CARD_UPLOAD==undefined?"0":data.PROCESS_CARD_UPLOAD.TOTAL);
                     $("#success").html(data.PROCESS_CARD_UPLOAD==undefined?"0":data.PROCESS_CARD_UPLOAD.SUCCESS);  
                     $("#error").html(data.PROCESS_CARD_UPLOAD==undefined?"0":data.PROCESS_CARD_UPLOAD.ERROR);
                     $(".btn-primary").show();
                }else
                {
                     $("#total").html(data.PROGRESS_UPLOAD_TOTAL==undefined?"0":data.PROGRESS_UPLOAD_TOTAL);                    
                    $("#process").html(data.PROCESS_CARD_UPLOAD==undefined?"0":data.PROCESS_CARD_UPLOAD);
                    $("#success").html(data.PROCESS_CARD_UPLOAD==undefined?"0":data.PROCESS_CARD_UPLOAD.SUCCESS);
                    $("#error").html(data.PROCESS_CARD_UPLOAD==undefined?"0":data.PROCESS_CARD_UPLOAD.ERROR);
                    $("#content").html("Processing ... "); 
                }                
        
             });
             
             
        };
        getProgress();
        </script>
    </body>



</html>



