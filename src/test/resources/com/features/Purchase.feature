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
@tag
Feature: Shopping website
  
  Background: 
    Given User will land on website
    When User will click on Women
    And User will click on casual dress
    And User will click on quick view
    And User will change size to large
    And User will click on add to cart and then proceed to checkout
    And User will again click on proceed to checkout

  @tag1
  Scenario: User login and online purchase
    And user will enter email and password
    And user will click on sign in
    And user will click on proceed to checkout
    And user will agree to terms and service
    And user will click o final nproceed to checkout
    Then close the browser
    
  @tag2 
  Scenario Outline: Creating User account.
    When user will give "<email>" for creating account. 
    And user will click on create an account. 
    And user enter "<Title>" "<fname>" "<lname>" "<password>"
    And user then enter "<Date>" "<Month>" "<year>" "<Company>"
    And user then again enter "<Address>" "<Adressline2>" "<City>" "<PostalCode>" "<Province>"
    And user then enter values "<Additionalinfo>" "<Homephone>" "<MobilePhone>"
    Then user will click on register button and succesfully created account
    
     Examples: 
     |Title | email                   | fname | lname |password|Date|Month|year|Company|Address|Adressline2|City      |PostalCode|Province        |Additionalinfo| Homephone  |MobilePhone|
     | Mrs. | hrdckkjjsdfge@yahoo.com |  Anna | Jacob |hjuiu   |19  |6    |1998|hjkjkj |34, ave|  15678    |Chilliwack|12345     |California      |qwerty yuio yu| 156125454 |  99599999  |
      