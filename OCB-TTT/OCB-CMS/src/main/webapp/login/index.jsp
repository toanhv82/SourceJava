<%-- 
    Document   : index
    Created on : Jul 24, 2019, 9:15:35 AM
    Author     : Win 10
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/bootstrap-4.3/css/bootstrap.min.css" />" rel="stylesheet" type="text/css">
<html>
    <body>
        <div>        
            <jsp:include page="/page/index.jsp" /> 
        </div>
        <div>
            
        </div>
        <div>
            <div class="wrapper fadeInDown">
                <div id="formContent" class="formContent">
                    <div class="fadeIn first">                       
                    </div>
                     Login Form 
                    <form  action="/OCB-CMS/submitLogin" method="post">
                        <input type="text" id="login" class="fadeIn second" name="userName" placeholder="User Name">
                        <input type="password" id="password" class="fadeIn third" name="password" placeholder="password">
                        <input type="submit" class="fadeIn fourth" value="Log In">
                    </form>

                     Remind Passowrd 
                    <div id="formFooter">
                       
                    </div>

                </div>
            </div>

        </div>
    </body>



</html>



