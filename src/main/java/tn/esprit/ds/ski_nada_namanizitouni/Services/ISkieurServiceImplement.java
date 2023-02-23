package tn.esprit.ds.ski_nada_namanizitouni.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Skieur;
import tn.esprit.ds.ski_nada_namanizitouni.Repositories.SkieurRepo;
import java.util.List;

@Service// telling him that it needs to be start accepting the injection // solves the issue of error of autowired
public class ISkieurServiceImplement implements ISkieurService{
    @Autowired // injection // it is depricated
    SkieurRepo skieurRepo; // injection
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepo.findAll();
    }
    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepo.save(skieur);
    }
    @Override
    public void removeSkieur(Long numSkieur) {

        skieurRepo.deleteById(numSkieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepo.save(skieur);
    }


    @Override
    public Skieur retrieveSkieur(Long numSkieur) {

        return skieurRepo.findById(numSkieur).orElse(null);
    }
}
