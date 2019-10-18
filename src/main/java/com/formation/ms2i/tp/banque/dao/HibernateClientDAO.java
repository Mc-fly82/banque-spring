package com.formation.ms2i.tp.banque.dao;

import com.formation.ms2i.tp.banque.entities.Client;
import com.formation.ms2i.tp.banque.util.BanqueException;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import java.util.List;

public class HibernateClientDAO implements ClientDAO {

	private SessionFactory sessionFactory;


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void ajouterClient(Client client) throws BanqueException {
		try {
			 sessionFactory.getCurrentSession().persist(client);
		 } catch (HibernateException e) {
			 e.printStackTrace();
			 throw new BanqueException("Erreur d'ajout du client");
		 }
	}

	public Client rechercherClientParId(Long id) throws BanqueException {
		try {
			 return (Client) sessionFactory.getCurrentSession().load(Client.class, new Long(id));
		 } catch (HibernateException e) {
			 throw new BanqueException("Erreur de recherche du client");
		 }
	}

//	public List<Client> rechercherTousLesClients() throws BanqueException {
//			String hql = "from Client as c";
//		try {
//			return  sessionFactory.getCurrentSession().createQuery(hql).list();
//		 } catch (HibernateException e) {
//			 throw new BanqueException("Erreur recherche des clients");
//		 }
//	}
}
