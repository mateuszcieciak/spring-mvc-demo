<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student confirmation form</title>
</head>

<body>

The Student is confirmed: ${student.firstName} ${student.lastName}
<br><br>

Country: ${student.country}
<br><br>

Favourite language: ${student.favouriteLanguage}
<br><br>

Operating systems:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>
<br><br>

</body>

</html>