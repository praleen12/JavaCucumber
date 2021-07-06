package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	@FindBy(id = "name")
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_pwd;

	@FindBy(id = "login")
	WebElement btn_login;
	
	WebDriver driver;
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPwd(String pwd) {
		txt_pwd.sendKeys(pwd);
	}

	public void clickLogin() {
		btn_login.click();
	}

}
