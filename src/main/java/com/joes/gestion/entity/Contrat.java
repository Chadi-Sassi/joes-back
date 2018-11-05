package com.joes.gestion.entity;

import javax.persistence.*;

@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codec;
    private String debutC;
    private String finC;
    @ManyToOne
    private Employe employe;
    @ManyToOne
    private TypeContrat typeContrat;


    public Contrat(int codec, String debutC, String finC) {
        this.codec = codec;
        this.debutC = debutC;
        this.finC = finC;
    }

    public Contrat() {
    }

    public int getCodec() {
        return this.codec;
    }

    public void setCodec(int codec) {
        this.codec = codec;
    }

    public String getDebutC() {
        return this.debutC;
    }

    public void setDebutC(String debutC) {
        this.debutC = debutC;
    }

    public String getFinC() {
        return this.finC;
    }

    public void setFinC(String finC) {
        this.finC = finC;
    }



}
