package com.formation.ms2i.tp.banque.controllers;

import com.formation.ms2i.tp.banque.entities.Client;
import com.formation.ms2i.tp.banque.entities.Compte;
import com.formation.ms2i.tp.banque.repository.ClientRepository;
import com.formation.ms2i.tp.banque.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    CompteRepository compteRepository;

    @GetMapping("/clients")
    public List<Client> allClients() {
        return clientRepository.findAll();
    }

    @PostMapping("/clients")
    public Object createClient(@RequestBody Client client) {

        Compte compte = new Compte(0);
        clientRepository.save(client);
        compte.setClient(client);
        compteRepository.save(compte);
        return new Object() {
            public final long numerocompte = compte.getNumero();
        };

    }
}
