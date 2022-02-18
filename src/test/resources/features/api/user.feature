@api @user
Feature: User

  Scenario: Post request for user
    Given The endpoint is "user"

    And The request body for post user is like:
      | id | username | firstName | lastName | email        | password | phone     | userStatus |
      | 5  | JohnS    | John      | Smith    | js@gmail.com | 12345    | 232525252 | 0          |

    When I send POST request
    Then Status code is 200

    And response body of user post request is like:
      | code | type    | message |
      | 200  | unknown | 5       |
