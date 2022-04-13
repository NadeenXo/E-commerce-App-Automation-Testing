@regression
  Feature: Registration | User could signup with  anew account
    Scenario: User could register with valid data
      Given user click on register link
      When user fills personal details with valid data
      And user fills pass with valid data
      And user click on register button
      Then success message displayed