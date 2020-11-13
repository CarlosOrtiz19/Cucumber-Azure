Feature: testing employeur CRUD

  Scenario: client calls web service to get a employeur by id
    Given a employeur exists with an id of 1
    When the client retrieves the employe by id
    Then the emloye service status code is 200
    And Employee response includes the following in any order
      | employeur.adresse					| 1234abc			|
      | employeur.nom 				        | Employeur1	|
