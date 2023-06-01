#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@LearningMMA
Feature: I want to learn MMA
  

  @LookingForMMAGyms
  Scenario: Looking for an MMA Gym near to my place
    Given I am interested in learning Gym
    And I went online to find different MMA Gyms nearBy my area
    And I shortlisted 2 MMA Gym
    And I went to see the 1st Gym
    And I took the annual membership for Gym
    When My friends got to hear about this Gym
    Then 3 Of them decided to join
    But I asked for referral discount
    
    


