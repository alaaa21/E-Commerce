Background: user open browser and go to login page
Scenario: user login with valid username and password
Given user navigates to login page
When user enter valid username and password
And user click on login button
    #expected result
Then the user login successfully
And go to home page
And close browser