@api @store
Feature: Store

  Scenario: Post request for Store Order
    Given The endpoint is "store/order"

    And The request body for post store order is like:
      | id | petId | quantity | shipDate                 | status | complete |
      | 1  | 10    | 0        | 2021-08-12T13:41:08.955Z | placed | true     |

    When I send POST request
    Then Status code is 200

    And Response body for post store order is like:
      | id | petId | status | complete |
      | 1  | 10    | placed | true     |
