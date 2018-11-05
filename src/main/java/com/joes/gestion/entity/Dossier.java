package com.joes.gestion.entity;

import javax.persistence.*;

@Entity
public class Dossier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coded;
    private Boolean b3;
    private Boolean cnss;
    private Boolean diplome;
    private Boolean copieCarteCin;
    private Boolean etatDossier;
    @OneToOne
    private Employe employe;


    public Dossier(int coded, Boolean b3, Boolean cnss, Boolean diplome, Boolean copieCarteCin, Boolean etatDossier) {
        this.coded = coded;
        this.b3 = b3;
        this.cnss = cnss;
        this.diplome = diplome;
        this.copieCarteCin = copieCarteCin;
        this.etatDossier = etatDossier;
    }

    public Dossier() {
    }

    public int getCoded() {
        return this.coded;
    }

    public void setCoded(int coded) {
        this.coded = coded;
    }



    public Boolean getB3() {
        return b3;
    }

    public void setB3(Boolean b3) {
        this.b3 = b3;
    }

    public Boolean getCnss() {
        return cnss;
    }

    public void setCnss(Boolean cnss) {
        this.cnss = cnss;
    }

    public Boolean getDiplome() {
        return diplome;
    }

    public void setDiplome(Boolean diplome) {
        this.diplome = diplome;
    }


    public Boolean getCopieCarteCin() {
        return copieCarteCin;
    }

    public void setCopieCarteCin(Boolean copieCarteCin) {
        this.copieCarteCin = copieCarteCin;
    }

    public Boolean getEtatDossier() {
        return etatDossier;
    }

    public void setEtatDossier(Boolean etatDossier) {
        this.etatDossier = etatDossier;
    }
}
