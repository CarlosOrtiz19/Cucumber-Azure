Feature: the version can be retrieved
  Scenario: client makes call to GET /findAll
    When the client calls /findAll
    Then the client receives status code of 200
    And the client receives all employers

