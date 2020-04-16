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
                   Batch Id:<h4 id="batch_id">${batch_id}</h4>
                </div>
                <div  class="formContent">
                   Total:<h4 id="total">${total}</h4>
                </div>
                <div  class="formContent">
                   Successful:<h4 id="success">${total}</h4>
                </div>
                <div id="formContent" class="formContent">
                   Processing...<h4>${success}</h4>
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
             _get({},"get_progress",function(data){      
                
                if(data.UPLOAD_STATUS===false)
                {
                    _isProgress=false;
                     $("#formContent").html("Done");                     
                     $("#batch_id").html(data.PROGRESS_UPLOAD.BATCH_ID);  
                     $("#total").html(data.PROGRESS_UPLOAD==undefined?"0":data.PROGRESS_UPLOAD.TOTAL);
                     $("#success").html(data.PROGRESS_UPLOAD==undefined?"0":data.PROGRESS_UPLOAD.SUCCESS);  
                     $(".btn-primary").show();
                }else
                {
                     $("#total").html(data.PROGRESS_UPLOAD_TOTAL==undefined?"1":data.PROGRESS_UPLOAD_TOTAL);                    
                    $("#formContent").html("Processing ... ");
                    $("#success").html(data.PROGRESS_UPLOAD==undefined?"0":data.PROGRESS_UPLOAD);
                }                 
        
             });
             
             
        };
        getProgress();
        </script>
    </body>



</html>



