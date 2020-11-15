package ec.edu.espol.workshops.second;
 
import io.cucumber.java.en.Given; 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepsDefs {
private int years;
private int actualAnswer;


@Given("person is {int} years old")
public void age_is(int years) { this.years = years;
}

@When("{int} > 80")  public void i_compare(int years) {
	actualAnswer = -1;
}

@Then("Show {int}")
public void i_should_be_told(String expectedAnswer) { assertEquals(expectedAnswer, actualAnswer);
}
}
