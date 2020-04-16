<%-- 
    Document   : index
    Created on : Jul 24, 2019, 9:15:35 AM
    Author     : Win 10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link type="text/css" id="bootstrap-css" rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />" > 
<link type="text/css" id="bootstrap-css" rel="stylesheet" href="<c:url value="/resources/css/style.css" />" > 

<link type="text/css" id="bootstrap-css" rel="stylesheet" href="<c:url value="/resources/css/validate.css" />" > 
<script src="<c:url value="/resources/js/jquery-1.12.4-jquery.min.js" />"  type="text/javascript"></script>   
<script src="<c:url value="/resources/js/jquery.cookie.js" />"  type="text/javascript"></script>  

<link type="text/css"  rel="stylesheet" id="parsley-css" href="<c:url value="/resources/css/parsley.css" />" >      
<script src="<c:url value="/resources/js/bootstrap.min.js" />"  type="text/javascript"></script>  
<script src="<c:url value="/resources/js/mustache.min.js" />"  type="text/javascript"></script>
<script src="<c:url value="/resources/js/parsley.min.js" />"  type="text/javascript"></script>        
<script src="<c:url value="/resources/js/utilfn.js" />"  type="text/javascript"></script>        
<script src="<c:url value="/resources/js/def.js" />"  type="text/javascript"></script>     
<script src="<c:url value="/resources/js/common.js" />"  type="text/javascript"></script> 
<script src="activecard.js" type="text/javascript"></script> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Way 4 Post</title>
    </head>
    <body>       
        <div id="container">
          <div>
         <input type="button" value="Request" id="btn_request" >           
         <input type="text" id="batch_id">
         </div>            
         <div>
         <label>
             <span>Total:</span>
             <span id="total">0</span>             
         </label>           
         </div>
            <div>
                 <input type="button" value="Approve" id="Approve" >     
            </div>
            
            <div>
                   <span id="success">0</span>               
            </div>
         </div>
    </body>
</html>
