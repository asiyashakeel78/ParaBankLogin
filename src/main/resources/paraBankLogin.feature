@Smoke @Regression @Functional
Feature: Log in Functionality test
  
Background:
Given open browser
And go to application login page

  @Positive @TC_BOL01
  Scenario: as a Parabank user successful login with valid credential
    
    When put valid user name
    And enter valid password
    And click login button
    Then successfull login and logout button should visible
   

    @Negative @TC_BOL02
  Scenario: as a Parabank user login should fail with invalid credential
    
    When put invalid user name
    And enter invalid password
    And click login button
    Then login fail and error msg An internal error has pccured and has been logged 
    
      @Negative @TC_BOL03
  Scenario: as a Parabank user successful login with valid credential
    
    When put null user name
    And enter null password
    And click login button
    Then login fail and error msg show Please enter a username and password