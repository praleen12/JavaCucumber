package stepDefinations;

import io.cucumber.java.en.Given;

public class LoginStepsDemo {
	@Given("login to app")
	public void login_to_app() {
		System.out.println("Login Page");
	}

	@Given("logout to app")
	public void logout_to_app() {
		System.out.println("Logout Page");

	}
	

}
