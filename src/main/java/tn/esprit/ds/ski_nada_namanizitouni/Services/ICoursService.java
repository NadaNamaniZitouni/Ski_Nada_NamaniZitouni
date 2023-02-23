package tn.esprit.ds.ski_nada_namanizitouni.Services;

import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCours();
    Cours addCours(Cours cours);
    Cours updateCours(Cours cours);


    void removeCours(Long numCours);

    Cours retrieveCours(Long numCours);
}


