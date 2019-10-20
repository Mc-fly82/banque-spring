<%@ page language="java" pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>TP Marc FLAVIUS</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<body>
<div class=" text-center">
    <h1>Banque</h1>
    <p>Gestion</p>
</div>
<jsp:useBean id="clients" scope="request" type="java.util.List" />
<%@ include file="new-user-modal/modal.jsp" %>
<%@ include file="new-account-modal/modal.jsp" %>
<%@ include file="deposit-on-account-modal/modal.jsp" %>

