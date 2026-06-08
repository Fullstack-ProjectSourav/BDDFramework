package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver driver;
		
	@Given("User is on Login")
	public void user_is_on_login() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	// Accept username and password from the Scenario Outline examples
	@When("^User enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username, String password) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[@placeholder='Username']")));

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}

	@When("clicks on Login Button")
	public void clicks_on_login_button() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
		String actualUrl = driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains("dashboard"), "User is not navigated to Dashboard");
        System.out.println("Login Successful");
	}

	@Then("Close the browser")
	public void close_the_browser() {
		  driver.quit();
	     
	}
}
