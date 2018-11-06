package com.joes.gestion.controller;

import com.joes.gestion.entity.Contrat;
import com.joes.gestion.service.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ContratController {

    private final ContratService contratService;

    @Autowired
    public ContratController(ContratService contratService) {
        this.contratService = contratService;
    }


    @RequestMapping(value="/Contrats",method= RequestMethod.GET)
    public List<Contrat> getContrats(){

        return contratService.getContrats();
    }

    @RequestMapping(value="/Contrats/{c}",method=RequestMethod.GET)
    public Contrat find(@PathVariable int c) {
        return contratService.find(c);
    }

    @RequestMapping(value="/Contrats/{code}",method=RequestMethod.PUT)
    public Contrat update (@PathVariable int code , @RequestBody Contrat c) {

        return contratService.update(code, c);
    }

    @RequestMapping(value="/Contrats",method=RequestMethod.POST)
    public Contrat save(@RequestBody Contrat c) {
        return contratService.save(c);
    }

    @RequestMapping(value="/Contrats/{c}",method=RequestMethod.DELETE)
    public void delete (@PathVariable int c) {
        contratService.delete(c);
    }
}
