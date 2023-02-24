package tn.esprit.ds.ski_nada_namanizitouni.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Inscription;
import tn.esprit.ds.ski_nada_namanizitouni.Services.IinscriptionService;

import java.util.List;

@RestController
@RequestMapping("inscription")
public class InscriptionController {
    @Autowired
    IinscriptionService iinscriptionService;

    @GetMapping("retrieveAllInscription")
    public List<Inscription> getAll(){
        return iinscriptionService.retrieveAllInscription();
    }

    @GetMapping("{numInscription}")
    public Inscription retrieveInscription(@PathVariable Long numInscription){
        return iinscriptionService.retrieveInscription(numInscription);
    }

    @PostMapping("addInscription")
    public Inscription addInscription(@RequestBody Inscription inscription){
        return iinscriptionService.addInscription(inscription);
    }

    @PutMapping("updateInscription")
    public Inscription updateInscription(@RequestBody Inscription inscription){
        return iinscriptionService.updateInscription(inscription);
    }

    @DeleteMapping("{numInscription}")
    public void removeInscription(@PathVariable Long numInscription){
        iinscriptionService.removeInscription(numInscription);
    }
}
