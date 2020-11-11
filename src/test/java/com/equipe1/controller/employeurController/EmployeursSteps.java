package com.equipe1.controller.employeurController;

import com.equipe1.model.Employeur;
import com.equipe1.repository.EmployeurRepository;
import com.equipe1.service.EmployeurService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.WireMockServer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;


import static org.apache.http.client.methods.RequestBuilder.get;
import static org.apache.http.client.methods.RequestBuilder.options;

@Log4j2
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class EmployeursSteps {


  /*@LocalServerPort
  private int port;
  private RestTemplate restTemplate = new RestTemplate();
  private String getUrl = "http://localhost";*/

   /*@MockBean
    private EmployeurService employeurService;*/
    /*@Autowired
    private MockMvc mockMvc;*/


    @When("the client calls \\/employeurs\\/findAll")
    public void the_client_calls_employeurs_find_all() {
        //Mockito.when(employeurService.getEmployeurs()).thenReturn(Arrays.asList(new Employeur(), new Employeur()));
        // Write code here that turns the phrase above into concrete actions

    }


    @Then("the client receives status code of {int}")
    public void the_client_receives_status_code_of(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("the client receives all employers")
    public void the_client_receives_all_employers() {
        // Write code here that turns the phrase above into concrete actions

    }



}
