Feature: Cart Functionality

  Scenario: verify the cart Functionality
    Given enter product name in search box
    When click on search option
    When adds the product to the cart
    When user enters the product name in search box
    And click the search option
    And add product to the cart
    And user clicked cart option
    Then user removes the items from the cart 