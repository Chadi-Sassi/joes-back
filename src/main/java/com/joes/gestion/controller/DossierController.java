package com.joes.gestion.controller;

import com.joes.gestion.entity.Dossier;
import com.joes.gestion.service.DossierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DossierController {
    private final DossierService dossierService;

    @Autowired
    public DossierController(DossierService dossierService) {
        this.dossierService = dossierService;
    }

    @RequestMapping(value="/Dossiers",method= RequestMethod.GET)
    public List<Dossier> getDossiers(){
        return dossierService.getDossiers();
    }
    @RequestMapping(value="/Dossiers/{d}",method=RequestMethod.GET)
    public Dossier find(@PathVariable int d) {
        return dossierService.find(d);
    }

    @RequestMapping(value="/Dossiers/{code}",method=RequestMethod.PUT)
    public Dossier update (@PathVariable int code , @RequestBody Dossier d) {

        return dossierService.update(code, d);
    }

    @RequestMapping(value="/Dossiers",method=RequestMethod.POST)
    public Dossier save(@RequestBody Dossier d) {


        return dossierService.save(d);
    }
    @RequestMapping(value="/Dossiers/{d}",method=RequestMethod.DELETE)
    public void delete (@PathVariable int d) {
        dossierService.delete(d);
    }
}
