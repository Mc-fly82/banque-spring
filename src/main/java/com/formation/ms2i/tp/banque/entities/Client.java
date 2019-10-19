package com.formation.ms2i.tp.banque.entities;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {

    public Client() {
    }

    public Client(String nom, String prenom, String adresse, String ville, String codepostal, String motdepasse) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.adresse = adresse;
        this.ville = ville;
        this.codepostal = codepostal;
        this.motdepasse = motdepasse;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private long id;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "nom")
    private String nom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "codepostal")
    private String codepostal;

    @Column(name = "ville")
    private String ville;

    @Column(name = "motdepasse")
    private String motdepasse;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", codepostal='" + codepostal + '\'' +
                ", ville='" + ville + '\'' +
                ", motdepasse='" + motdepasse + '\'' +
                '}';
    }


}
