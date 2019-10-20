<%@ page language="java" pageEncoding="UTF-8" session="false" %>
<script src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.19.0/axios.min.js"></script>
<script type="application/javascript">

	var openAccount = $("#modal-submit")
	var wireTransfer = $("#btn-virement")
	var depositOnAccountModalSubmit = $("#deposit-on-account-modal-submit")
	var newAccountModalSubmit = $("#new-account-modal-submit")

	openAccount.on('click', function (e) {
		e.preventDefault()
		axios.post("/clients/" + $("#solde").val(), {
			nom: $('#nom').val(),
			prenom: $('#prenom').val(),
			adresse: $('#adresse').val(),
			codepostal: $('#codepostal').val(),
			ville: $('#ville').val(),
			motdepasse: $('#motdepasse').val(),
		}).then(function () {
			location.reload()
		}, function (err) {
			alert(err)
		})
	})
	wireTransfer.on('click', function (e) {
		e.preventDefault();
		var credit = $('#creditId').val()
		var debit = $('#debitId').val()
		var amount = $('#amount').val()
		if (credit === debit) {
			alert('Le compte de crédit est identique au compte de débit. Réésayez8')
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

	depositOnAccountModalSubmit.on('click', function (e) {
		alert('ok')
	})

	newAccountModalSubmit.on('click', function (e) {
		alert('ok')
	})

</script>
