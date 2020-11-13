package com.equipe1;


import com.atlassian.ta.wiremockpactgenerator.WireMockPactGenerator;
import com.github.tomakehurst.wiremock.junit.WireMockClassRule;
import com.github.tomakehurst.wiremock.junit.WireMockClassRule;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.WireMockSpring;
import org.springframework.test.context.ContextConfiguration;



@CucumberContextConfiguration
@ContextConfiguration
@SpringBootTest(classes = {Application.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class SpringIntegrationTest {

    protected RequestSpecification request;
    protected Response response;
    protected ValidatableResponse json;
    protected RestAssuredConfig config;

    @ClassRule
    public static WireMockClassRule wiremock = new WireMockClassRule(
            WireMockSpring
                    .options()
                    .port(8090));

    @Value("100000")
    protected Integer timeOut;


    @Value("active")
    protected String activeProfile;

    protected WireMockPactGenerator wireMockPact;


}
