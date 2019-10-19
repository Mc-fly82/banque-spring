package com.formation.ms2i.tp.banque.controllers;

import com.formation.ms2i.tp.banque.entities.Client;
import com.formation.ms2i.tp.banque.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ClientRepository clientRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Home(ModelMap model) {
        List<Client> clients = clientRepository.findAll();
        model.put("clients", clients);
        return "home";
    }
}
