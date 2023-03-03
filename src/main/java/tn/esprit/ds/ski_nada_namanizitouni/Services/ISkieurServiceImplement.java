package tn.esprit.ds.ski_nada_namanizitouni.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.*;
import tn.esprit.ds.ski_nada_namanizitouni.Repositories.AbonnementRepo;
import tn.esprit.ds.ski_nada_namanizitouni.Repositories.InscriptionRepo;
import tn.esprit.ds.ski_nada_namanizitouni.Repositories.PisteRepo;
import tn.esprit.ds.ski_nada_namanizitouni.Repositories.SkieurRepo;
import java.util.List;

@Service// telling him that it needs to be start accepting the injection // solves the issue of error of autowired
public class ISkieurServiceImplement implements ISkieurService{
    @Autowired // injection // it is depricated
    SkieurRepo skieurRepo; // injection
    @Autowired
    PisteRepo pisteRepo;
    @Autowired
    AbonnementRepo abonnementRepo;
    @Autowired
    InscriptionRepo inscriptionRepo;
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

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        //1 -recuperation des objets
        Skieur skieur =  skieurRepo.findById(numSkieur).orElse(null);
        Piste piste = pisteRepo.findById(numPiste).orElse(null);
        // verification si les objects sont non null
        if(skieur!=null && piste!=null){
            //traitement
            //setPiste va ecraser les ancienne piste alors il vaut mieu recuperer la liste des pistes
            // avec getpiste  et puis ajouter une nouvelle piste
            piste.getSkieurs().add(skieur);
            /*List<Piste> pistes = skieur.getPiste();
            piste.add(piste);
            skieur.setPistes(piste)*/
            //save
            pisteRepo.save(piste);
        }
        return skieurRepo.findById(numSkieur).orElse(null);
    }

    @Override
    public Skieur AssignSkierToSubscription(long numSkieur, long numAbon) {
        Skieur skieur =  skieurRepo.findById(numSkieur).orElse(null);
        Assert.notNull(skieur, "skieur not found");
        Abonnement abonnement = abonnementRepo.findById(numAbon).orElse(null);
        Assert.notNull(abonnement, "abonnement not found");
        //if(skieur!=null && abonnement!=null) {
            skieur.setAbonnement(abonnement);
            return skieurRepo.save(skieur);
        //}
        //return null;
    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur) {
        return null;
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return null;
    }


}
