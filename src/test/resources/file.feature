Feature: the version can be retrieved
  Scenario: client makes call to GET /employeurs/findAll
    When the client calls /employeurs/findAll
    Then the client receives status code of 200
    And the client receives all employers

