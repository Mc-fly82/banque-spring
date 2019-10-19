package com.formation.ms2i.tp.banque.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.formation.ms2i.tp.banque.entities.Compte;
import com.formation.ms2i.tp.banque.repository.ClientRepository;
import com.formation.ms2i.tp.banque.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompteController {

    @Autowired
    CompteRepository compteRepository;

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/comptes")
    public List<Compte> allComptes(String s) {
        return compteRepository.findAll();
    }

    @PostMapping("/comptes/{id}")
    public Object updateCompte(@PathVariable int id,@RequestBody Compte c) {
        Optional<Compte> compte = compteRepository.findById((long) id);
        compte.get().setSolde(c.getSolde());
        return compte;
    }

}
