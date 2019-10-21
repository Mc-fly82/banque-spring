<%@ page language="java" pageEncoding="UTF-8" session="false" %>
<script src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.19.0/axios.min.js"></script>
<script type="application/javascript">
	//setup
	var newClient = $("#modal-submit")
	var wireTransfer = $("#btn-virement")
	var setCurrentAccountAndCurrentClientOnDepositAction = $(".depot")
	var setCurrentAccountOnAddAccountAction = $(".add-account")
	var newAccount = $("#new-account-modal-submit")
	var deposit = $("#deposit-on-account-modal-submit")
	var currentAccountId
	var currentClientId

	//setCurrentAccountOnDepositAction - event
	setCurrentAccountAndCurrentClientOnDepositAction.on('click', function () {
		currentAccountId = $(this).data("account-id")
		currentClientId = $(this).data("client-id")
	})
	//setCurrentAccountOnDepositAction - event
	setCurrentAccountOnAddAccountAction.on('click', function () {
		currentClientId = $(this).data("client-id")
	})

	//newClient
	newClient.on('click', function (e) {
		e.preventDefault()
		var depot = parseInt($("#solde").val()) || 0
		var data = {
			nom: $('#nom').val(),
			prenom: $('#prenom').val(),
			adresse: $('#adresse').val(),
			codepostal: $('#codepostal').val(),
			ville: $('#ville').val(),
			motdepasse: $('#motdepasse').val(),
		}
		if (Object.keys(data).some(function (_) {
			return data[_] === ""
		})) {
			alert('Un ou plusieurs champs vide')
			return
		}

		axios.post("/clients/" + depot, data).then(function () {
			location.reload()
		}, function (err) {
			alert(err)
		})
	})

	//wireTransfer
	wireTransfer.on('click', function (e) {
		e.preventDefault();
		var credit = parseInt($('#creditId').val()) || 0
		var debit = parseInt($('#debitId').val()) || 0
		var amount = parseInt($('#amount').val()) || 0
		if (credit === debit) {
			alert('Le compte de crédit est identique au compte de débit. Réésayez.')
			return
		}
		axios.post("/comptes/virement", {
			creditId: credit,
			debitId: debit,
			amount: amount
		}).then(function () {
			alert('Compte ' + credit + ' crédité ' + 'compte ' + debit + ' débité.')
			location.reload()
		}, function (err) {
			alert(err)
		})
	})

	//deposit
	deposit.on('click', function (e) {
		e.preventDefault()
		var deposit = parseInt($("#depot").val()) || 0
		if (deposit < 0) {
			alert('Dépot ne peut pas étre négatif.')
			return
		}
		axios.patch("/clients/" + currentClientId + "/compte/" + currentAccountId, {
			deposit: deposit
		}).then(function () {
			alert('Compte ' + currentAccountId + ' crédité de ' + deposit + ' €.')
			location.reload()
		}, function (err) {
			alert(err)
		})
	})

	//addAccount
	newAccount.on('click', function (e) {
		e.preventDefault();
		var deposit = parseInt($("#added-account-deposit").val()) || 0
		if (deposit < 0) {
			alert('Dépot ne peut pas étre négatif.')
			return
		}
        axios.post("/clients/" + currentClientId + "/compte", {
	        deposit: deposit
		}).then(function () {
			alert('Compte créé et crédité de ' + deposit + ' €.')
			location.reload()
		}, function (err) {
			alert(err)
		})
	})

</script>
