package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	// locators by @FindBy
	@FindBy(xpath = "//*[@id='user-name']")
	WebElement username;

	@FindBy(xpath = "//*[@id='password']")
	WebElement password;

	@FindBy(xpath = "//*[@id='login-button']")
	WebElement loginButton;

	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String username) {
		this.username.sendKeys(username);
	}

	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}

	public void clickLoginButton() {
		this.loginButton.click();
	}

	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();
	}
}
