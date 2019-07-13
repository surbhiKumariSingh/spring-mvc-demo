<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation page</title>

</head>

<body>
	the student confirmed is : ${student.firstname } ${student.lastname }
	<br>
	<br> and this person belongs to : ${student.country }
	<br>
	<br> favourite Language : ${student.favouriteLanguage }

	<br>
	<br> opearting Systems

	<ul>

		<c:forEach var="temp" items="${student.operatingSystems}">
         <li>${temp}</li>

		</c:forEach>

	</ul>

	<br>
	<br>
</body>

</html>