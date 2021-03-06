package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	protected WebDriver driver;

	private By txt_username = By.id("name");
	private By txt_pwd = By.id("password");
	private By btn_login = By.id("login");
	private By btn_logout = By.id("logout");


	public loginPage(WebDriver driver) {

		this.driver = driver;
		if (!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not login page "+ driver.getCurrentUrl());
			
		}
		
	}

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterpwd(String pwd) {
		driver.findElement(txt_pwd).sendKeys(pwd);
	}

	public void clickLogin() {
		driver.findElement(btn_login).click();
	}

	public void loginValidUser(String username, String pwd) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_pwd).sendKeys(pwd);
		driver.findElement(btn_login).click();
	}
	
	public void validateLogoutDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
		
	}

}
