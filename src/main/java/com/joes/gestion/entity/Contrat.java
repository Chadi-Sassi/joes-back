package com.joes.gestion.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codec;
    private Date debutC;
    private Date finC;
    @ManyToOne
    private Employe employe;
    @ManyToOne
    private TypeContrat typeContrat;


    public Contrat(int codec, Date debutC, Date finC) {
        this.codec = codec;
        this.debutC = debutC;
        this.finC = finC;
    }

    public Contrat() {
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public TypeContrat getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(TypeContrat typeContrat) {
        this.typeContrat = typeContrat;
    }

    public int getCodec() {
        return this.codec;
    }

    public void setCodec(int codec) {
        this.codec = codec;
    }

    public Date getDebutC() {
        return this.debutC;
    }

    public void setDebutC(Date debutC) {
        this.debutC = debutC;
    }

    public Date getFinC() {
        return this.finC;
    }

    public void setFinC(Date finC) {
        this.finC = finC;
    }



}
