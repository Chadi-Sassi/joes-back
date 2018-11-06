package com.joes.gestion.controller;

import com.joes.gestion.entity.Employe;
import com.joes.gestion.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/Employes")
public class EmployeController {
    private final EmployeService employeService;

    @Autowired
    public EmployeController(EmployeService employeService) {
        this.employeService = employeService;
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Employe>  findAll(){

        return employeService.getAll();
    }
    @RequestMapping(method = RequestMethod.GET , value = "/{id}")
    public Employe get(@PathVariable  int id){
        return employeService.findEmployeById(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Employe add(@RequestBody Employe employe){
       return employeService.addEmploye(employe);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/{id}")
    public Employe update(@PathVariable int id , @RequestBody Employe employe){
        return employeService.updateEmploye(employe,id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public void delete(@PathVariable int id ){
        employeService.deleteEmplye(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/auth")
    public Employe auth(@RequestBody Employe employe){

        return employeService.login(employe.getLogin(),employe.getMdp());
    }


}
