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

		<form action="/cientifico" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		
		<hr>
		
		<c:if test="${not empty msg}">
			<div class="alert alert-success">
			  <strong>Sucesso!</strong> ${msg}
			</div>
		</c:if>

		<c:if test="${not empty cientificos}">
			<h4>Quantidade de livros cient�ficos existentes: ${cientificos.size()}!!!</h4>
			
			<hr>
	
			<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>Id</th>
		        <th>T�tulo</th>
		        <th>Autor</th>
		        <th>Valor do Aluguel</th>
		        <th>Usado</th>
		        <th>Ramo</th>
		        <th>Volumes</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>		    
		    	<c:forEach var="d" items="${cientificos}">
			      <tr>
			        <td>${d.id}</td>
			        <td>${d.titulo}</td>
			        <td>${d.autor}</td>
			        <td>${d.valorAluguel}</td>
			        <td>${d.usado}</td>
			        <td>${d.ramo}</td>
			        <td>${d.volumes}</td>
			        <td><a href="/cientifico/${d.id}/excluir">Excluir</a></td>
			      </tr>
		    	</c:forEach>
		    </tbody>
		  	</table>
	  	</c:if>
	  	
	  	<c:if test="${empty cientificos}">
			<h4>N�o existem livros cient�ficos cadastrados!</h4>
	  	</c:if>
	</div>
</body>
</html>