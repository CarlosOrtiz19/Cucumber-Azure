Feature: student Crud
  Scenario: get all students
    Given request GET /estudents/findAll
    When user execute requete
    Then response inclut the following in any order
      | etudiant.prenom					| test1			|
      | etudiant.matricule 				| 123456       |
