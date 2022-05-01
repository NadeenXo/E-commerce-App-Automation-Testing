@regression
Feature: Search | users will be able to search for products

  Scenario: sc_04 | user could search for product using fullname
#    Given user is logged in with "email@gmail.com" and "111111"
    When user search using the name of the product
    Then user could find camera


    Scenario: sc_05 | user could switch between currencies US-Euro
    When user select Euro currency
    Then user could see product with Euro currency

  Scenario: sc_06 | user could select from different Categories
    When user could select a category
    And user can select sub category if found
    Then user could see results

  Scenario: sc_07| user could filter with color
    When user could select Apparel
    And user could select color gray

  Scenario: sc_08 | user could select different tags
    When user search using the name of the product
    And user could select "awesome" tag
    And user could select "book" tag

  Scenario: sc_09 | user could add different products to Shopping cart
#  Given user is logged in with "email@gmail.com" and "11111111"
    When user could select a category
    And user can select sub category if found
    And user click add item to cart
#    Then added successfully to shopping cart mssg
#    And user click add item to cart
#    Then added successfully to shopping cart mssg

  Scenario:sc_10 | user could add different products to Wishlist
    Given user could select a category
    And user can select sub category if found
    And user click add to Wishlist
    Then added successfully to Wishlist

  Scenario:sc_11 | user could add different products to compare list

    Given user could select a category
    And user can select sub category if found
    And user click add to compare list
    And user click add to compare list
    Then added successfully to compare list

  Scenario: sc_12 | user could create a successful Order
    Given user logged in with "email@gmail.com" and "111111"
#    if not changed pass then pass= asdf@1234
    When user could select a category
    And user can select sub category if found
#    When user could select
    And user click add item to cart

    When user click on shopping cart
    And user accept terms of service
    And user choose checkout
    And user fills all checkout data
    And user click on continue
    And user click on continue-shipping
    And user click on continue-payment-method
    And user click on continue-payment-info
    And user click on confirm-order
    Then user order products successfully




