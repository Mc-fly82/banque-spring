<%@ page language="java" pageEncoding="UTF-8" session="false" %>
<style>
    .th-w{
        width: 2vw;
    }
    .th-w-20{
        width: 20vw;
    }
    .th-w-10{
        width: 10vw;
    }
    .th-w-15{
        width: 15vw;
    }
</style>
<h3>Clients</h3>
<table class="table">
    <thead>
    <tr>
        <th class="th-w">#</th>
        <th class="th-w">Prénom</th>
        <th class="th-w">Nom</th>
        <th class="th-w-20">Adresse</th>
        <th class="th-w">Code postal</th>
        <th class="th-w">Ville</th>
        <th class="th-w"></th>
        <th class="th-w">N° de Compte</th>
        <th class="th-w-10">Solde</th>
        <th class="th-w-15">Action</th>
    </tr>
    </thead>
</table>
<div style="overflow: scroll;max-height: 50vh;">
    <table class="table">
        <tbody id="client-table">
        <c:forEach items="${clients}" var="c">
            <tr data-id="${c.getId()}" style="background-color:lightgray;">
                <th class="th-w">${c.getId()}</th>
                <td class="th-w">${c.getPrenom()}</td>
                <td class="th-w">${c.getNom()}</td>
                <td class="th-w-20">${c.getAdresse()}</td>
                <td class="th-w">${c.getCodepostal()}</td>
                <td class="th-w">${c.getVille()}</td>
                <td class="th-w"></td>
                <td class="th-w"></td>
                <td class="th-w-10"></td>
                <td class="th-w-15"><%@ include file="new-account-modal/modal-trigger.jsp" %></td>
            </tr>
            <c:forEach items="${c.comptes}" var="co">
                <tr>
                    <td class="th-w"></td>
                    <td class="th-w"></td>
                    <td class="th-w"></td>
                    <td class="th-w-20"></td>
                    <td class="th-w"></td>
                    <td class="th-w"></td>
                    <td class="th-w"></td>
                    <td class="th-w"> ${co.getId()}</td>
                    <td class="th-w-10">${co.getSolde()} €</td>
                    <td class="th-w-15"><%@ include file="deposit-on-account-modal/modal-trigger.jsp" %></td>
                </tr>
            </c:forEach>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@ include file="new-user-modal/modal-trigger.jsp" %>
