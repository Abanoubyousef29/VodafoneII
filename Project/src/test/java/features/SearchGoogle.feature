Feature: Title of your feature
  I want to use check user can search in google and select a result

  
  	Scenario: Search in google and select result
  	
    Given User write "selenium webdriver" in the searched box
    When User select "selenium webdriver download" from the Suggested List
    Then User select result number "3" from the result List
    

