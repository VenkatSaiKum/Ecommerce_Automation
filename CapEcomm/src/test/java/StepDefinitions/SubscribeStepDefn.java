package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SubscribePage;

public class SubscribeStepDefn {
	WebDriver d;
	@Given("User on website hompage")
	public void user_on_website_hompage() {
	    d =new ChromeDriver();
	    d.get("https://www.automationexercise.com/");
	    d.manage().window().maximize();
	}

	@When("type in Email-id")
	public void type_in_email_id() {
		SubscribePage subpage = new SubscribePage(d);
		subpage.typeinmail("s23verse@gmail.com");
	}

	@When("click on subscribe btn")
	public void click_on_subscribe_btn() {
		SubscribePage subpage = new SubscribePage(d);
		subpage.subsbtn();
	}

	@Then("message validation")
	public void message_validation() throws IOException {
		SubscribePage subpage = new SubscribePage(d);
		subpage.alertmsg();	    
	}
	

}
