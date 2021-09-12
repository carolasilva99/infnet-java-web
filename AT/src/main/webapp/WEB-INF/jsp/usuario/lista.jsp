<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

    <c:if test="${not empty lista}">
        <c:if test="${not empty msg}">
            <div class="alert alert-success">
                <strong>Sucesso!</strong> ${msg}
            </div>
        </c:if>

        <h4>Quantidade de usu�rios existentes: ${lista.size()}!!!</h4>

        <hr>

        <table class="table table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>E-mail</th>
                <th>Solicitantes</th>
                <th>Livros</th>
                <c:if test="${user.admin}">
                    <th></th>
                </c:if>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="u" items="${lista}">
                <tr>
                    <td>${u.id}</td>
                    <td>${u.nome}</td>
                    <td>${u.email}</td>
                    <td>${u.solicitantes.size()}</td>
                    <td>${u.livros.size()}</td>
                    <c:if test="${user.admin}">
                        <td><a href="/usuario/${u.id}/excluir">Excluir</a></td>
                    </c:if>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>

    <c:if test="${empty lista}">
        <h4>N�o existem usu�rios cadastrados!!!</h4>
    </c:if>
</div>
</body>
</html>