package tn.esprit.ds.ski_nada_namanizitouni.Services;

import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Moniteur;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteur();
    Moniteur addMoniteur (Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);

    void removeMoniteur(Long numMoniteur);
    Moniteur retrieveMoniteur(Long numMoniteur);
}
