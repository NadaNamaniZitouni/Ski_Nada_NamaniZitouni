package tn.esprit.ds.ski_nada_namanizitouni.Projet_ski;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate DateRecru;
    @OneToMany
    private List<Cours> cours;
}
