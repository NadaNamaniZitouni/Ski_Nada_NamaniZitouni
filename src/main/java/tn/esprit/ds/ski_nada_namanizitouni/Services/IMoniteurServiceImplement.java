package tn.esprit.ds.ski_nada_namanizitouni.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Moniteur;
import tn.esprit.ds.ski_nada_namanizitouni.Repositories.MoniteurRepo;

import java.util.List;

@Service
public class IMoniteurServiceImplement implements IMoniteurService{
    @Autowired
    MoniteurRepo moniteurRepo;
    @Override
    public List<Moniteur> retrieveAllMoniteur() {
        return moniteurRepo.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public void removeMoniteur(Long numMoniteur) {
        moniteurRepo.deleteById(numMoniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepo.findById(numMoniteur).orElse(null);
    }
}
