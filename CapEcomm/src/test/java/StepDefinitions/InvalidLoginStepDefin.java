package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InvalidLoginPage;

public class InvalidLoginStepDefin {
	WebDriver d;
	
	@Given("On login page")
	public void on_login_page() {
	    d = new ChromeDriver();
	    d.get("https://www.automationexercise.com/login");
	    d.manage().window().maximize();
	}

	@When("Enter mail and password")
	public void enter_mail_and_password() {
		InvalidLoginPage invalidlogin = new InvalidLoginPage(d);
		invalidlogin.emaillogin("s23verse@gmail.com");
		invalidlogin.passlog("sasdafwe");
	}

	@When("lgn")
	public void lgn() {
		InvalidLoginPage invalidlogin = new InvalidLoginPage(d);
		invalidlogin.loginbtnn();
	}

	@When("error msg")
	public void error_msg() throws IOException {
		InvalidLoginPage invalidlogin = new InvalidLoginPage(d);
		invalidlogin.erromsg();
	}

	@Then("print error")
	public void print_error() {
	    System.out.println("Invalid");
	}
}
