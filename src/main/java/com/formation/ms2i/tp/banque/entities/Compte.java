package com.formation.ms2i.tp.banque.entities;

import javax.persistence.*;

@Entity
@Table(name="compte")
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero", unique = true, nullable = false)
	private long numero;

	@Column(name="solde")
	private double solde;

	@ManyToOne(targetEntity=Client.class)
	@JoinColumn(name="idclient")
	private Client client;

	public Compte(double solde) {
		this.solde = solde;
	}

	public Compte() {
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
