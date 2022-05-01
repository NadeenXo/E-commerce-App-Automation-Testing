@regression
Feature: Login | users could login to open their accounts

  Scenario:sc_02 | user could login with valid email and password
    Given user should go to login page
    When user login with valid "email@gmail.com" and "asdf@1234"
    And user press on login button
    Then user login to the system successfully

  Scenario: sc_03 | User could reset his/her password successfully
    Given user is logged in with "emaill@gmail.com" and "asdf@1234"
    When user should click on my account link then click on change password
    And user fills old pass "asdf@1234" and new pass
    And user click on Change password button
    Then user has changed his-her password successfully

