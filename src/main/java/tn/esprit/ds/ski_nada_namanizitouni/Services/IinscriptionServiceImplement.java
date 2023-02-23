package tn.esprit.ds.ski_nada_namanizitouni.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Inscription;
import tn.esprit.ds.ski_nada_namanizitouni.Repositories.InscriptionRepo;

import java.util.List;

@Service
public class IinscriptionServiceImplement implements IinscriptionService{
    @Autowired
    InscriptionRepo inscriptionRepo;
    @Override
    public List<Inscription> retrieveAllInscription() {
        return inscriptionRepo.findAll();
    }

    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepo.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepo.save(inscription);
    }

    @Override
    public void removeInscription(Long numInscription) {
        inscriptionRepo.deleteById(numInscription);
    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return inscriptionRepo.findById(numInscription).orElse(null);
    }
}
