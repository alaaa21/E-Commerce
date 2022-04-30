Background: user open browser and go to home page
Scenario: user open search
Given user navigates to search page
When user enter valid input or category in search box
And user click on search button
    #expected result
Then the user redirected to the page entered in search successfully
