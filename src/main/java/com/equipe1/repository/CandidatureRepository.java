package com.equipe1.repository;

import com.equipe1.model.Candidature;
import com.equipe1.model.Etudiant;
import com.equipe1.model.Stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CandidatureRepository extends JpaRepository<Candidature, Long> {
    Optional<Candidature> findByEtudiant(Etudiant etudiant);

    //@Query("SELECT c FROM Candidature c where c.etudiant.id = :id and c.statut = :statut")
    //Optional<Candidature> findCandidatureByEtudiant_Id(Long id, Candidature.CandidatureStatut statut);

//    List<Candidature> findAllByStage(Stage stage);
    List<Candidature> findAllByStage(Long stage);


    List<Candidature>findByStatut(Candidature.CandidatureStatut statut);

}
