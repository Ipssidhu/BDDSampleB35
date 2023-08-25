Feature: Login function

#Scenario: Valid Login
#Given User is on Login Page
#When Unser enter credentials
#Then User should be navigated to HomePage

Scenario: Valid Login
Given User is on Login Page
When Unser enter "tomsmith" and "SuperSecretPassword!"
Then User should be navigated to HomePage