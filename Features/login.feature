#Author: your.email@your.domain.com
#Keywords Summary :

 @login
Feature: Login feature
 
@lyy
  Scenario: Validate User login
    Given user opened kpcu application
    When user enter "testaapple","Welcome2kpcu!"
    Then user should see login "error" message 

@invalidlogin
 Scenario: Validate Invalid User	
    Given user opened kpcu application
    When user enter "dfdfdfgdg","dfgfhghh"
    Then user should see login "error" message 

@forgot  
 Scenario: Validate Forgot Password Link
    Given user opened kpcu application
    Then user should see login "error" message 