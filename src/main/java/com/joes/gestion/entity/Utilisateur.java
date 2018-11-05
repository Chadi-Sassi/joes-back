package com.joes.gestion.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class Utilisateur {
    @Id

    public int cin;

    public String nom,prenom,adresse,login,mdp;
    public Date dateNaiss;
    public int tel;

    public Utilisateur(int cin, String nom, String prenom, String adresse, String login, String mdp, Date dateNaiss, int tel) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.login = login;
        this.mdp = mdp;
        this.dateNaiss = dateNaiss;
        this.tel = tel;
    }

    public Utilisateur() {
    }


}
