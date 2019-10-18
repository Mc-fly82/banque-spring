package com.formation.ms2i.tp.banque.dao;

import com.formation.ms2i.tp.banque.entities.Client;
import com.formation.ms2i.tp.banque.util.BanqueException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ClientDAO {

	@Transactional(propagation= Propagation.REQUIRED, rollbackFor=BanqueException.class)
	public abstract void ajouterClient(Client client) throws BanqueException;

	@Transactional(propagation= Propagation.MANDATORY)
	public abstract Client rechercherClientParId(Long id) throws BanqueException;

//	@Transactional(propagation= Propagation.MANDATORY)
//	public abstract List<Client> rechercherTousLesClients() throws BanqueException;
}
