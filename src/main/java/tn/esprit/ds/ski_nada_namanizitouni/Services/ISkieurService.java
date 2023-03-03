package tn.esprit.ds.ski_nada_namanizitouni.Services;

import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Skieur;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.TypeAbonnement;

import java.awt.*;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    Skieur updateSkieur(Skieur skieur);


    void removeSkieur(Long numSkieur);

    Skieur retrieveSkieur(Long numSkieur);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur AssignSkierToSubscription(long numSkieur, long numAbon);
    Skieur addSkierAndAssignToCourse(Skieur skieur);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
}
