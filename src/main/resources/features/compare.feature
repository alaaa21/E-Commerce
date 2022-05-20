Feature: user should able to login to the system

  Background: user open browser and go to compare items page
  Scenario: user click button add to compare list
    Given user navigates to comapre page
    When  user enter the button and choose 2 items
    Then compare items added successfully
