<%@ page import="java.lang.*" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado de la operaci�n</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>El resultado de la operaci�n realizada por la calculadora CalculadoraAgust�n es:</h1>
	<%
		String resultado = request.getAttribute("result").toString();
	%>
	<%=resultado%>
	<br>
	<br>
	<a href="index.html">Volver a calcular</a>
	
	<h1>Codigo fuente en resultado.jsp. Primer Commit</h1>
	
	<h1>Mas c�digo fuente en resultado.jsp. Segundo commit</h1>
	
</body>
</html>