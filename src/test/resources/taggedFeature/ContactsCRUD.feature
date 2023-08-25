@PhaseTwo
Feature: Contacts Management

@SmokeTest #@RegressionTest
Scenario: Create a contact
Given User is CRM Home Page
When User create a new contact
 
 @RegressionTest
 Scenario: Update a contact
Given User is CRM Home Page
When User update a contact

Scenario: Delete a contact
Given User is CRM Home Page
When User delete new contact