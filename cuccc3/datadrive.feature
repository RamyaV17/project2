Feature: Login Functionality
Scenario: Login Functionality
Given User must be registered
When  login using below credentials
  |Username||password|
  |name123||name123|
  |xyz123||xyz123|
      Then User must be in home page