Feature: Login function

Scenario: Valid Login
Given User is on Login Page
When Unser enter credentials
	   | tomsmith | SuperSecretPassword! |
#	   |testuser 1 | welcome 123 |
Then User should be navigated to HomePage

#Scenario: Valid Login
#Given User is on Login Page
#When Unser enter "tomsmith" and "SuperSecretPassword!"
#Then User should be navigated to HomePage

#Scenario: Valid Login
#Given User is on Login Page
#When Unser enter "<username>" and "<password>"
#Then User should be navigated to HomePage
#
#Examples:
     #| username | password |
     #|tomsmith | SuperSecretPassword!|
     #|user 1 | user 1 |
     #|user 2 | Welcome123 |
     

     