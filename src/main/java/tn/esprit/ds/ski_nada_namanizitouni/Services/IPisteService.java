package tn.esprit.ds.ski_nada_namanizitouni.Services;

import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPiste();
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);

    void removePiste(Long numPiste);
    Piste retrievePiste(Long numPiste);
}
