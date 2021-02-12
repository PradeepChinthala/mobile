#Author: your.email@your.domain.com
#Keywords Summary :


Feature: Login feature
 
 @login
  Scenario: verify successful login
    Given user opened kpcu application
    When user enter "pradeep","123456"
    Then user should see login "error" message 


