package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginPage;

public class LoginSteps {
	WebDriver driver;
	loginPage login;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		login = new loginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
	    login.enterUsername(username);
	    login.enterPass(password);
	}

	@And("clicks on Login Button")
	public void clicks_on_login_button() {
	     login.clickLogin();
	}

	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
	    login.isLogoDisplayed();
	}

	@And ("Close the browser")
	public void close_the_browser() {
	    driver.quit();
	}
}
