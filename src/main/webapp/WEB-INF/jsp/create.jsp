<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ page language="java" pageEncoding="UTF-8" session="false" %>
<%@ include file="components/header.jsp" %>
<div class="container">
    <div class="row">
        <div class="col-sm-12">
            <%@ include file="components/clients.jsp" %>
        </div>
        <div class="col-sm-8">
            <%@ include file="components/virements.jsp" %>
        </div>
    </div>
</div>
<%@ include file="components/footer.jsp" %>
