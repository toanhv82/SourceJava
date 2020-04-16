<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value="/resources/css/menu.css" />" rel="stylesheet" type="text/css">
<script src="<c:url  value="/resources/js/jquery-3.4.1.min.js" />"   ></script>
<!--Navbar -->
<nav id="nav">

    <ul id="navigation">
        <li><a href="#" class="first">Home</a></li>
        <li><a href="#">Tool  &raquo;</a>
            <ul>
             
                <li><a href="#">Process Card and Account &raquo;</a>
                    <ul>
                        <li data-role="11"><a href="/OCB-CMS/Upload_card">Input</a></li>
                        <li data-role="12"><a href="/OCB-CMS/Approve_close_card">Authorize</a></li>
                        <li data-role="20"><a href="/OCB-CMS/Approve_close_card_ttt">Authorize-TTT</a></li>
                    </ul>
                </li>
                <li data-role="13"><a href="/OCB-CMS/Import_File_Card_Data">Insert data card dummy</a></li>
                <li ><a href="/OCB-CMS/policycard">Update Policy</a></li>
                <li style="display: none"><a href="#">Identity & Branding &raquo;</a>
                    <ul>
                        <li><a href="#">Business Cards</a></li>

                        <li data-role="14"><a href="/OCB-CMS/policycard">Update Policy</a></li>
                        <li style=""><a href="#">Approve</a></li>

                        <li style=""><a href="/OCB-CMS/policycard">Upadre Policy</a></li>
                        <li style=""><a href="#">Approve</a></li>                        

                    </ul>					
                </li>					
            </ul>
        </li>
        <li style="display: none"><a href="#">Portfolio &raquo;</a>
            <ul>
                <li><a href="#">Graphic Design</a></li>
                <li><a href="#">Photography</a></li>
                <li><a href="#">Architecture</a></li>
                <li><a href="#">Calligraphy</a></li>
                <li><a href="#">Film &raquo;</a>
                    <ul>
                        <li><a href="#">John Carter</a></li>
                        <li><a href="#">The Avengers</a></li>
                        <li><a href="#">The Amazing SpiderMan</a></li>
                        <li><a href="#">Madagascar 3</a></li>
                    </ul>						
                </li>
                <li><a href="#">Graffity </a></li>
            </ul>				
        </li>
        <li style="display: none"><a href="#">Testimonials</a></li>
        <li style="display: none"><a href="#">Blog</a></li>
        <li><a href="#" class="last">Admin &raquo;</a>
            <ul>
                <li><a href="#">Create User</a></li>
                <li><a href="#">Permission</a></li>

            </ul>
        </li>
    </ul>
</nav>
<script type="text/javascript">
     var p=new Array();
     var i=0;
    <c:forEach var="item" items="${permission}">
      p[p.length]='${item}';
    </c:forEach>
        
   var data=$("#nav").find(`[data-role]`);
   for(var i=0;i<data.length;i++)
   {
     var r=  $(data[i]).attr("data-role");     
     //r=Number(r);
     if(p.indexOf(r)<0)
     {
         $(data[i]).hide();
     }     
   }
   
</script>