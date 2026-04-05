Feature: Product Search and Filters Functionality

  Scenario: verify the Product Search and Filters Functionality
    Given enter the product name in search box
    When clicks on search option
    When verify product name and price
    When user enters the product in criteria search
    When selects dropdown
    When selects the subcategory checkbox
    And selects the description checkbox
    And apply filters
    And select the list option
    Then user sort the items
    Then product added to wishlist