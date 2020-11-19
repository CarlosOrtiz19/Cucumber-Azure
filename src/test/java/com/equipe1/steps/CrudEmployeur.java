package com.equipe1.steps;

import com.github.tomakehurst.wiremock.WireMockServer;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CrudEmployeur {

    WireMockServer wireMockServer;
    CloseableHttpClient httpClient;
    private static final String CREATE_PATH = "/createEmploye";
    private static final String APPLICATION_JSON = "application/json";

    @Before
    public void setUp(){
       wireMockServer = new WireMockServer(options().dynamicPort());
        httpClient = HttpClients.createDefault();



    }
    @When("users upload data on a project")
    public void usersUploadDataOnAProject() throws IOException {
        wireMockServer.start();

        configureFor("localhost", wireMockServer.port());
        stubFor(post(urlEqualTo(CREATE_PATH))
                .withHeader("content-type", equalTo(APPLICATION_JSON))
                .withRequestBody(containing("employeur"))
                .willReturn(aResponse().withStatus(200)));

        HttpPost request = new HttpPost("http://localhost:" + wireMockServer.port() + "/create");
        //StringEntity entity = new StringEntity(jsonString);
        request.addHeader("content-type", APPLICATION_JSON);
        //request.setEntity(entity);

        HttpResponse response = httpClient.execute(request);

        assertEquals(200, response.getStatusLine().getStatusCode());
        verify(postRequestedFor(urlEqualTo(CREATE_PATH))
                .withHeader("content-type", equalTo(APPLICATION_JSON)));

        wireMockServer.stop();
    }

    @Then("the server should handle it and return a success status")
    public void theServerShouldHandleItAndReturnASuccessStatus() {
    }

    @When("users want to get information on the {string} project")
    public void usersWantToGetInformationOnTheEmplouyeurProject() {
    }

    @Then("the requested data is returned")
    public void theRequestedDataIsReturned() {
    }
}
