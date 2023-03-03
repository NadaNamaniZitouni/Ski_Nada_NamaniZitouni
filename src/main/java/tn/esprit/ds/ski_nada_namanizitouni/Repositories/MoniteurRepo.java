package tn.esprit.ds.ski_nada_namanizitouni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Cours;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Moniteur;

import java.util.List;

public interface MoniteurRepo extends JpaRepository<Moniteur, Long> {
}
