<%@ page language="java" pageEncoding="UTF-8" session="false" %>
<!-- Modal -->
<div class="modal fade" id="addUser" tabindex="-1" role="dialog" aria-labelledby="addUser"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Nouveau Client</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form id="modalSubmit">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="nom">Nom</label>
                        <input required type="text" class="form-control" name="nom" id="nom"
                               placeholder="">
                    </div>
                    <div class="form-group">
                        <label for="prenom">Prénom</label>
                        <input required type="text" class="form-control" name="prenom" id="prenom" placeholder="">
                    </div>
                    <div class="form-group">
                        <label for="adresse">Addrese</label>
                        <input required type="text" class="form-control" name="adresse" id="adresse"
                               placeholder="">
                    </div>
                    <div class="form-group">
                        <label for="codepostal">Code Postal</label>
                        <input required type="text" class="form-control" name="codepostal"
                               id="codepostal"
                               placeholder="">
                    </div>
                    <div class="form-group">
                        <label for="ville">Ville</label>
                        <input required type="text" class="form-control" name="ville" id="ville"
                               placeholder="">
                    </div>
                    <div class="form-group">
                        <label for="solde">Dépot</label>
                        <input value="500" required type="number" class="form-control" name="solde" id="solde"
                               placeholder="">
                    </div>
                    <div class="form-group">
                        <label for="motdepasse">Mot de passe</label>
                        <input required type="password" class="form-control" name="motdepasse" id="motdepasse"
                               placeholder="">
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>

                    <!-- new client -->
                    <button id="modal-submit" type="submit"  class="btn btn-primary" data-dismiss="modal">Créer</button>
                </div>
            </form>
        </div>
    </div>
</div>
