package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePageFactory {

	@FindBy(id = "logout")
	WebElement btn_logout;

	WebDriver driver;

	public HomePagePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void validateLogout() {
		btn_logout.isDisplayed();

	}

}
