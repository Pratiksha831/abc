package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("deprecation")
public class Steps {

	private double firstInput, secondInput, actualResult, expectedResult;
	private com.amdocs.Math math;
	
@Given("the first input is {string}")
public void the_first_input_is(String strFirstInput) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	this.firstInput = Double.parseDouble(strFirstInput);
}

@Given("the second input is {string}")
public void the_second_input_is(String strSecondInput) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	this.secondInput = Double.parseDouble(strSecondInput);
}

@When("I invoke the add method")
public void i_invoke_the_add_method() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	math = new com.amdocs.Math();
	this.actualResult = math.add(this.firstInput , this.secondInput);
}

@Then("I expect the result as {string}")
public void i_expect_the_result_as(String strExpectedResult) {
    // Write code here that turns the phrase above into concrete actions
    this.expectedResult = Double.parseDouble(strExpectedResult);
	//throw new cucumber.api.PendingException();
    assertEquals(this.expectedResult , this.actualResult , 0.001);
}
}
