<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">AluLivros</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <c:if test="${not empty user}">
                <li><a href="/solicitante/lista">Solicitante</a></li>
                <li><a href="/usuario/lista">Usuário</a></li>
                <li><a href="/literatura/lista">Literatura</a></li>
                <li><a href="/didatico/lista">Didático</a></li>
                <li><a href="/cientifico/lista">Científico</a></li>
            </c:if>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <c:if test="${empty user}">
                <li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Cadastrar</a></li>
                <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </c:if>
            <c:if test="${not empty user}">
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Sair, ${user.nome}!</a></li>
            </c:if>
        </ul>
    </div>
</nav>