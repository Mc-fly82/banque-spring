    <label>
        <select id="debitId">
            <c:forEach items="${clients}" var="c">
                <optgroup label="${c.getPrenom()} ${c.getNom()}">
                    <c:forEach items="${c.comptes}" var="co">
                        <option  value="${co.getId()}">${co.getId()}</option>
                    </c:forEach>
                </optgroup>
            </c:forEach>
        </select>
    </label>
