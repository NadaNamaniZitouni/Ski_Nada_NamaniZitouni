package tn.esprit.ds.ski_nada_namanizitouni.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Skieur;
import tn.esprit.ds.ski_nada_namanizitouni.Services.ISkieurService;
import tn.esprit.ds.ski_nada_namanizitouni.Services.ISkieurServiceImplement;

import java.util.List;

@RestController // conntrolleur qui expose les web service rest// indique qu'ill jou le role d'un rest controller
@RequestMapping("skieur")

public class SkieurController {
    @Autowired
    ISkieurService iSkieurService;
    //localhost:9090/retrieveAllSkieurs
    @GetMapping("retrieveAllSkieurs")
    public List<Skieur> getAll(){
        return iSkieurService.retrieveAllSkieurs();
    }
    @GetMapping("{numSkieur}")
    public Skieur retrieveSkieur (@PathVariable Long numSkieur){
        return iSkieurService.retrieveSkieur(numSkieur);
    }
    //localhost:9090/addSkieur
    @PostMapping("addSkieur")

    public Skieur addSkieur(@RequestBody Skieur skieur){
        return iSkieurService.addSkieur(skieur);}
    //localhost:9090/updateSkieur
    @PutMapping("updateSkieur")

    public Skieur updateSkieur(@RequestBody Skieur skieur){
        return iSkieurService.updateSkieur(skieur);}
    @DeleteMapping("{numSkieur}")
    public void removeSkieur(@PathVariable Long numSkieur){
        iSkieurService.removeSkieur(numSkieur);
    }

    @PutMapping("{numSkieur}{numPiste}")
    public Skieur assignSkierToPiste(@PathVariable Long numSkieur,@PathVariable Long numPiste){
        return iSkieurService.assignSkierToPiste(numSkieur, numPiste);
    }

    @PutMapping("{numSkieur}{numAbon}")
    public Skieur AssignSkierToSubscription(long numSkieur, long numAbon) {
        return iSkieurService.AssignSkierToSubscription(numSkieur, numAbon);
    }

}
