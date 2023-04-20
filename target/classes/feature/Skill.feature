Feature: I am automation functionality of Add Skills in Orange HRM application
	
Background: Common step
    Given User launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  Scenario: Successful Login with valid page
    And User enters username as "Admin" and password as "admin123"
     Then Create Skills Record
					|Sales3001|Sales3001 descr|
					|Sales3002|Sales3002 descr|
					|Sales3003|Sales3003 descr|
    When Click on logout button
    Then Close Browser
    
    
  
    
    
    

    