Feature: Rest test
  GoREST is an demo web API for training purposes (please see https://gorest.co.in)
  It is necessary to check availability of Users endpoint and verify the status of any user

  Scenario: the user is active
    Given the URL https://gorest.co.in/
    When I check the application status
    Then the API should contain active
