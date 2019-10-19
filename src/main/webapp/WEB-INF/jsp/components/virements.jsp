<%@ page language="java" pageEncoding="UTF-8" session="false" %>
<div class="m-3">
    <h3>Virements</h3>
    <form action="">
        <table class="table">
            <thead>
            <tr>
                <th scope="col"></th>
                <th scope="col">Client à créditer</th>
                <th scope="col">Client à débiter</th>
                <th scope="col">Montant</th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row"></th>
                <td>
                    <%@ include file="dropdown.jsp" %>
                </td>
                <td>
                    <%@ include file="dropdown.jsp" %>
                </td>
                <td><input name="amount" type="number"></td>
                <td><button type="submit">Soumettre</button></td>
            </tr>
            </tbody>
        </table>
    </form>

</div>
