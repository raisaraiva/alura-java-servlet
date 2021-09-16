<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">

		<title>Java Servlet - lista de empresas</title>
	</head>

	<body>
		<c:if test="${not empty empresa}">
			Empresa ${ empresa } cadastrada com sucesso!

			<br/>
		</c:if>

		Lista de empresas:

		<br/>

		<ul>
			<c:forEach items="${empresas}" var="empresa">
				<li>
					${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>

					<a href="/servlet/visualiza?id=${empresa.id}">edita</a>

					<a href="/servlet/remove?id=${empresa.id}">remove</a>
				</li>
			</c:forEach>

			<c:if test="${empty empresas}">
				Nenhuma empresa cadastrada.
			</c:if>
		</ul>

		<br/>

		Para adicionar uma nova empresa clique <a href="cria">aqui</a>!
	</body>
</html>



