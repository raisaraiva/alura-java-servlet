<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/salva" var="salva"/>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">

		<title>Java Servlet - criar empresa</title>
	</head>

	<body>
		<form action="${salva}" method="post">
			Nome: <input type="text" name="nome"/>

			Data Abertura: <input type="text" name="data"/>

			<input type="submit"/>
		</form>
	</body>
</html>