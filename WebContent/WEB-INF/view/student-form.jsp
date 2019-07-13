<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<
<html>
<head>

<title>student Registarton form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
First Name: <form:input path="firstname" />
<br></br>
Last Name :<form:input path="lastname"/>
<br></br>

country : <form:select path="country">
<form:options items="${student.countryOptions}"></form:options>


</form:select>
<br></br>

favourite language:
java<form:radiobutton path="favouriteLanguage" value="java"/>
C<form:radiobutton path="favouriteLanguage" value="C"/>
javaScript<form:radiobutton path="favouriteLanguage" value="javaScript"/>

<br><br>

operatingSystem: 
linux <form:checkbox path="operatingSystems" value="linux"/>
Windows <form:checkbox path="operatingSystems" value="Windows"/>
ios <form:checkbox path="operatingSystems" value="ios"/>

<br><br>

<input type="submit" value="Submit"/>

	</form:form>

</body>
</html>
