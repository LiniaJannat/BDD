package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	
	@Given("user is on log in page")
	public void user_is_on_log_in_page() {
		System.out.println(" user is on log in page");
	}

	@When("user enters Username and password")
	public void user_enters_username_and_password() {
	    System.out.println(" user enters Username and password");
	}

	@And("click on login button")
	public void click_on_login_button() {
		  System.out.println(" click on login button");
	}

	@Then("user is nagivated to the home page")
	public void user_is_nagivated_to_the_home_page() {
		  System.out.println(" user is nagivated to the home page");
	}

	
	

}
