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
    private EmployeurRepository employeurRepository;
    @Autowired
    private StageService stageService;
    @Autowired
    private  GestionnaireService gestionnaireService;

    @Transactional
    public void insertEtudiant(){
        Etudiant e1 = new Etudiant();
        e1.setAdresse("123456");
        e1.setEmail("richard@email.com");
        e1.setMatricule("1772397");
        e1.setPassword("123456");
        e1.setPrenom("richard");
        e1.setNom("truong");
        e1.setStatutStage("possede stage");
        e1.setTelephone("555-555-5555");
        e1.setProgramme("TI");
        etudiantRepository.save(e1);

        Etudiant e2 = new Etudiant();
        e2.setAdresse("123456");
        e2.setEmail("alex@email.com");
        e2.setMatricule("1501279");
        e2.setPassword("123456");
        e2.setPrenom("alex");
        e2.setNom("truong");
        e2.setStatutStage("aucun stage");
        e2.setTelephone("555-444-4444");
        e2.setProgramme("Secondaire 3");
        etudiantRepository.save(e2);
    }

    @Transactional
    public void insertEmployeur(){
        Employeur e1 = new Employeur();
        e1.setEmail("banque1@email.com");
        e1.setPassword("12345");
        e1.setAdresse("12345");
        e1.setNomEntreprise("banque1");
        e1.setTelephone("888-888-8888");
        employeurRepository.save(e1);
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
        g1.setEmail("toto@toto.to");
        g1.setPassword("12345");
        g1.setTelephone("12345");
        gestionnaireService.saveGestionnaire(g1);
    }
}
