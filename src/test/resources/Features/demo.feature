Feature: Test the Login Functionality of OrangeHRM Application

Scenario Outline: Successful login with valid credentials
  Given User is on Login
  When User enters valid <username> and <password>
  And clicks on Login Button
  Then User is navigated to Home Page
  And Close the browser
  
  Examples:
      	| username  | password  |
        | Admin     | admin123  |
        | Admin     | admin123  |
