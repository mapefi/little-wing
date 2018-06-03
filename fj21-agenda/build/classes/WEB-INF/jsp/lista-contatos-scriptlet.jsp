<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*, 
    br.com.caelum.jdbc.ContatoDao,
    br.com.caelum.jdbc.modelo.Contato"
	import="java.text.SimpleDateFormat"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</HEAD>
<body>
	<table>

		<tr>
			<td>Nome</td>
			<td>Email</td>
			<td>Endereço</td>
			<td>Data de Nascimento</td>
		</tr>
		<%
			ContatoDao dao = new ContatoDao();
			List<Contato> contatos = dao.getLista();
			for (Contato contato : contatos) {
		%>
		<tr>
			<td><%=contato.getNome()%></td>
			<td><%=contato.getEmail()%></td>
			<td><%=contato.getEndereco()%></td>
			<%SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String strDate = sdf.format(contato.getDataNascimento().getTime());
		      %>
			<td><%=strDate%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>