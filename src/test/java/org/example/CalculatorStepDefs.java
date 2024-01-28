package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;


public class CalculatorStepDefs {
    Calculator calculator;
    Integer result;

    @Given("We have a calculator")
    public void we_have_a_calculator() {
        calculator = new Calculator();
    }
    @When("We add {int} and {int}")
    public void we_add_and(Integer a, Integer b) {

        result = calculator.add(a, b);
    }
    @Then("We get a result of {int}")
    public void we_get_a_result_of(Integer expected) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(expected, result);
    }

}
