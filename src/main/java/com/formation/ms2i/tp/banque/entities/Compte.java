package com.formation.ms2i.tp.banque.entities;

import javax.persistence.*;

@Entity
@Table(name = "comptes")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double solde;

    private int user_id;

    public Compte() {
    }

    public Compte(double solde) {
        this.solde = solde;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    public Compte setId(Long id) {
        this.id = id;
        return this;
    }

    public Compte setSolde(double solde) {
        this.solde = solde;
        return this;
    }

    public Compte credit(double amount) {
        this.solde += amount;
        return this;
    }
    public Compte debit(double amount) {
        this.solde -= amount;
        return this;
    }


    public Long getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                ", user_id=" + user_id +
                '}';
    }
}
