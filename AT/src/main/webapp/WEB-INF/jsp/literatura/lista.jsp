<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Web - AT</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">

		<form action="/literatura" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		
		<hr>
		
		<c:if test="${not empty msg}">
			<div class="alert alert-success">
			  <strong>Sucesso!</strong> ${msg}
			</div>
		</c:if>

		<c:if test="${not empty literaturas}">
			<h4>Quantidade de livros de literatura existentes: ${literaturas.size()}!!!</h4>
			
			<hr>
	
			<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>Id</th>
		        <th>T�tulo</th>
		        <th>Autor</th>
		        <th>Valor do Aluguel</th>
		        <th>Usado</th>
		        <th>G�nero</th>
		        <th>Idioma</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>		    
		    	<c:forEach var="d" items="${literaturas}">
			      <tr>
			        <td>${d.id}</td>
			        <td>${d.titulo}</td>
			        <td>${d.autor}</td>
			        <td>${d.valorAluguel}</td>
			        <td>${d.usado}</td>
			        <td>${d.genero}</td>
			        <td>${d.idioma}</td>
			        <td><a href="/literatura/${d.id}/excluir">Excluir</a></td>
			      </tr>
		    	</c:forEach>
		    </tbody>
		  	</table>
	  	</c:if>
	  	
	  	<c:if test="${empty literaturas}">
			<h4>N�o existem livros de literatura cadastrados!</h4>
	  	</c:if>
	</div>
</body>
</html>