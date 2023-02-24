package tn.esprit.ds.ski_nada_namanizitouni.Projet_ski;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    @Column
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.ORDINAL)
    private Support support;
    private Float prix;
    private int Creneau;

    @OneToMany(mappedBy = "cours")//pour l'aggregation, cascade = CascadeType.REMOVE)
    private List<Inscription> inscriptions;

}
