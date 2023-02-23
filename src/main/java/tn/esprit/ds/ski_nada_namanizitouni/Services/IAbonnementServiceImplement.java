package tn.esprit.ds.ski_nada_namanizitouni.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Abonnement;
import tn.esprit.ds.ski_nada_namanizitouni.Repositories.AbonnementRepo;

import java.util.List;

@Service
public class IAbonnementServiceImplement implements IAbonnementService{
    @Autowired
    AbonnementRepo abonnementRepo;
    @Override
    public List<Abonnement> retrieveAllAbonnement() {
        return abonnementRepo.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public void removeAbonnement(Long numAbon) {
        abonnementRepo.deleteById(numAbon);
    }

    @Override
    public Abonnement retrieveAbonnement(Long numAbon) {
        return abonnementRepo.findById(numAbon).orElse(null);
    }
}
