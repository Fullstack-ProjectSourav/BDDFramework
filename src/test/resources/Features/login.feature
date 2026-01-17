Feature: Login page Automation of Demo Application

Scenario Outline:: Check login is successful with valid cred
Given User is on Login Page
When User enters valid "<username>" and "<password>"
And clicks on Login Button
Then User is navigated to Home Page
And Close the browser

Examples:
| username | password |
| standard_user | secret_sauce |
| visual_user | secret_sauce |