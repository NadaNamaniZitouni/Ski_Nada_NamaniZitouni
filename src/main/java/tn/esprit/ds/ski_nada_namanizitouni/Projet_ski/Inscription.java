package tn.esprit.ds.ski_nada_namanizitouni.Projet_ski;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;
    private int numSemaine;
    @ManyToOne
    private Cours cours;
    @ManyToOne
    @JsonIgnore
    private Skieur skieurs;

}
