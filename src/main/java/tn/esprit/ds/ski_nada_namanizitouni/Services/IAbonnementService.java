package tn.esprit.ds.ski_nada_namanizitouni.Services;

import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Abonnement;

import java.util.List;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnement();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement(Abonnement abonnement);


    void removeAbonnement(Long numAbon);

    Abonnement retrieveAbonnement(Long numAbon);
}
