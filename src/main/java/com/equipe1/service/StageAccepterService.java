package com.equipe1.service;

import com.equipe1.model.Stage;
import com.equipe1.model.StageAccepter;
import com.equipe1.repository.StageAccepterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StageAccepterService {

    @Autowired
    private StageAccepterRepository stageAccepterRepository;

    public StageAccepter saveStageAccepter(Stage stage) {
        StageAccepter stageAccepter = new StageAccepter();
        stageAccepter.setTitre(stage.getTitre());
        stageAccepter.setDescription(stage.getDescription());
        stageAccepter.setExigences(stage.getExigences());
        stageAccepter.setDateDebut(stage.getDateDebut());
        stageAccepter.setDateFin(stage.getDateFin());
        stageAccepter.setNbHeuresParSemaine(stage.getNbHeuresParSemaine());
        stageAccepter.setVille(stage.getVille());
        stageAccepter.setSalaire(stage.getSalaire());

        stageAccepter.setNomEntreprise(stage.getEmployeur().getNom());
        stageAccepter.setTelephone(stage.getEmployeur().getTelephone());
        stageAccepter.setAdresse(stage.getEmployeur().getAdresse());
        return stageAccepterRepository.save(stageAccepter);
    }
}
