package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;
	
	By txt_user = By.id("user-name");
	By txt_pass = By.id("password");
	By btn_login = By.id("login-button");
	By logo = By.xpath("//div[@class='app_logo']");
	
	public loginPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public void enterUsername(String username){
		driver.findElement(txt_user).sendKeys(username);   
	}
	
	public void enterPass(String password){
		driver.findElement(txt_pass).sendKeys(password);
	}

	public void clickLogin(){
		driver.findElement(btn_login).click();
	}
	
	public void isLogoDisplayed(){
		driver.findElement(logo).isDisplayed();
	}
	
	public void userLogin(String username, String password){
		driver.findElement(txt_user).sendKeys(username);
		driver.findElement(txt_user).sendKeys(password);
		driver.findElement(logo).click();
	}
}
