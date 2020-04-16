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
            <div>
                <img style="width: 800px;padding-bottom: 20px;" src='<c:url value="/resources/img/header.PNG"></c:url>' /> 
                </div>
                <div>

                <c:choose>
                    <c:when test="${result==''}">
                        <div class="inline">
                            <img class="imgs" src='<c:url value="/resources/icon/ocbicon.PNG"></c:url>'/>
                            <b class="fontl">Kính gửi: Quý khách hàng ${Name}</b>
                        </div>
                        <br/><br/>
                        <p class="fontm ">Trung Tâm Thẻ ngân hàng TMCP Phương Đông (OCB) xác nhận thông tin khách</p>
                        <p class="fontm ">hàng đăng ký mở thẻ tín dụng như sau:</p>
                        <div class="inline">
                            <img class="imgs" src='<c:url value="/resources/icon/ocbicon.PNG"></c:url>'/>
                            <b class="fontl">Tên chủ thẻ: ${Name}</b>
                        </div>
                        <br/><br/><br/>
                        <div class="inline">
                            <img class="imgs" src='<c:url value="/resources/icon/ocbicon.PNG"></c:url>'/>
                                <b class="fontl">Loại thẻ: MC</b>
                            </div>
                            <br/><br/>      
                            <p class="fontm">Quý khách hàng vui lòng bấm vào nút Submit bên dưới để hoàn tất thủ tục đăng ký:</p> 
                            <div>
                                <form style="text-align: center;" action="/OCB-API/WS-TTT-FLC/updateStatus" method="post">
                                    <input type="hidden" name="requestId" value="${id}" />          
                                <input style="height: 40px;width: 100px;background-color: green;color: red;font-size: 20;
                                       font-weight: 600;" type="submit" value="Submit" />
                            </form>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <h1 style="color: red; text-align: center">${result}</h1>
                    </c:otherwise>
                </c:choose>

                <br/><br/><br/>
                <p class="padright font16">Trân trọng thông báo</p>
                <p class="padright font15"><b>Trung Tâm Thẻ - OCB</b></p>
            </div>   
            <div>
                <img style="width: 800px;" src='<c:url value="/resources/img/footer.PNG"></c:url>' /> 
            </div>
        </div>
    </body>
</html>
