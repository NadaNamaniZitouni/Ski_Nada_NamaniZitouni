package tn.esprit.ds.ski_nada_namanizitouni.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Cours;
import tn.esprit.ds.ski_nada_namanizitouni.Services.ICoursService;

import java.util.List;

@RestController
@RequestMapping("cours")
public class CoursController {
    @Autowired
    ICoursService iCoursService;

    @GetMapping("retrieveAllCours")
    public List<Cours> getAll(){
        return iCoursService.retrieveAllCours();
    }

    @GetMapping("{numCours}")
    public Cours retrieveCours(@PathVariable Long numCours){
        return iCoursService.retrieveCours(numCours);
    }

    @PostMapping("addCours")
    public Cours addCours(@RequestBody Cours cours){
        return iCoursService.addCours(cours);
    }

    @PutMapping("updateCours")
    public Cours updateCours(@RequestBody Cours cours){
        return iCoursService.updateCours(cours);
    }

    @DeleteMapping("{numCours}")
    public void removeCours(@PathVariable Long numCours){
        iCoursService.removeCours(numCours);
    }
}
