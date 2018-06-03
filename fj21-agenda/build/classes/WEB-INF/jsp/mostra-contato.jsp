<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Contato</title>
</head>
<body>
    <c:import url="cabecalho.jsp" />

	<form action="mvc?logica=AlteraContatoLogic&id=${contato.id}" method="POST">
		Nome: <input type="text" name="nome" value="${contato.nome}"/><br /> 
		E-mail: <input type="text" name="email" value="${contato.email}"/><br /> 
		Endereço: <input type="text" name="endereco" value="${contato.endereco}"/><br /> 
		Data Nascimento: <input type="text" name=dataNascimento value="<fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" />"/><br /> 
		<input type="submit" value="Gravar"/>
	</form>
	<c:import url="rodape.jsp" />
</body>
</html>