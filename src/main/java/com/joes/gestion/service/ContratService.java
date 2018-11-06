package com.joes.gestion.service;

import com.joes.gestion.dao.ContratRepository;
import com.joes.gestion.entity.Contrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratService {

    private final ContratRepository contratRepository;

    @Autowired
    public ContratService(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }


    public List<Contrat> getContrats(){

        return contratRepository.findAll();
    }


    public Contrat find(int c) {
        return contratRepository.findById(c).isPresent() ? contratRepository.findById(c).get(): null;
    }


    public Contrat update ( int code , Contrat c) {

        return contratRepository.save(c);
    }


    public Contrat save( Contrat c) {

        return contratRepository.save(c);
    }

    public void delete (int c) {
        contratRepository.deleteById(c);
    }

}

