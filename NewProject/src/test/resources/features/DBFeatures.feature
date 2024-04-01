Feature: Login feature
    
	@testParams @DB @tag1 
	Scenario: Testing params in steps
		Then user multiplies "33" and "3"
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
		|21|17| #357
		|51|11| #561
		|12|15| #180
		|21|21| #441
		|11|11| #121
		|4|22|  #88
		|22|17| #357
		|52|11| #561
		|13|15| #180
		|26|21| #441
#		|16|11| #121
#		|45|22|  #88
