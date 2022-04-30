Background: user open browser and go to items
Scenario: user add items to wishlist
Given user navigates to item
When user enter choose item
And user click on add item to wishlist button
    #expected result
Then the item added to wishlist successfully
And go to home page
