Feature: Spring Ecommerce Application test

  Background:
    Given User clicks on the login button

  @reg
  Scenario:Login should be success
    
    And User enter the username as "qa_user@qa.es"
    And User enter the password as "123"
    When User click on the login button
    Then Login should be success

  @reg
  Scenario:Login should not be success

    And User enter the username as "qauser@qa.es"
    And User enter the password as "1233"
    When User click on the login button
    But Login should be fail