<%@ page language="java" pageEncoding="UTF-8" session="false" %>
<div class="m-3" style="height: 15vh">
    <h3>Virements</h3>
    <form>
        <table class="table">
            <thead>
            <tr>
                <th scope="col"></th>
                <th scope="col">Compte à créditer</th>
                <th scope="col">Compte à débiter</th>
                <th scope="col">Montant</th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row"></th>
                <td>
                    <%@ include file="dropdown-credit.jsp" %>
                </td>
                <td>
                    <%@ include file="dropdown-debit.jsp" %>
                </td>
                <td><input value="500" id="amount" name="amount" type="number"></td>
                <td><button id="btn-virement" class="btn-primary" type="submit">Soumettre</button></td>
            </tr>
            </tbody>
        </table>
    </form>

</div>
