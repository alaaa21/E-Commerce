Background: user open browser and go to forget password
Scenario: user login with invalid password
Given user navigates to reset password
When user enter invalid password
And user click on forget password button
  And enter email
    #expected result
Then the new password sent to email successfully
