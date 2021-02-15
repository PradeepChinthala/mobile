#Author: your.email@your.domain.com


@accounts
Feature: accounts feature

  Scenario: validate_accounts_screen_elements
    Given user opened kpcu application
    When user enter "testaapple","Welcome2kpcu!"
    Then user should see login "error" message 


 Scenario: validate_checking_account_screen_elements
    Given user opened kpcu application
    When user enter "dfdfdfgdg","dfgfhghh"
    Then user should see login "error" message 
    
  Scenario: checking_accounts_presstransferbtn
    Given user opened kpcu application
    When user enter "dfdfdfgdg","dfgfhghh"
    Then user should see login "error" message
    
    
  Scenario: validate_savings_account_screen_elements
    Given user opened kpcu application
    When user enter "dfdfdfgdg","dfgfhghh"
    Then user should see login "error" message
    
  Scenario: savings_account_presstransferbtn
    Given user opened kpcu application
    When user enter "dfdfdfgdg","dfgfhghh"
    Then user should see login "error" message