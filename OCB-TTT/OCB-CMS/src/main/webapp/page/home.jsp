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
              <jsp:include page="/menu" /> 
        </div>
        <div> 
            
        </div>
    </body>



</html>



