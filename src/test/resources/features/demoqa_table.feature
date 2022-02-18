@web @table
Feature: US_02 Table

  Scenario: TC_02 Search
    Given User goes to "demoqa_url".
    When User clicks the Book store Application
    And User seaches for "name_of_the_book"
    Then User verifies "name_of_the_author" is the author
