<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Manufacturer</title>
</head>
<br/>
<h1 align="center" >Manufacturer Details</h1>
<hr/>
<br/>
<body background="https://s18671.pcdn.co/wp-content/uploads/2017/10/Chemical-plants-cropped.jpg">
<div align="center">
    <table border="2" cellpadding="20" cellspacing="0" width="30">
        <tr>
            <th><marquee direction="right" scrolldelay="1"> ID </marquee></th>
            <th><marquee direction="right" scrolldelay="1">NAME</marquee></th>
            <th><marquee direction="right" scrolldelay="1">COUNTRY</marquee></th>
        </tr>
        <tr>
            <td>${data.id} </td>
            <td>${data.name} </td>
            <td>${data.country}</td>
        </tr>
    </table>
</div>
</body>
</html>