<%-- 
    Document   : cus_register
    Created on : Sep 23, 2019, 6:05:08 PM
    Author     : hiepnp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<title>
    Home Page
</title>
<link href="Styles/Site.css" rel="stylesheet" type="text/css" />
<link href="<c:url value="/resources/Styles/styles.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/bootstrap-4.3/css/bootstrap.min.css" />" rel="stylesheet" type="text/css">

<script src="<c:url  value="/resources/js/jquery-3.4.1.min.js" />"  ></script>

<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet" type="text/css"> 

<link href="<c:url value="/resources/css/data_table.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/jquery.dataTables.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/jquery.dataTables.min.css" />" rel="stylesheet" type="text/css"> 

<script type="text/javascript" charset="utf8" src="<c:url value="/resources/js/jquery.dataTables.js" />"></script>
<script type="text/javascript" charset="utf8" src="<c:url value="/resources/js/jquery.dataTables.min.js" />"></script>


<style>
    .color-text {
        color: blue;
        padding-left: 10px;
    }
    .padding-header{
        padding-left: 10px;
    }
    .username{
        border: 1px #008c44 solid;
        line-height: 1.35em;
        padding: 8px 20px;
        white-space: nowrap;
        position: relative;
    }
</style>

<style type="text/css">
    .header-margin-right {
        margin-right: 25px;
    }
</style>
 <meta charset="UTF-8">
</head>

<body>
   
        <div class="aspNetHidden">
            <input name="__EVENTTARGET" id="__EVENTTARGET" value="" type="hidden">
            <input name="__EVENTARGUMENT" id="__EVENTARGUMENT" value="" type="hidden">
        </div>
        <div id="wrap">
            <div class="page">
                <div class="header">
                    <div class="title">
                        <table width="100%">
                            <tbody><tr>
                                    <td rowspan="2">
                                        <img alt="logo" class="logo" src="<c:url value="/resources/images/logo.png"/>" style="width: 400px;"></td>
                                    <td></td>
                                    <td></td>
                                    <td align="right">
                                    </td>
                                </tr>
                                <tr>

                                    <td></td>
                                    <td></td>
                                    <td align="right">
                                        <span id="Label2" class="header-margin-right" style="color:#0071BA;font-size:12pt;font-weight:bold;font-style:italic;">TRUNG TÂM THẺ</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td rowspan="2">
                                        <h1 style="font-family: rockwell; margin-left: 69px; font-size: 35px; font-style: italic; color: darkcyan;">
                                            <b>CUSTOMER CARE </b>
                                        </h1>
                                    </td>
                                    <td></td>
                                    <td></td>
                                    <td align="right">
                                        <span id="Label3" class="header-margin-right" style="color:#044C83;">Hội sở chính: 41 &amp; 45 Lê Duẩn, Q1, Tp.HCM</span>
                                    </td>
                                </tr>
                                <tr>                                  
                                    <td align="right">
                                        <span id="Label5" class="header-margin-right" style="color:#044C83;">Fax: (84-8) 38 220 963</span>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="clear hideSkiplink" style="background-color: #008c44;height: 30px; color: white">
                        <a href="/OCB-CMS/home" class="username">Home</a>
                        <a href="/OCB-CMS/login" class="username">Login</a>
                        <a href="/OCB-CMS/logout" class="username">Logout</a>
                        <a align="right" class="username">User: ${user}</a>
                    </div>
                                    <div style="clear: left;">                 
                                    </div>
                                    <a id="NavigationMenu_SkipLink"></a>
                </div>
            </div>           
            <div class="clear">
            </div>
        </div>          
    </div>
    <div id="maskBoxes" class="" tabindex="-1" style="display: none;">
        <div id="maskBoxesFake"></div>
        <div class="maskBoxeContent">
            <div class="col-12">
                <div class="sk-wave">
                    <div class="sk-rect sk-rect1"></div>
                    <div class="sk-rect sk-rect2"></div>
                    <div class="sk-rect sk-rect3"></div>
                    <div class="sk-rect sk-rect4"></div>
                    <div class="sk-rect sk-rect5"></div>
                </div>
            </div>
            <span id="msgLoading"></span>
        </div>
    </div>

