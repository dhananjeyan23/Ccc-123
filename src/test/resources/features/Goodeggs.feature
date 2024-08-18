Feature: To Validate the Login Functionality Of Goodeggs Application

Background:
Given User Have To Launch The Goodeggs Application Through Chrome Browser
And  User Have To Maximize The Window



Scenario: User Have To Enter Valid Email and Valid password
When User Have To Click The Sigin Button 
When User Have To Enter the Valid Email and Valid password
And User Have To Click The Continue Button
Then user have to close the browser



Scenario: User Have To Enter InValid Email and Valid password
When User Have To Click The Sigin Button 
When User Have To Enter the InValid Email and Valid password
And User Have To Click The Continue Button
Then user have to close the browser

Scenario: User Have To Enter InValid Email and InValid password
When User Have To Click The Sigin Button 
When User Have To Enter the InValid Email and InValid password
And User Have To Click The Continue Button
Then user have to close the browser



