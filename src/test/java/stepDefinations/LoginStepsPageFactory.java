package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.HomePagePageFactory;
import PageFactory.LoginPageFactory;
import io.cucumber.java.en.*;

public class LoginStepsPageFactory {

	WebDriver driver = null;
	LoginPageFactory login;
	HomePagePageFactory home;


	@Given("Launch the browser")
	public void launchNrowser () {
		System.out.println("==I m inside login pagee PF======");
		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}
	
	
	@And("User navigate to tyhe application url")
	public void launch_the_application() {
		driver.get("https://example.testproject.io/web/");
	}
	

	@Given("^User enters the (.*) and (.*)$")
	public void user_enters_the_id_and_passwords(String id, String pwd) {
		login = new LoginPageFactory(driver);
		login.enterUsername(id);
		login.enterPwd(pwd);
		
//		driver.findElement(By.id("name")).sendKeys((id));
//		driver.findElement(By.id("password")).sendKeys(pwd);

	}

	@Given("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		login.clickLogin();
//		driver.findElement(By.id("login")).click();
	}

	@Then("^User is logged in$")
	public void user_is_logged_in() {
		home = new HomePagePageFactory(driver);
		home.validateLogout();
//		driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
	}

}
