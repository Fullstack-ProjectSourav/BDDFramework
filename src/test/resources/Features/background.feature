Feature: This is background demo


Background: User is logged into demo app
Given User access the demo login page
When User enters valid user and pass
Then User should be able to navigate the Home Page


Scenario: Test Menu Item
And clicks on bredcrumb
Then User should be able to see the menu item


Scenario: Test Verify add to cart functionality
And Clicks on add to button
Then Item should be added into cart