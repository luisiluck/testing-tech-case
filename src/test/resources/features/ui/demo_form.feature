Feature: Demo Form

  Demo Form is a web UI form example for training purposes.
  Please see https://demoqa.com/automation-practice-form.
  1) It is necessary to complete scenario to verify form submit with minimum fields
  2) Add alternative scenarios to validate error messages

  Scenario: submit form with minimum requirements
    Given a DefaultUser
    When visits PracticeFormPage
    # How you would refactor next steps in order to get a declarative step
    And fills "First Name" with "juan"
    And fills "Last Name" with "perez"
    And fills "Mobile Number" with "1234567890"
    And clicks on "submit"
    Then The Page says "Thanks for submitting the form"