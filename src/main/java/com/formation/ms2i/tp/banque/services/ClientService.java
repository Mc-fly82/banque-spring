package com.formation.ms2i.tp.banque.services;

import com.formation.ms2i.tp.banque.entities.Client;
import com.formation.ms2i.tp.banque.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> list() {
        return clientRepository.findAll();
    }
}
