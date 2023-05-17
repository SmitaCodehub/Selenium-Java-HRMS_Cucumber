@Application
Feature:Verify Title

Scenario: Verify Title
Given Open Application
When  Verify Title
Then  Close Application

@LoginLogout
Scenario: LoginandLogout
Given Open Application
When  Type username and password and click on Login button
When  Click on Logout
Then  Close Application
