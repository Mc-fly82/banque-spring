package com.formation.ms2i.tp.banque.controllers;

import com.formation.ms2i.tp.banque.entities.Client;
import com.formation.ms2i.tp.banque.entities.Compte;
import com.formation.ms2i.tp.banque.repository.ClientRepository;
import com.formation.ms2i.tp.banque.repository.CompteRepository;
import com.formation.ms2i.tp.banque.request.ClientDepositRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    CompteRepository compteRepository;

    //list all
    @GetMapping("/clients")
    public List<Client> allClients() {
        return clientRepository.findAll();
    }

    //add client
    @PostMapping("/clients/{solde}")
    public void createClient(@RequestBody Client client, @PathVariable double solde) {
        client.addComptes(new HashSet(Arrays.asList(new Compte(solde))));
        clientRepository.save(client);
    }

    //deposit
    @PatchMapping("/clients/{id}/compte/{compteId}")
    public void createClient(@RequestBody ClientDepositRequest deposit, @PathVariable long id,
                             @PathVariable long compteId) {
        Optional<Compte> compteClient = compteRepository.findById(compteId);
        if (compteClient.isPresent()) {
            compteClient.get().credit(deposit.deposit);
            compteRepository.save(compteClient.get());
        }
    }

    //add account
    @PostMapping("/clients/{id}/compte")
    public void createClient(@RequestBody ClientDepositRequest deposit, @PathVariable long id) {
        Optional<Client> client = clientRepository.findById(id);
        if (client.isPresent()) {
            client.get().addComptes(new HashSet(Arrays.asList(new Compte(Math.abs(deposit.deposit)))));
            clientRepository.save(client.get());
        }
    }

}
