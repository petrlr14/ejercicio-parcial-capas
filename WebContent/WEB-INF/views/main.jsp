<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${pageContext.request.contextPath}/add" method="post">
		<label>
			Importancia
			<select name="importancia">
				<c:forEach items="${importancia}" var="imp">
					<option value="${imp.iportanciaId}" >${imp.importancia}</option>
				</c:forEach>
			</select>
		</label>
		<input name="nombre" type="text" placeholder="nombre">
		<input name="apellido" type="text" placeholder="apellido">	
		<input name="nit" type="text" placeholder="NIT">
		<input type="submit" value="Guardar">
	</form>
	<form action="${pageContext.request.contextPath}/all" method="get">
		<input type="submit" value="Ver Contribuyentes">
	</form>
</body>
</html>