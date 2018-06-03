<!-- efetua listagem a partir do displaytag -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="br.com.caelum.jdbc.modelo.Contato"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
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
	<jsp:useBean id="dao" class="br.com.caelum.jdbc.ContatoDao" />
	

		<%List<Contato> lista = dao.getLista();
		request.setAttribute("lista", lista);
		%>
	
<display:table name="lista">
  <display:column property="nome" title="Nome" />
  <display:column property="email" title="Email" />
  <display:column property="endereco" title="Endereço" />
  <display:column property="dataNascimento.time" title="Data de Nascimento"  format="{0,date,MM/dd/yyyy}"/>
</display:table>
	
	

<!-- 	
	<table>
		<tr>
			<td>Nome</td>
			<td>Email</td>
			<td>Endereço</td>
			<td>Data de Nascimento</td>
		</tr>
		<c:forEach var="contato" items="${dao.lista}" varStatus="id">
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
			</tr>
		</c:forEach>
	</table>  -->
	<c:import url="rodape.jsp" />
</body>
</html>

<!-- 	<c:if test="${not empty contato.email}">
						<a href="mailto:${contato.email}">${contato.email}</a>
					</c:if>
					<c:if test="${empty contato.email}">
						E-mail não informado
					</c:if> -->