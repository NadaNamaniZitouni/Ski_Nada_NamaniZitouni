package tn.esprit.ds.ski_nada_namanizitouni.Projet_ski;

import javax.persistence.*;
import java.util.List;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int longeur;
    private int pente;
    @ManyToMany
    private List<Skieur> skieurs;
}
