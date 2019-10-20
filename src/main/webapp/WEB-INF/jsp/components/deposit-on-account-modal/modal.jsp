<%@ page language="java" pageEncoding="UTF-8" session="false" %>
<!-- Modal -->
<div class="modal fade" id="accountDeposit" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Dépot</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form id="modalSubmit">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="nom">Somme</label>
                        <input required type="text" class="form-control" name="nom" id="nom"
                               placeholder="">
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>

                    <!-- Create User -->
                    <button id="deposit-on-account-modal-submit" type="submit" class="btn btn-primary"
                            data-dismiss="modal">Cr
                        éer</button>
                </div>
            </form>
        </div>
    </div>
</div>
