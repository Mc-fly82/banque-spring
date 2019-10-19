<script src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.19.0/axios.min.js"></script>
<script type="application/javascript">
	var userData = {}
	var compteData = {}

	function emptyForm() {
		$('#nom').val("")
		$('#prenom').val("")
		$('#adresse').val("")
		$('#codepostal').val("")
		$('#ville').val("")
		$('#motdepasse').val("")
		$('#solde').val("")
	}

	function appendNewClient(data) {
		console.log(data)
		$("#client-table")
			.append("<tr>\n" + "<th scope=\"row\">" + data.client.id + "</th>\n" + "<td>" + data.client.nom +
			        "</td>\n" + "<td>" + data.client.prenom + "</td>\n" + "<td>" + data.client.adresse + "</td>\n" +
			        "<td>" + data.client.codepostal + "</td>\n" + "<td>" + data.client.ville + "</td>\n" + "<td>" +
			        data.solde + "</td>\n" + "</tr>")
		$('#exampleModal').hide();
		emptyForm()
	}

	var modalBtn = $("#modal-submit");
	var aa = $('input[name="nom"]').val()

	function addClient(numerocompte, solde) {
		axios.post("/comptes/" + numerocompte, solde).then(function (res) {
			appendNewClient(res.data)
		}, function (err) {
			alert(err)
		})
	}

	modalBtn.on('click', function (e) {
		e.preventDefault()

		var data = {
			nom: $('#nom').val(),
			prenom: $('#prenom').val(),
			adresse: $('#adresse').val(),
			codepostal: $('#codepostal').val(),
			ville: $('#ville').val(),
			motdepasse: $('#motdepasse').val(),
		}
		axios.post("/clients", data).then(function (res) {
			addClient(res.data.numerocompte, {solde:$("#solde").val()})
		}, function (err) {
			alert(err)
		})
	})


</script>
