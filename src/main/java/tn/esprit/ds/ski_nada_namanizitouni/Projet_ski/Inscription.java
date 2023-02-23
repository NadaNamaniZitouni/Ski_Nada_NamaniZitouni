package tn.esprit.ds.ski_nada_namanizitouni.Projet_ski;

import javax.persistence.*;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;
    private int numSemaine;
    @ManyToOne
    private Cours cours;
    @ManyToOne
    private Skieur skieurs;

}
