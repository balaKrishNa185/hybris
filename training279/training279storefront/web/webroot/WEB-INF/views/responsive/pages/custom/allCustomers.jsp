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
                       <th>CREATION TIME</th>
                       <th>NAME</th>
                       <th>PHONE</th>
                       <th>Is NEW CUSTOMER</th>
                   </tr>
                   <c:forEach items="${allCustomers}" var="customers">
                       <tr>
                           <td>${customers.customerCreated} </td>
                           <td>${customers.name} </td>
                           <td>${customers.phone} </td>
                           <td>

                           <c:if test="${customers.newCustomer==true}">
                            <c:out value="new"/>
                           </c:if>
                           <c:if test="${customers.newCustomer==false}">
                            <c:out value="old"/>
                           </c:if>

                           </td>
                       </tr>
                       </c:forEach>
               </table>
           </div>
       </body>
       </html>