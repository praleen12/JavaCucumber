package hooksStep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	WebDriver driver= null;
	
	@Before
	public void browserSetup() {
		System.out.println("++++++Before Hook");

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("++++++Before Step");

	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("++++++After Step");

	}
	@After
	public void tearDown() {
		System.out.println("++++++After Hook");

		driver.close();
		driver.quit();
		
	}
	

	@Given("User navigate to tyhe application url")
	public void user_navigate_to_tyhe_application_url() {

	}

	@Given("User enters the Raghav and {int}")
	public void user_enters_the_Raghav_and(Integer int1) {

	}

	@Given("User clicks on login button")
	public void user_clicks_on_login_button() {

	}

	@Then("User is logged in")
	public void user_is_logged_in() {

	}

	@Given("User enters the Leena and {int}")
	public void user_enters_the_Leena_and(Integer int1) {

	}



}
