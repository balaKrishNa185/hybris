<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1 align ="center">Manufacturer Details </h1><hr>
<br>
${saved}
 <form:form modelAttribute="Manufacturer" action="save" method="post" align="center">
         ID :<form:input path="id" />
        <br><br>
        Name :<form:input path="name" />  ${error}
        <br><br>
        Country:<form:input path="country" />
        <br><br>
       <input type="submit" value="Save"/>
       </form:form>

