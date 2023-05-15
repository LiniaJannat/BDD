package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	
	WebDriver driver = null;
	
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println(" browser is open");
		System.getProperty("webdriver.chrome.driver","C:/Program Files/Google/Chrome/Application/chrome.exe ");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		
	
	}

	@And("is on google page")
	public void is_on_google_page() {
		System.out.println(" is on google page");
	}

	@When("user enter a text is search box")
	public void user_enter_a_text_is_search_box() {
		System.out.println(" user enter a text is search box");
	}

	@And("hits enters")
	public void hits_enters() {
		System.out.println(" hits enters");
	}

	@Then("user is nagivated to search page")
	public void user_is_nagivated_to_search_page() {
		System.out.println(" user is nagivated to search page");
	}

	
	
	
}
