package com.formation.ms2i.tp.banque;

import com.formation.ms2i.tp.banque.entities.Client;
import com.formation.ms2i.tp.banque.entities.Compte;
import com.formation.ms2i.tp.banque.repository.ClientRepository;
import com.formation.ms2i.tp.banque.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CompteRepository compteRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Client client = new Client();
        Compte compte1 = new Compte();
        Compte compte2 = new Compte();
        Compte compte3 = new Compte();


        compte1.setSolde(5000);
        compte2.setSolde(5000);

        client.setAdresse("zzz")
                .setCodepostal("1111")
                .setNom("marc")
                .setPrenom("flavisus")
                .setVille("mont")
                .addComptes(new HashSet(Arrays.asList(compte1,compte2)))
                .addComptes(new HashSet(Arrays.asList(compte3)));


        clientRepository.save(client);
        System.out.println(compteRepository.findAll());;
        System.out.println(compteRepository.findById( compte3.getId()));;
    }
}
