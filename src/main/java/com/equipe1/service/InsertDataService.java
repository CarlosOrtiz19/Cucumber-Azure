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
import java.util.Date;

@Component
public class InsertDataService {

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private EmployeurRepository employeurRepo;
    @Autowired
    private StageService stageService;
    @Autowired
    private  GestionnaireService gestionnaireService;

    @Transactional
    public void insertEtudiant(){
        Etudiant e1 = new Etudiant();
        e1.setNom("Truong");
        e1.setPrenom("Richard");
        e1.setProgramme("TI");
        e1.setMatricule("12345");
        e1.setPassword("12345");
        e1.setAdresse("12345");
        e1.setEmail("richard@courriel.com");
        e1.setStatutStage("aucun");
        etudiantRepository.save(e1);
    }

    @Transactional
    public void insertEmployeur(){
        Employeur e1 = new Employeur();
        e1.setEmail("tata");
        e1.setPassword("12345");
        e1.setAdresse("12345");
        e1.setNom("tata@ta.to");
        e1.setTelephone("12345");
        employeurRepo.save(e1);
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
        g1.setNoBureau("1");
        g1.setEmail("toto@toto.to");
        g1.setPassword("12345");
        g1.setTelephone("12345");
        gestionnaireService.saveGestionnaire(g1);
    }
}
