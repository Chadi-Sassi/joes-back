package com.joes.gestion.service;

import com.joes.gestion.dao.EmployeRepository;
import com.joes.gestion.entity.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class EmployeService {

    private final EmployeRepository employeRepository;

    @Autowired
    public EmployeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public List<Employe> getAll(){
        return employeRepository.findAll();
    }

    public Employe findEmployeById(int id){
        return employeRepository.findById(id).isPresent()? employeRepository.findById(id).get():null;
    }

    public Employe addEmploye(Employe employe){
        return employeRepository.save(employe);
    }

    public Employe updateEmploye(Employe employe, int id ){
        if(id!=employe.getCin()){
            employeRepository.deleteById(id);
        }
        return employeRepository.save(employe);
    }
    public void deleteEmplye(int id){
        employeRepository.deleteById(id);
    }

    public Employe login(String email,String pass){
        return getAll().stream().filter(user-> user.getLogin().equals(email)&& user.getMdp().equals(pass)).findAny().orElse(null);
    }

//    public List<Employe> oldEmployes(){
//
//        return getAll().stream().filter(user-> user.getContrat().stream().filter(contrat -> contrat.getFinC().compareTo(new Date())==))
//    }
}
