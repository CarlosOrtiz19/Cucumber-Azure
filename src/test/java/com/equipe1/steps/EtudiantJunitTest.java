package com.equipe1.steps;

import com.equipe1.controller.EtudiantController;
import io.restassured.RestAssured;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.when;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.core.Is.is;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EtudiantJunitTest {


    @LocalServerPort
    private int port = 8080;

    @Before
    public void setUp() throws Exception {
        RestAssured.port = port;
        RestAssuredMockMvc.standaloneSetup(new EtudiantController());
    }

    @Disabled
    @Test
    public void listStudents(){
        when().
                get("http://localhost:8080/etudiants/findAll").
                then().
                body("name[0]", is("Ranga")).
                body("name[1]",is("Ravi"));
    }

    @Test
    public void listStudentsFindAll(){
      given().
                standaloneSetup(new EtudiantController()).
                when().
                get("/findAll").
                then().
                statusCode(404);

    }
}
