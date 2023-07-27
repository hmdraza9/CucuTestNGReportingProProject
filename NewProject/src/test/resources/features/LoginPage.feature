Feature: Login feature
  
Background: 
	Given user is on app login page "https://www.google.co.in"
	
  @tag1
  Scenario: Logging in to the system scenrio1
    Then User logs into the system
    Then User logs out the system
    
  @tag2 @tag1
  Scenario: Logging in to the system scenrio2
    Then User logs into the system
    
  @tag3 @tag2 @tag1
  Scenario: Logging in to the system scenrio3
    Then User logs into the system
    Then user navigates to "https://youtube.com"
    
	@testParams
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
    
	@testParams
	Scenario Outline: Testing params in steps
		Then user multiplies "12" and "15"
		Then user multiplies "<num1>" and "<num2>"

		Examples:
		|num1|num2|
		|21|17|
		|51|11|

		

		