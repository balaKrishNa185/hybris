<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Manufacturer</title>
</head>
<br/>
       <h1 align="center" >Customer Details</h1>
       <hr/>
       <br/>
       <body>
           <div align="center">
               <table border="2" cellpadding="10" cellspacing="0" width="10">
                   <tr>
                       <th>UID</th>
                       <th>NAME</th>
                       <th>Is NEW CUSTOMER</th>
                   </tr>
                   <c:forEach items="${datas}" var="customers">
                       <tr>
                           <td>${customers.uid} </td>
                           <td>${customers.name} </td>
                           <td>${customers.isNewCustomer} </td>
                        </tr>
                       </c:forEach>
               </table>
           </div>
       </body>
       </html>