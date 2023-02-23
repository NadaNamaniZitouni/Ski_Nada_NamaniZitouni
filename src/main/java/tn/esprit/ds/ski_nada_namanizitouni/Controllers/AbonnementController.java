package tn.esprit.ds.ski_nada_namanizitouni.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Abonnement;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Skieur;
import tn.esprit.ds.ski_nada_namanizitouni.Services.IAbonnementService;

import java.util.List;

@RestController
@RequestMapping("abonnement")
public class AbonnementController {
    @Autowired
    IAbonnementService iAbonnementService;
    @GetMapping("retrieveAllAbonnement")
    public List<Abonnement> getAll(){

        return iAbonnementService.retrieveAllAbonnement();
    }

    @GetMapping("{numAbon}")
    public Abonnement retrieveAbonnement (@PathVariable Long numAbon){
        return iAbonnementService.retrieveAbonnement(numAbon);
    }

    @PostMapping("addAbonnement")

    public Abonnement addAbonnement(@RequestBody Abonnement abonnement){
        return iAbonnementService.addAbonnement(abonnement);
    }

    @PutMapping("updateAbonnement")

    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement){
        return iAbonnementService.updateAbonnement(abonnement);
    }

    @DeleteMapping("{numAbon}")
    public void removeAbonnement(@PathVariable Long numAbon){
        iAbonnementService.removeAbonnement(numAbon);
    }

}
