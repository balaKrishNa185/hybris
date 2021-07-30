<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Manufacturer</title>
</head>
<br/>
<h1 align="center" >Production Details</h1>
<hr/>
<br/>
<body>
<div align="center">
    <table border="2" cellpadding="20" cellspacing="0" width="30">
        <tr>
            <th> ID </th>
            <th>NAME</th>
            <th>COUNTRY</th>
        </tr>
        <c:forEach items="${allDetailsproduction}" var="manufacturerDetails">
            <tr>
                <td>${manufacturerDetails.id} </td>
                <td>${manufacturerDetails.name} </td>
                <td>${manufacturerDetails.country}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>