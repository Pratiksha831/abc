Feature: Develop a Math application that supports addition, subtraction, multiplication and division operations.

Scenario: As an end-user I should be able to perform simple addition of two numbers.
	Given the first input is "10.0"
	And the second input is "20.0"
	When I invoke the add method
	Then I expect the result as "30.0"
