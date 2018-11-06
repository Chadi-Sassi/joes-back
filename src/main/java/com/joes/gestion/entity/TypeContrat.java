package com.joes.gestion.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.util.List;

@Entity
public class TypeContrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idC;
    private String descriptionC;
    @OneToMany
    private List<Contrat> contrats;

    public TypeContrat(int idC, String descriptionC) {
        this.idC = idC;
        this.descriptionC = descriptionC;
    }

    public TypeContrat() {
    }

    public List<Contrat> getContrats() {
        return contrats;
    }

    public void setContrats(List<Contrat> contrats) {
        this.contrats = contrats;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getDescriptionC() {
        return descriptionC;
    }

    public void setDescriptionC(String descriptionC) {
        this.descriptionC = descriptionC;
    }
}
