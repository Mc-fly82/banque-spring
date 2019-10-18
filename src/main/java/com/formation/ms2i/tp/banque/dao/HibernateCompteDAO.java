package com.formation.ms2i.tp.banque.dao;

import com.formation.ms2i.tp.banque.entities.Client;
import com.formation.ms2i.tp.banque.entities.Compte;
import com.formation.ms2i.tp.banque.util.BanqueException;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import java.util.List;

public class HibernateCompteDAO implements CompteDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void ajouterCompte(Compte compte) throws BanqueException {
		try {
			sessionFactory.getCurrentSession().persist(compte);
		} catch (HibernateException e) {
			e.printStackTrace();
			throw new BanqueException("Erreur d'ajout du compte");
		}
	}
	public Compte rechercherCompteParNumero(Long numero) throws BanqueException {
		try {
			return (Compte) sessionFactory.getCurrentSession().load(Compte.class, new Long(numero));
		} catch (HibernateException e) {
			throw new BanqueException("Erreur de recherche du compte");
		}
	}
//	public List<Compte> rechercherComptesClient(Client client) throws BanqueException {
//		try {
//			String sql = "from compte as c where c.client=?";
//			return sessionFactory.getCurrentSession().createQuery(sql).setEntity(1, client).list();
//		} catch (HibernateException e) {
//			throw new BanqueException("Erreur de recherche des comptes");
//		}
//	}
	public void modifierCompte(Compte compte) throws BanqueException {
		try {
			sessionFactory.getCurrentSession().merge(compte);
		} catch (HibernateException e) {
			throw new BanqueException("Erreur de modification du compte");
		}
	}
}
