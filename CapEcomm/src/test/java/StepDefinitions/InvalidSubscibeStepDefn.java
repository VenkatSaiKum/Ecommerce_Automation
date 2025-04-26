package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SubscribePage;

public class InvalidSubscibeStepDefn {
	WebDriver d;
	@Given("User has to be on website hompage")
	public void user_has_to_be_on_website_hompage() {
		d =new ChromeDriver();
	    d.get("https://www.automationexercise.com/");
	    d.manage().window().maximize();
	}

	@When("enter email address")
	public void enter_email_address() {
		SubscribePage subpage = new SubscribePage(d);
		subpage.typeinmail("s23versegmail.com");
	}

	@When("clicks btn of subscribe")
	public void clicks_btn_of_subscribe() {
		SubscribePage subpage = new SubscribePage(d);
		subpage.subsbtn();

	}

	@Then("error msg validation")
	public void error_msg_validation() throws IOException {
		SubscribePage subpage = new SubscribePage(d);
		subpage.erroralert();
	}
}
