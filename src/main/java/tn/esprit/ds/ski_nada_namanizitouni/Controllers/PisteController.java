package tn.esprit.ds.ski_nada_namanizitouni.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Piste;
import tn.esprit.ds.ski_nada_namanizitouni.Services.IPisteService;

import java.util.List;

@RestController
@RequestMapping("piste")
public class PisteController {
    @Autowired
    IPisteService iPisteService;

    @GetMapping("retrieveAllPiste")
    public List<Piste> getAll(){
        return iPisteService.retrieveAllPiste();
    }

    @GetMapping("{numPiste}")
    public Piste retrievePiste(@PathVariable Long numPiste){
        return iPisteService.retrievePiste(numPiste);
    }

    @GetMapping("addPiste")
    public Piste addPiste(@RequestBody Piste piste){
        return iPisteService.addPiste(piste);
    }

    @GetMapping("updatePiste")
    public Piste updatePiste(@RequestBody Piste piste){
        return iPisteService.updatePiste(piste);
    }

    @GetMapping("{numPiste}")
    public void removePiste(@PathVariable Long numPiste){
        iPisteService.removePiste(numPiste);
    }
}
