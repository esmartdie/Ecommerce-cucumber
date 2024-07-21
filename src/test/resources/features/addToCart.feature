Feature: Spring Ecommerce Application test

  Scenario Outline: Add to cart
    Given User navigate to the Ecommerce application
    And user login into the application with  "<username>" and "<password>"
    And user search for an "<item>"
    When user add the item to the cart
    Then the cart should get updated

    Examples:
      | username      | password | item    |
      | qa_user@qa.es | 123      | Roboroc |
      | qa_user@qa.es | 123      | PS5     |