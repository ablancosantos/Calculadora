<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora cient�fica</title>
<link href="WEB-INF/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>Esta es la calculadora cient�fica de CalculadoraAgust�n</h1>
		<h3>Version de Marcos</h3>
	<div align="center">
		<table>
			<tr>
				<td>Indicar los n�meros a utilizar en la operaci�n</td>
			</tr>
			<tr>
				<td>
					<form action="calculo" method="post">
						<table>
							<tr>
								<td>N�mero A:</td>
								<td><input type="text" size="20" name="numa"></td>
							</tr>
							<tr>
								<td>Numero B:</td>
								<td><input type="text" size="20" name="numb"></td>
							</tr>
							<tr>
								<td><input type="submit" value="sumar" name="operacion">
								</td>
								<td><input type="submit" value="restar" name="operacion">
								</td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>
		
	</div>
</body>
</html>