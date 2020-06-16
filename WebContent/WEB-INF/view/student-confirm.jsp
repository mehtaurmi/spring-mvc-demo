<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head><title>Student Confirmation</title></head>
	<body>
		Student Confirm: ${Student.firstName} ${Student.lastName}<br><br>
		
		Country: ${Student.country}<br><br>
		
		Language: ${Student.favLanguage}<br><br>
		OperatingSystem:<br>
		<ul>
			<c:forEach var="temp" items="${Student.operatingSystem}">
			<li>${temp}</li>
			</c:forEach>
		</ul>
	</body>
</html>