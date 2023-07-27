Feature: Login feature
  
Background: 
	Given user is on app login page "https://www.way2automation.com/angularjs-protractor/banking/#/login"
	
  @tag1 @UI
  Scenario: Logging in to the system scenrio one
    Then User logs into the system
    Then User logs out the system
    Then user navigates to "https://in.com"
    
  @tag2 @tag1 @UI
  Scenario: Logging in to the system scenrio two
    Then User logs into the system
    Then User logs out the system
    Then user navigates to "https://yahoo.com"
    
  @tag3 @tag2 @UI
  Scenario: Logging in to the system scenrio three
    Then User logs into the system
    Then User logs out the system
    Then user navigates to "https://youtube.com"
    
	@testParams @DB @tag1 
	Scenario: Testing params in steps
		Then user multiplies "12" and "15"
		Then tests pipe separated params
#		|Hello|My|Name|Is|Mr.|Hamid|Raza|
		|Hello|
		|My|
		|Name|
		|Is|
		|Mr|
		|Hamid|
		|Raza|
    
	@testParams @DB @tag1 
	Scenario Outline: Testing params in steps
		Then user multiplies "12" and "15"
		Then user multiplies "<num1>" and "<num2>"

		Examples:
		|num1|num2|
		|21|17|
		|51|11|

		

		