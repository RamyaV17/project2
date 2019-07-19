Feature: Login Functionality
Scenario Outline: Login Functionality
    Given User must br registered
    When login using <username> and <password>
    Then user must be in home page
   
    Examples: 
      |Username||password|
      |name123||name123|
      |xyz123||xyz123|
      
      