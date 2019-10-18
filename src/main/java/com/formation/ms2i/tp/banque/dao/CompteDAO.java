package com.formation.ms2i.tp.banque.dao;

import com.formation.ms2i.tp.banque.entities.Client;
import com.formation.ms2i.tp.banque.entities.Compte;
import com.formation.ms2i.tp.banque.util.BanqueException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CompteDAO {

	@Transactional(propagation= Propagation.REQUIRED , rollbackFor= BanqueException.class)
	public abstract void ajouterCompte(Compte compte) throws BanqueException;

	@Transactional(propagation= Propagation.MANDATORY)
	public abstract Compte rechercherCompteParNumero(Long numero) throws BanqueException;

//	@Transactional(propagation= Propagation.MANDATORY)
//	public abstract List<Compte> rechercherComptesClient(Client client) throws BanqueException;
//
	@Transactional(propagation= Propagation.REQUIRED , rollbackFor=BanqueException.class)
	public abstract void modifierCompte(Compte compte) throws BanqueException;

}
