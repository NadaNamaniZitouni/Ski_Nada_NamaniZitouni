package tn.esprit.ds.ski_nada_namanizitouni.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Moniteur;
import tn.esprit.ds.ski_nada_namanizitouni.Services.IMoniteurService;

import java.util.List;

@RestController
@RequestMapping
public class MoniteurController {
    @Autowired
    IMoniteurService iMoniteurService;

    @GetMapping("retrieveAllMoniteur")
    public List<Moniteur> getAll(){
        return iMoniteurService.retrieveAllMoniteur();
    }

    @GetMapping("{numMoniteur}")
    public Moniteur retrieveMoniteur (Long numMoniteur){
        return iMoniteurService.retrieveMoniteur(numMoniteur);
    }

    @GetMapping("addMoniteur")
    public Moniteur addMoniteur (Moniteur moniteur){
        return iMoniteurService.addMoniteur(moniteur);
    }

    @GetMapping("updateMoniteur")
    public Moniteur updateMoniteur(Moniteur moniteur){
        return iMoniteurService.updateMoniteur(moniteur);
    }

    @GetMapping("{numMoniteur}")
    public void removeMoniteur(@PathVariable Long numMoniteur){
        iMoniteurService.removeMoniteur(numMoniteur);
    }
}
