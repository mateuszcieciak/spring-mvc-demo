<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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

</body>

</html>