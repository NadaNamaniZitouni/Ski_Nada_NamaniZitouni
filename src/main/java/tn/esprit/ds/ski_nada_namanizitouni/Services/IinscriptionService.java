package tn.esprit.ds.ski_nada_namanizitouni.Services;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Inscription;

import java.util.List;

public interface IinscriptionService {
    List<Inscription> retrieveAllInscription();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);


    void removeInscription(Long numInscription);

    Inscription retrieveInscription(Long numInscription);
}
