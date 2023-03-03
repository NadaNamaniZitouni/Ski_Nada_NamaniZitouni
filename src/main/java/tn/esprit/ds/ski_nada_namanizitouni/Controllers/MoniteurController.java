package tn.esprit.ds.ski_nada_namanizitouni.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Moniteur;
import tn.esprit.ds.ski_nada_namanizitouni.Services.IMoniteurService;

import java.util.List;

@RestController
@RequestMapping("moniteur")
public class MoniteurController {
    @Autowired
    IMoniteurService iMoniteurService;

    @GetMapping("retrieveAllMoniteur")
    public List<Moniteur> getAll(){
        return iMoniteurService.retrieveAllMoniteur();
    }

    @GetMapping("{numMoniteur}")
    public Moniteur retrieveMoniteur (@PathVariable Long numMoniteur){
        return iMoniteurService.retrieveMoniteur(numMoniteur);
    }

    @PostMapping("addMoniteur")
    public Moniteur addMoniteur (@RequestBody Moniteur moniteur){
        return iMoniteurService.addMoniteur(moniteur);
    }

    @PutMapping("updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur){
        return iMoniteurService.updateMoniteur(moniteur);
    }

    @DeleteMapping("{numMoniteur}")
    public void removeMoniteur(@PathVariable Long numMoniteur){
        iMoniteurService.removeMoniteur(numMoniteur);
    }

    @PostMapping("{numCours}")
    public Moniteur addInstructorAndAssignToCourse(@RequestBody Moniteur moniteur,@PathVariable Long numCours){
        return iMoniteurService.addInstructorAndAssignToCourse(moniteur, numCours);
    }
}
