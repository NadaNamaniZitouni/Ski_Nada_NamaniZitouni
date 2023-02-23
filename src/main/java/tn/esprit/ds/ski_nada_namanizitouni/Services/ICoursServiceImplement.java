package tn.esprit.ds.ski_nada_namanizitouni.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.ski_nada_namanizitouni.Projet_ski.Cours;
import tn.esprit.ds.ski_nada_namanizitouni.Repositories.CoursRepo;

import java.util.List;
@Service
public class ICoursServiceImplement implements ICoursService {
    @Autowired
    CoursRepo coursRepo;
    @Override
    public List<Cours> retrieveAllCours() {
        return coursRepo.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public void removeCours(Long numCours) {
        coursRepo.deleteById(numCours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepo.findById(numCours).orElse(null);
    }
}
