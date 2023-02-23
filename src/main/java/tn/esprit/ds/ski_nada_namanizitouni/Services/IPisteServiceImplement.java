package tn.esprit.ds.ski_nada_namanizitouni.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Piste;
import tn.esprit.ds.ski_nada_namanizitouni.Repositories.PisteRepo;

import java.util.List;

@Service
public class IPisteServiceImplement implements IPisteService{
    @Autowired
    PisteRepo pisteRepo;
    @Override
    public List<Piste> retrieveAllPiste() {
        return pisteRepo.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public void removePiste(Long numPiste) {
        pisteRepo.deleteById(numPiste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepo.findById(numPiste).orElse(null);
    }
}
