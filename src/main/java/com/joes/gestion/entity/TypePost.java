package com.joes.gestion.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypePost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    @OneToMany
    private List<Employe> employe;

    public TypePost(String description) {
        this.description = description;
    }

    public TypePost() {
    }

    public List<Employe> getEmploye() {
        return employe;
    }

    public void setEmploye(List<Employe> employe) {
        this.employe = employe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
