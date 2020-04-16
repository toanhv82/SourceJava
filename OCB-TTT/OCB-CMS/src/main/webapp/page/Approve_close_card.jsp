<%-- 
    Document   : index
    Created on : Jul 24, 2019, 9:15:35 AM
    Author     : Win 10
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="<c:url  value="/resources/js/jquery-3.4.1.min.js" />"  ></script>
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/data_table.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/jquery.dataTables.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/jquery.dataTables.min.css" />" rel="stylesheet" type="text/css">
<!--<link href="<c:url value="/resources/css/dataTables.bootstrap.min.css" />" rel="stylesheet" type="text/css">-->
<script type="text/javascript" charset="utf8" src="<c:url value="/resources/js/jquery.dataTables.js" />"></script>
<script type="text/javascript" charset="utf8" src="<c:url value="/resources/js/jquery.dataTables.min.js" />"></script>
<script src="<c:url  value="/resources/bootstrap-4.3/js/bootstrap.min.js" />"  ></script>
<link href="<c:url value="/resources/bootstrap-4.3/css/bootstrap.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/bootstrap-4.3/css/bootstrap.min.css" />" rel="stylesheet" type="text/css">
<script src="<c:url  value="/resources/js/approve.js" />"  ></script>

<body>
    <div>   
        <jsp:include page="/page/index.jsp" /> 
    </div>
    <div class="wrapper">
        <div style="width: 80%">
            <div class="container" style="padding-left: 0px">
                <div class="row">
                    <div id="filter-panel" class="filter-panel">
                        <div class="panel panel-default">
                            <div class="panel-body">
                                <form class="form-inline" role="form">
                                    <div class="form-group">
                                        <label class="filter-col" style="margin-right:0;" for="pref-perpage">
                                            Status:
                                        </label>
                                        <select id="perpage_status" class="form-control">
                                            <option value="N">New</option>
                                            <option value="">ALL</option>                                           
                                            <option value="Y">Authorized</option>
                                            <option value="F">Fail</option>
                                            <option value="R">Reject</option>
                                        </select>                                
                                    </div>
                                    <div class="form-group">
                                        <label class="filter-col" style="margin-right:0;" for="pref-perpage">
                                            Type:
                                        </label>
                                        <select id="perpage_type" class="form-control">
                                            <option value="">ALL</option>
                                            <option value="CARD">CARD</option>
                                            <option value="ACCOUNT">ACCOUNT</option>
                                        </select>                                
                                    </div>
                                    <div class="form-group">
                                        <label class="filter-col" style="margin-right:0;" for="pref-search">BATCH_ID:</label>
                                        <input type="text" style="width: 130px; padding: 0" class="form-control input-sm" id="batch_id">
                                    </div>
                                    <div class="form-group">
                                        <label class="filter-col" style="margin-right:0;" for="pref-search">FROM_DATE</label>
                                        <input type="date" class="form-control input-sm" id="from_id">
                                    </div>
                                    <div class="form-group">
                                        <label class="filter-col" style="margin-right:0;" for="pref-search">TO_DATE</label>
                                        <input type="date" class="form-control input-sm" id="to_id">
                                    </div>
                                    <!-- form group [search] -->
                                    <div class="form-group">
                                        <button type="button" class="btn btn-primary" id="pref-search" data-target="#filter-panel">
                                            <span class="glyphicon glyphicon-cog"></span> Search
                                        </button>
                                    </div>
                                </form>
                            </div>
                        </div>

                    </div>    

                </div>

            </div>    
        </div>
        <div  style="width: 80%;font-size: small" id="div_table">
            <table id="table_CARD" cellpadding="0" cellspacing="0" border="0" class="display"  class="display">
            </table> 
        </div>
    </div>
    <div class="container">
        <div style="display: inline-block;">
            <button type="button" class="btn btn-danger" id="reject">
                <span class="glyphicon glyphicon-adjust"></span> Từ chối
            </button>
        </div>
        <div style="display: inline-block;">
            <button type="button" class="btn btn-success" id="report">
                <span class="glyphicon glyphicon-adjust" ></span> Xuất danh sách
            </button>
        </div>
        <div style="padding: 20px; display: inline-block;">
            <button type="button" class="btn btn-primary" id="close_account">
                <span class="glyphicon glyphicon-adjust" ></span> Thanh lý thẻ
            </button>
        </div>

    </div>
<!--    <div id="form_form">   
        <%--<jsp:include page="/page/modal-form.jsp" />--%> 
    </div>-->
</body>



