Feature: Login feature
    
	@testParams @DB @tag1
	Scenario: Testing params in steps
		Then user multiplies "33" and "3" verify "99"
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
		Then user multiplies "12" and "15" verify "180"
		Then user multiplies "<num1>" and "<num2>" verify "<multiply>"

		Examples:
		|num1|num2|multiply|
		|21|17| 357 |
		|51|11| 561 |
		|12|15| 180 |
		|21|21| 441 |
		|11|11| 121 |
		|4|22|   88 |
		|22|17| 374 |
		|52|11| 572 |
		|13|15| 195 |
		|26|21| 546 |
		|16|11| 176 |
		|45|22|  990 |
