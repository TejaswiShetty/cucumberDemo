Feature: github login


@Regression
  Scenario: login without username and password
    Given user is on github homepage
    When user clicks on Sign in button
    Then user is displayed login screen 
    
    
#    Scenario: logout
#    Given user has already logged in
#    When user clicks on logout button
#    Then user should successfully logout