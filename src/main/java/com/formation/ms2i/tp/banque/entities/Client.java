package com.formation.ms2i.tp.banque.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "clients")
public class Client {
    private static final long serialVerisonUID = 1L;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private Set<Compte> comptes = new HashSet<>();


    public Client() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String prenom;
    private String nom;
    private String adresse;
    private String codepostal;
    private String ville;
    private String motdepasse;


    public Set<Compte> getComptes() {
        return comptes;
    }

    public Client addComptes(Set<Compte> comptes) {
        this.comptes.addAll(comptes);
        return this;
    }


    public Client setId(Long id) {
        this.id = id;
        return this;
    }

    public Client setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public Client setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public Client setAdresse(String adresse) {
        this.adresse = adresse;
        return this;
    }

    public Client setCodepostal(String codepostal) {
        this.codepostal = codepostal;
        return this;
    }

    public Client setVille(String ville) {
        this.ville = ville;
        return this;
    }

    public Client setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
        return this;
    }

    public static long getSerialVerisonUID() {
        return serialVerisonUID;
    }

    public Long getId() {
        return id;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public String getVille() {
        return ville;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    @Override
    public String toString() {
        return "Client{" +
                ", id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", codepostal='" + codepostal + '\'' +
                ", ville='" + ville + '\'' +
                ", motdepasse='" + motdepasse + '\'' +
                '}';
    }
}
