Feature: user should able to login to the system

  Background: user open browser and go to register page
    Scenario: user register with valid data
      Given user navigates to register page
      When  user enter valid username and password and email
      And user click on register page
      Then user register Successfully
      And go to home page

