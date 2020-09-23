package com.equipe1.service;

import com.equipe1.model.Employeur;
import com.equipe1.model.Etudiant;
import com.equipe1.model.Gestionnaire;
import com.equipe1.model.Stage;
import com.equipe1.repository.EmployeurRepository;
import com.equipe1.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Date;

@Component
public class InsertDataService {

    @Autowired
    private EtudiantRepository repository;
    @Autowired
    private EmployeurRepository employeurRepo;
    @Autowired
    private StageService stageService;
    @Autowired
    private  GestionnaireService gestionnaireService;

    @Transactional
    public void insertEtudiant(){
        Etudiant e1 = new Etudiant();
        e1.setNom("toto");
        e1.setAdresse("432442");
        e1.setEmail("ttt@gg.v");
        e1.setMatricule("4324324");
        e1.setPassword("fewwffew");
        e1.setPrenom("rrrrr");
        repository.save(e1);
        e1 = new Etudiant();
        e1.setNom("tata");
        repository.save(e1);
        e1 = new Etudiant();
        e1.setNom("tete");
        repository.save(e1);

        e1.setNom("titi");
        repository.save(e1);
    }

    @Transactional
    public void insertEmployeur(){
        String email = "none";
        String password = "none";
        Employeur Employeur_1 = new Employeur("employeur_1", "43895893654", "548 ddasdfasdf");
        Employeur_1.setEmail(email);
        Employeur_1.setPassword(password);
        employeurRepo.save(Employeur_1);
        Employeur_1 = new Employeur("employeur_2", "0000000000", "111 ddasdfasdf");
        Employeur_1.setEmail(email);
        Employeur_1.setPassword(password);
        employeurRepo.save(Employeur_1);
        Employeur_1 = new Employeur("employeur_3", "11111111111", "33333 ddasdfasdf");
        Employeur_1.setEmail(email);
        Employeur_1.setPassword(password);
        employeurRepo.save(Employeur_1);
    }

    @Transactional
    public void insertStage(){
        Stage stage1 = new Stage();
        stage1.setTitre("stage_1");
        stage1.setDescription("stage informatique ");
        stage1.setDateDebut(new Date());
        stage1.setDateFin(new Date());
        //stage1.setExigences(Arrays.asList("diplome", "experience"));
        stage1.setNbAdmis(2);
        stageService.saveStage(stage1);
    }

    @Transactional
    public void insertGestionnaire(){
        Gestionnaire g1 = new Gestionnaire();
        g1.setNom("toto");
        g1.setPrenom("toto");
        g1.setMatricule("12345");
        gestionnaireService.saveGestionnaire(g1);
    }
}
