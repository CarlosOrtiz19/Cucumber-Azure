Feature:
  Verify differents GET operation
  Scenario: verify one employe exist
    Given I perform GET for "/getById"
    And I use the id 1
    Then I should see the employe name as "employeur 1"