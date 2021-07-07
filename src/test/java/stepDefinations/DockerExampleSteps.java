package stepDefinations;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class DockerExampleSteps {

	RemoteWebDriver driver;
	
	
	@Before
	public void dockerup() {
		System.out.println("****Docker up****");


		
	}
	
	
	@After
	public void dockerdown() {
		System.out.println("****Docker down****");

		
	}
	

	@Given("Docker run Open Browser")
	public void docker_run_Open_Browser() throws MalformedURLException, InterruptedException {
		System.out.println("Browser opened");

		DesiredCapabilities dc = DesiredCapabilities.chrome();

		URL url = new URL("http://localhost:4444/wd/hub");

		driver = new RemoteWebDriver(url, dc);

		driver.get("https://google.com");
		Thread.sleep(5000);
	}

	@Given("Docker run user is on search page")
	public void docker_run_user_is_on_search_p_age() {
		System.out.println("page searched");
		driver.quit();
	}

}
