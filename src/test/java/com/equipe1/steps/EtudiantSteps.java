package com.equipe1.steps;

import com.equipe1.controller.EtudiantController;
import com.equipe1.model.Etudiant;
import io.cucumber.java.Before;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import io.restassured.response.Response;


import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static io.restassured.RestAssured.when;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.core.Is.is;

public class EtudiantSteps {

    private String basePath = "http://localhost:8080/etudiants/";
    Etudiant etudiant = new Etudiant();

    Response response;



    @Before
    public void setUp() throws Exception {
        /*when()
                .get("/get/" + id)
                .then()
                .body("nom[0]", is("etudiant1"))
            .body("nom[1]", is("etudiant2"));*/
        RestAssuredMockMvc.standaloneSetup(new EtudiantController());
    }

    @Given("request GET \\/estudents\\/findAll")
    public void requestGETEstudentsFindAll() {
        //response = when().get("http://localhost:8080/etudiants/findAll");
       given().when().get(basePath+"/findAll").then().statusCode(HttpServletResponse.SC_OK);
    }

    @When("user execute requete")
    public void userExecuteRequete() {

    }


    @Then("response inclut the following in any order")
    public void responseInclutTheFollowingInAnyOrder() {
        etudiant.setPrenom("test1");
        etudiant.setMatricule("123456");
        List<Etudiant> etudiantList = Arrays.asList(etudiant);

    }
}


