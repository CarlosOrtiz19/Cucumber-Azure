package com.equipe1.steps;

import com.atlassian.ta.wiremockpactgenerator.WireMockPactGenerator;
import com.equipe1.SpringIntegrationTest;
import com.equipe1.model.Employeur;
import com.equipe1.repository.EmployeurRepository;
import com.equipe1.service.EmployeurService;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import io.cucumber.java.Before;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.StringUtils;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.mock.mockito.MockBean;
import wiremock.org.apache.http.impl.client.CloseableHttpClient;
import wiremock.org.apache.http.impl.client.HttpClients;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.mockito.Mockito.when;

@Ignore
public class EmployeurSteps extends SpringIntegrationTest {


   private String basePath= "http://localhost:8080/employeurs/";

    private String baseURI;

    @Before
    public void setUp() {

        // In dev mode add the pact generator listener

        wiremock.stubFor(get(urlMatching(basePath+".*"))
                .willReturn(
                        aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBodyFile("mocks/user.json")));

    }


    @Given("a employeur exists with an id of {int}")
    public void aEmployeurExistsWithAnIdOf(int id) {
        //System.out.println(id);
        //response = given().baseUri(basePath).config(config).param("id",id).when().get(basePath +"{id}");
    }

    @When("the client retrieves the employe by id")
    public void theClientRetrievesTheEmployeById() {
       // response = request.when().get(basePath);
       // System.out.println("response: " + response.prettyPrint());
    }

    @Then("the emloye service status code is {int}")
    public void theEmloyeServiceStatusCodeIs(int statusCode) {
        json = response.then().statusCode(statusCode);
    }

    @And("Employee response includes the following in any order")
    public void employeeResponseIncludesTheFollowingInAnyOrder(Map<String, String> responseFields) {
        /*for (Map.Entry<String, String> field : responseFields.entrySet()) {
            if (StringUtils.isNumeric(field.getValue())) {
                json.body(field.getKey(), containsInAnyOrder(Integer.parseInt(field.getValue())));
            } else {
                json.body(field.getKey(), containsInAnyOrder(field.getValue()));
            }
        }*/
    }
}
