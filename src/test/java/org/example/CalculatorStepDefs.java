package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.List;

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
    public void we_get_a_result_of(int sum) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(sum, (int)result);
    }

    @When("We have a list of numbers:")
    public void we_have_a_list_of_numbers(List<Integer> numbers) {
        result = calculator.sum(numbers);
    }
    @Then("We get a sum of {int}")
    public void we_get_a_sum_of(Integer expected) {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(expected, result);
    }
}
