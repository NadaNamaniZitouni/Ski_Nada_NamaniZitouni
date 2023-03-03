package tn.esprit.ds.ski_nada_namanizitouni.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Abonnement;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.TypeAbonnement;

import java.util.List;

public interface AbonnementRepo extends JpaRepository<Abonnement, Long>{
    List<Abonnement> findAbonnementBy(TypeAbonnement typeAbonnement);

}
