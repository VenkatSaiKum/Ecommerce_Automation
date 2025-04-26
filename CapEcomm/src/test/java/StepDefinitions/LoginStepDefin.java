package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDefin {
	WebDriver d;
	LoginPage loginPage;
	
	@Given("User on loginpage")
	public void user_on_loginpage() {
		d=new ChromeDriver();
	    d.get("https://www.automationexercise.com/login");
	    d.manage().window().maximize();
	}

	@When("Enter mailaddress")
	public void enter_mailaddress() {
		LoginPage loginPage = new LoginPage(d);
		loginPage.emaillogin("s23verse@gmail.com");
	}

	@When("Enter password")
	public void enter_password() {
		LoginPage loginPage = new LoginPage(d);
	    loginPage.passlog("Sai@12345");
	    loginPage.loginbtnn();
	}

	@When("verify text")
	public void verify_text() throws IOException {
		LoginPage loginPage = new LoginPage(d);
		loginPage.log_verification();
	}

	@Then("User on login")
	public void user_on_login() {
		System.out.println("On Login Enjoy Shopping!");
	}
}
