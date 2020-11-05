package com.equipe1.controller;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class EmployeurControllerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllEmployeurs() {
    }

    @Test
    void getEmployeurById() {
    }

    @Test
    void getEmployeurByEmail() {
    }

    @Test
    void createEmployeur() {
    }

    @Test
    void updateEmployeur() {
    }
}