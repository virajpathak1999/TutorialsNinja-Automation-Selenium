Feature: Checkout Functionality

  Scenario: verify the Checkout Functionality
    Given user enter the product name in search box
    When user clicks on search option
    When add the product to the cart
    And user clicks the cart option
    And apply coupen code
    Then clicks the checkout button
    