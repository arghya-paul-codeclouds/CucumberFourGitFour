package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(xpath = "//*[@class='app_logo']")
	WebElement appLogo;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isLogoDisplayed() {
		boolean isDisplayed = true;
		if (!appLogo.isDisplayed()) {
			isDisplayed = false;
		}
		return isDisplayed;
	}
}
