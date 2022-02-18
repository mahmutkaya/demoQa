@web @form
Feature: US_01 Forms
  Scenario: TC_01 Forms Filling
    Given User goes to "demoqa_url".
    When User clicks the forms
    And User clicks the practise form
    And User fills the Student Registration Form and submits
    And User upload the picture from resouches
    Then Verify that "submit_thanks_message" is displayed

