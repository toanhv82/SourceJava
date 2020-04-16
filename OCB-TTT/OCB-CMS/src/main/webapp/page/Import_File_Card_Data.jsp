<%-- 
    Document   : index
    Created on : Jul 24, 2019, 9:15:35 AM
    Author     : Win 10
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="<c:url  value="/resources/js/jquery-3.4.1.min.js" />"   ></script>
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/bootstrap-4.3/css/bootstrap.min.css" />" rel="stylesheet" type="text/css">
<!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">-->

<html>
    <body>
        <div>        
            <jsp:include page="/page/index.jsp" /> 
        </div>
        <div>
            <div class="wrapper fadeInDown">
                <div id="formContent">
                    <form enctype="multipart/form-data"  method="post" onsubmit="return Validate(this);">
                    <div class="fadeIn first">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="inputGroupFileAddon01">Upload</span>
                            </div>
                            <div >
                                <input type="file"  name="file" id="inputGroupFile01" >                              
                            </div>
                        </div>                   
                        
                    </div>                    
                    <div id="formFooter">
                         <div>
                            <button class="btn btn-primary" type="submit">Import</button>                            
                        </div>
                    </div> 
                  </form>
                </div>
            </div>

        </div>
       
    </body>
</html>



