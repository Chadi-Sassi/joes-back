package com.joes.gestion.service;

import com.joes.gestion.dao.DossierRepository;
import com.joes.gestion.entity.Dossier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class DossierService {
    private final DossierRepository dossierRepository;

    @Autowired
    public DossierService(DossierRepository dossierRepository) {
        this.dossierRepository = dossierRepository;
    }


    public List<Dossier> getDossiers(){
        return dossierRepository.findAll();
    }

    public Dossier find(int d) {
        return dossierRepository.findById(d).isPresent()? dossierRepository.findById(d).get():null;
    }


    public Dossier update (int code ,  Dossier d) {

        return dossierRepository.save(d);
    }


    public Dossier save(Dossier d) {


        return dossierRepository.save(d);
    }

    public void delete (int d) {
        dossierRepository.deleteById(d);
    }
}

