package com.formation.ms2i.tp.banque.controllers;

import com.formation.ms2i.tp.banque.entities.Compte;
import com.formation.ms2i.tp.banque.repository.ClientRepository;
import com.formation.ms2i.tp.banque.repository.CompteRepository;
import com.formation.ms2i.tp.banque.request.TransferRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CompteController {

    @Autowired
    CompteRepository compteRepository;

    @Autowired
    ClientRepository clientRepository;

    //wiretransfer
    @PostMapping("/comptes/virement")
    public void transfer(@RequestBody TransferRequest transfer) {
        System.out.println(transfer);
        Optional<Compte> credit = compteRepository.findById(transfer.creditId);
        Optional<Compte> debit = compteRepository.findById(transfer.debitId);
        if (credit.isPresent() && debit.isPresent()) {
            credit.get().credit(transfer.amount);
            debit.get().debit(transfer.amount);
            compteRepository.save(credit.get());
            compteRepository.save(debit.get());
        }
    }

}
