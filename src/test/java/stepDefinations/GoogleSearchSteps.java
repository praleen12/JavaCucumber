package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	

	@Given("Open Browser")
	public void open_Browser() {
		System.out.println("Im on browser");
		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

	
	@Given("user is on search p[age")
	public void user_is_on_search_p_age() {
		driver.get("https://google.com");
	}

	@When("user enter text in search box")
	public void user_enter_text_in_search_box() throws InterruptedException {
		
//		driver.findElement(By.id("input")).sendKeys("data");
		Thread.sleep(2000);
		driver.quit();
	}

	@When("User cliccks on enter")
	public void user_cliccks_on_enter() {
	}

	@Then("user see the results")
	public void user_see_the_results() {
	}

}
