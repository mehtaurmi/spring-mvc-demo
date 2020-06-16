<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head><title>Student Registration Form</title></head>
	<body>
		<form:form action="processForm" modelAttribute="Student">
			FirstName: <form:input path="firstName"/><br><br>
			LastName: <form:input path="lastName"/><br><br>
			Country: <form:select path="country">
				<form:options items="${Student.countryCode}"></form:options>
			</form:select><br><br>
			C#:<form:radiobutton path="favLanguage" value="C#"/>
			Java:<form:radiobutton path="favLanguage" value="Java"/>
			PHP:<form:radiobutton path="favLanguage" value="PHP"/>
			C++:<form:radiobutton path="favLanguage" value="C++"/>
			Angular:<form:radiobutton path="favLanguage" value="Angular"/><br><br>
			Choose Operating System:
			Linux<form:checkbox path="operatingSystem" value="Linux"/>
			Mac OS<form:checkbox path="operatingSystem" value="Mac OS"/>
			Ms Windows<form:checkbox path="operatingSystem" value="Ms Windows"/>
			
			<br><br>
			
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>