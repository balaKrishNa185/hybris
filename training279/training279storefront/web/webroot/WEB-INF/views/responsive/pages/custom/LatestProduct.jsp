<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Manufacturer</title>
</head>
<br/>
<h1 align="center" >product Details</h1>
<hr/>
<br/>
<body>
<div align="center">
    <table border="2" cellpadding="20" cellspacing="0" width="30">
        <tr>
            <th>CODE </th>
            <th>NAME</th>
            <th>MANUFACTURER</th>
        </tr>
        <c:forEach items="${data}" var="manufacturerDetails">
            <tr>
                <td>${manufacturerDetails.code} </td>
                <td>${manufacturerDetails.name} </td>
                <td>${manufacturerDetails.manufacturer}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>