<%@ page language="java" pageEncoding="UTF-8" session="false" %>
<h3>Clients</h3>
<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Prénom</th>
        <th scope="col">Nom</th>
        <th scope="col">Adresse</th>
        <th scope="col">Code postal</th>
        <th scope="col">Ville</th>
        <th scope="col">Solde</th>
    </tr>
    </thead>
    <tbody id="client-table">
    <jsp:useBean id="clients" scope="request" type="java.util.List" />
    <c:forEach items="${clients}" var="c">
        <tr data-id="${c.getId()}">
            <th scope="row">${c.getId()}</th>
            <td>${c.getPrenom()}</td>
            <td>${c.getNom()}</td>
            <td>${c.getAdresse()}</td>
            <td>${c.getCodepostal()}</td>
            <td>${c.getVille()}</td>
            <td id="client-table-solde">0</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<%@ include file="modal/modal-trigger.jsp" %>

