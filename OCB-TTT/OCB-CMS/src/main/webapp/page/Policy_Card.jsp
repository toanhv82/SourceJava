<%-- 
    Document   : Update_S
    Created on : Jul 24, 2019, 9:15:35 AM
    Author     : Win 10
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="<c:url  value="/resources/js/jquery-3.4.1.min.js" />"  ></script>

<script src="<c:url  value="/resources/js/policyCard/view_info.js" />"  ></script>
<link href="<c:url value="/resources/css/data_table.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/jquery.dataTables.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/css/jquery.dataTables.min.css" />" rel="stylesheet" type="text/css">
<!--<link href="<c:url value="/resources/css/dataTables.bootstrap.min.css" />" rel="stylesheet" type="text/css">-->
<script type="text/javascript" charset="utf8" src="<c:url value="/resources/js/jquery.dataTables.js" />"></script>
<script type="text/javascript" charset="utf8" src="<c:url value="/resources/js/jquery.dataTables.min.js" />"></script>

<!-- <script src="<c:url  value="/resources/bootstrap-4.3/js/bootstrap.min.js" />"  ></script> 
<link href="<c:url value="/resources/bootstrap-4.3/css/bootstrap.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/bootstrap-4.3/css/bootstrap.min.css" />" rel="stylesheet" type="text/css"> -->
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
                                        <label class="filter-col" style="margin-right:0;" for="pref-search">Account Number / Card Number:</label>
                                        <input type="text" style="width: 130px; padding: 0" class="form-control input-sm" name="inputcardnumber">
                                    </div>
                                    <!-- form group [search] -->
                                    <div class="form-group">
                                        <button  type="button" class="btn btn-primary" id="pref-search" data-target="#filter-panel">
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
        <div class="row form-group" style="width: 80%;font-size: small" id="div_table">
            <table id="example" class="display" style="width:80%" cellpadding="0" cellspacing="0" border="0" class="display">                
               
            </table>
        </div>
    </div>
    <div class="container">
        <button  type="button" class="btn btn-danger" id="update">
            <span class="glyphicon glyphicon-adjust" ></span> Update
        </button>
        <button type="button" class="btn btn-danger" id="report">
            <span class="glyphicon glyphicon-adjust" ></span> Back
        </button>
    </div>
</body>



