@PhaseOne
Feature: Deals Management

@SmokeTest
Scenario: Create a Deals
Given User is CRM Home Page
When User create a new Deals
 
 @RegressionTest
 Scenario: Update a Deals
Given User is CRM Home Page
When User update a Deals

Scenario: Delete a Deals
Given User is CRM Home Page
When User delete new Deals