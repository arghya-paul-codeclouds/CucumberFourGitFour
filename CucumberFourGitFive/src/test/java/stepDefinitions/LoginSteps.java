package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginSteps {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username, String password) {
		loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
	    loginPage.clickLoginButton();
	}

	@Then("User is redirected to the home page")
	public void user_is_redirected_to_the_home_page() {
		homePage = new HomePage(driver);
		boolean isDisplayed = homePage.isLogoDisplayed();
		Assert.assertTrue(isDisplayed, "User log in not successful");
	}

	@Then("The browser gets closed")
	public void the_browser_gets_closed() {
		driver.close();
	}

}
