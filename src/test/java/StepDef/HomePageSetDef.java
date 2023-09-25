package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import BaseObjects.BaseClass;
import BaseObjects.LoginPageClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePageSetDef extends BaseClass{

	 LoginPageClass login;
	
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("inside method of i_want_to_write_a_step_with_precondition");
		
		
	}

	@And("some other precondition")
	public void some_other_precondition() {
		System.out.println("inside method of some_other_precondition");
		login = new LoginPageClass();
		login.userIsOnloginPage();

	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("inside method of i_complete_action");
		login = new LoginPageClass();
		login.userIsOnloginPage();
		login.methodCall();
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("inside method of some_other_action");

	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("inside method of yet_another_action");

	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("inside method of i_validate_the_outcomes");

	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("inside method of check_more_outcomes");

	}


}
