@regression
Feature: Search | users will be able to search for products

  Scenario: sc04 | user could search for product using fullname
# changed pass:   111111
    Given user is logged in with "email@gmail.com" and "asdf@1234"
    When user search using the name of the product
    Then user could find camera


    Scenario: sc05 | user could switch between currencies US-Euro
    When user select Euro currency
    Then user could see product with Euro currency

  Scenario: sc06 | user could select from different Categories
    When user could select a category
    And user can select sub category if found
    Then user could see results

  Scenario: sc07| user could filter with color
    When user could select Apparel
    And user could select color gray

#  Scenario:user could select different tags
#    When user could select apparel tag
#    And user could select book tag
#
#  Scenario: user could add different products to Shopping cart
#    Given user could select Books category
#    When user click add item to cart
#    And user click add item to cart
#    And user go to shopping cart
#    Then added successfully to shopping cart
#
#  Scenario: user could add different products to Wishlist
#    Given user could select Books category
#    When user click add to Wishlist
#    And user click add to Wishlist
#    Then added successfully to Wishlist
#
#  Scenario: user could add different products to compare list
#    Given user could select Books category
#    When user click add to compare list
#    And user click add to compare list
#    Then added successfully to compare list
#
#  Scenario: user could create a successful Order
#    When user click on shopping cart
#    And user accept terms of service
#    And user choose checkout
#    And user fills all checkout data
#    And user click on continue
#    And user click on continue
#    And user click on continue
#    And user click on continue
#    And user click on continue
#    Then user order products successfully




