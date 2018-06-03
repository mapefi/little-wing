<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Contatos JSTL</title>
</head>
<body>
    <c:import url="cabecalho.jsp" />
	<!-- cria o DAO -->
	<table>
		<tr>
			<td>Nome</td>
			<td>Email</td>
			<td>Endereço</td>
			<td>Data de Nascimento</td>
		</tr>
		<!-- percorre contatos montando as linhas da tabela -->
		<c:forEach var="contato" items="${contatos}">
			<tr>
				<td bgcolor="#${id.count % 2 == 0 ? 'aaee88' : '8A2BE2' }">${contato.nome}</td>
				<td bgcolor="#${id.count % 2 == 0 ? 'aaee88' : '8A2BE2' }">
					<c:choose>
						<c:when test="${not empty contato.email}">
							<a href="mailto:${contato.email}">${contato.email}</a>
						</c:when>
						<c:otherwise>
							E-mail não informado
						</c:otherwise>
					</c:choose>
				</td>
				<td bgcolor="#${id.count % 2 == 0 ? 'aaee88' : '8A2BE2' }">${contato.endereco}</td>
				<td bgcolor="#${id.count % 2 == 0 ? 'aaee88' : '8A2BE2' }">
					<fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" />
				</td>
				<td>
					<a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a>
				</td>
				<td>
					<a href="mvc?logica=MostraDadosLogic&id=${contato.id}&nome=${contato.nome}&email=${contato.email}&endereco=${contato.endereco}&dataNascimento=<fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/>">Alterar</a>
				</td>
			</tr>
		</c:forEach>
			<tr>
				<td>
					<a href="mvc?logica=MostraAdicionaLogic">Adiciona Contato</a>
				<td>
			</tr>
	</table>
	<c:import url="rodape.jsp" />
</body>
</html>

<!-- 	<c:if test="${not empty contato.email}">
						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:if>
					<c:if test="${empty contato.email}">
						E-mail não informado
					</c:if> -->