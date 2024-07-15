Feature: Spring Ecommerce Application test

  Scenario:Login should be success

    Given User navigate to the Ecommerce application
    And User clicks on the login button
    And User enter the username as qa_user@qa.es
    And User enter the password as 123
    When User click on the login button
    Then Login should be success