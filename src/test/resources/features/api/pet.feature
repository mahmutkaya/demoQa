@api @pet
Feature: Pet

  Scenario: Get request for pet endpoint
    Given The endpoint is "pet/3"
    When I send GET Request
    Then Status code is 200
    And Response body is like:
      | id | name                | status    |
      | 3  | purplefieldstester2 | available |