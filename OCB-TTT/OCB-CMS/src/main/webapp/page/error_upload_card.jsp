<%-- 
    Document   : index
    Created on : Jul 24, 2019, 9:15:35 AM
    Author     : Win 10
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<html>
    <body>
        <div>        

            <jsp:include page="/page/index.jsp" /> 

        </div>
        <div>
            <div class="wrapper fadeInDown">
                <div id="formContent">
                   <h4>Result:  ${result}</h4>
                </div>
                 <button class="btn btn-primary" type="submit">HOME</button>
            </div>
                
         
            </div>

        </div>
    </body>



</html>



