Feature: Tasks Management

@SmokeTest
Scenario: Create a Tasks
Given User is CRM Home Page
When User create a new Tasks
 
 @RegressionTest
 Scenario: Update a Tasks
Given User is CRM Home Page
When User update a Tasks

Scenario: Delete a Tasks
Given User is CRM Home Page
When User delete new Tasks