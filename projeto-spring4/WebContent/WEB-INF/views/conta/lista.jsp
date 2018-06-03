<%@ page language="java"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dth">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista</title>
<script src="resources/js/jquery.js"></script>

<script type="text/javascript">
  function pagaAgora(id) {
    $.post("pagaConta", {'id' : id}, function() {
      alert("Conta paga com sucesso");
      var tdLinkPagar = document.querySelector("#conta_"+id);
      tdLinkPagar.innerHTML = tdLinkPagar.innerHTML.replace("Pagar agora!","Paga!");
    });
  }  
</script>

</head>
<body>

	<table>
		<tr>
			<th>Código</th>
			<th>Decrição</th>
			<th>Valor</th>
			<th>Tipo</th>
			<th>Pago?</th>
			<th>Data de Pagamento</th>
			<th>Ações</th>
		</tr>

		<c:forEach items="${todasContas}" var="conta">
			<tr>
			<!-- <td>${conta.id}</td> -->
				<td id="conta_${conta.id}"><c:if test="${conta.paga eq false}">
						<a href="#" id="conta_${conta.id}" onClick="pagaAgora(${conta.id})"> Pagar agora! </a>
					</c:if> 
					<c:if test="${conta.paga eq true }">
    					Paga!
 					</c:if></td>
				<td>${conta.descricao}</td>
				<td>${conta.valor}</td>
				<td>${conta.tipo}</td>
			<!-- 	<td><c:if test="${conta.paga eq false}">
						Não paga
					</c:if> <c:if test="${conta.paga eq true}">
						Paga
					</c:if></td>  -->
				<td><fmt:formatDate value="${conta.dataPagamento.time}"
						pattern="dd/MM/yyyy" /></td>

				<td><a href="removeConta?id=${conta.id }">Deletar</a></td>

				<td><a href="mostraConta?id=${conta.id }">Alterar</a></td>

	<!-- 		<c:if test="${conta.paga eq false }">
					<td><a href="#" onclick="pagaAgora(${conta.id});">Pagar</a></td>
				</c:if>  -->	
			</tr>
		</c:forEach>
		<tr>
			<td><a href="efetuaLogout">Logout</a></td>
		</tr>
	</table>

</body>
</html>