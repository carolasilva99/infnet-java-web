<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="utf-8">
    <title>Java Web - AT</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container">
    <h2>Cadastro de Livros Did�ticos</h2>
    <form action="/didatico/incluir" method="post">

        <div class="form-group">
            <label>T�tulo:</label>
            <input type="text" value="Calculo 1" class="form-control"
                   placeholder="Entre com o t�tulo" name="titulo">
        </div>

        <div class="form-group">
            <label>Autor:</label>
            <input type="text" value="James Stewart" class="form-control" placeholder="Entre com o autor"
                   name="autor">
        </div>

        <div class="form-group">
            <label>Valor:</label>
            <input type="text" value="15" class="form-control" placeholder="Entre com o valor" name="valorAluguel">
        </div>

        <div class="form-group">
            <label>Usado:</label>
            <label class="checkbox-inline"><input type="checkbox" name="usado" checked>Sim</label>
        </div>

        <div class="form-group">
            <label>Disciplina:</label>
            <input type="text" value="Calculo" class="form-control" placeholder="Entre com a disciplina"
                   name="disciplina">
        </div>

        <div class="form-group">
            <label>S�rie:</label>
            <input type="text" value="Faculdade" class="form-control" placeholder="Entre com a s�rie" name="serie">
        </div>

        <div class="form-group">
            <label>Conservado:</label>
            <label class="checkbox-inline"><input type="checkbox" name="conservado" checked>Sim</label>
        </div>

        <button type="submit" class="btn btn-default">Cadastrar</button>
    </form>
</div>

</body>
</html>