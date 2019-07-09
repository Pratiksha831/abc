Feature: Develop a Math application that supports addition, subtraction, multiplication and division operations.

Scenario Outline: As an end-user I should be able to perform simple addition of two numbers.
	Given the first input is <firstInput>
	And the second input is <secondInput>
	When I invoke the add method
	Then I expect the result as <expectedResult>
	
	Examples:
				| firstInput	|	secondInput	|	expectedResult	|
				|	  "10.0"		|		"20.0"		|		 "30.0"				|
				|	  "15.4"		|		"21.7"		|		 "37.1"				|
				|	  "18.6"		|		"20.7"		|		 "39.3"				|
	

