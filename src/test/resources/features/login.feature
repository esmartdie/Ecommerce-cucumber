Feature: Spring Ecommerce Application test

  Scenario:Login should be success

    Given User navigate to the Ecommerce application
    And User clicks on the login button
    And User enter the username as "qa_user@qa.es"
    And User enter the password as "123"
    When User click on the login button
    Then Login should be success

  Scenario:Login should not be success

    Given User navigate to the Ecommerce application
    And User clicks on the login button
    And User enter the username as "qauser@qa.es"
    And User enter the password as "1233"
    When User click on the login button
    But Login should be fail