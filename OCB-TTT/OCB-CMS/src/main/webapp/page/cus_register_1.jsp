<%-- 
    Document   : cus_register
    Created on : Sep 23, 2019, 6:05:08 PM
    Author     : hiepnp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link type="text/css" id="bootstrap-css" rel="stylesheet" href="<c:url value="/resources/css/style.css" />" > 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="page">
            <p class="fontm">Quý khách hàng vui lòng bấm vào nút</p> 
            <div>
                <form style="text-align: center;" enctype="multipart/form-data" 
                      action="/OCB-CMS/upLoadFileUpdate" method="post">
                    <input type="file" name="file" title="Chọn File Import" size="60" />                      
                <input style="height: 40px;width: 100px;background-color: green;color: red;font-size: 20;
                       font-weight: 600;" type="submit" value="Submit" />
            </form>
        </div>    

    </body>
</html>
