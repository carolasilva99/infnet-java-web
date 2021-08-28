<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TP3</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#">AluLivros</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="#">Home</a></li>
	      <c:if test="${not empty user}">
	      	  <li><a href="/solicitante/lista">Solicitante</a></li>
	      </c:if>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	      <c:if test="${empty user}">
		      <li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Cadastrar</a></li>
		      <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	      </c:if>
	      <c:if test="${not empty user}">
	      	  <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Sair, ${user.nome}</a></li>
	      </c:if>
	    </ul>
	  </div>
	</nav>

	<div class="container">
	  <h2>Cadastro de Solicitantes</h2>
	  <form action="/solicitante/incluir" method="post">

	    <div class="form-group">
	      <label>Nome:</label>
	      <input value="Carolina Alves" type="text" class="form-control" placeholder="Entre com o seu nome" name="nome">
	    </div>

	    <div class="form-group">
	      <label>E-mail:</label>
	      <input value="carolasilva99@gmail.com" type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
	    </div>

		  <div class="form-group">
			  <label>Telefone:</label>
			  <input value="(31)99361-6504" type="telefone" class="form-control" placeholder="Entre com o seu telefone" name="telefone">
		  </div>
		
	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>

</body>
</html>