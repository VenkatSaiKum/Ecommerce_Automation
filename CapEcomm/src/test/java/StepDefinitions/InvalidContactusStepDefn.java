package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactusPage;

public class InvalidContactusStepDefn {
	WebDriver d;
	ContactusPage conpage;
	@Given("user  website home")
	public void user_website_home() {
	    d =new ChromeDriver();
	    d.get("https://www.automationexercise.com/");
	    d.manage().window().maximize();
	}

	@When("clicks on contactus")
	public void clicks_on_contactus() throws InterruptedException {
		
		ContactusPage conpage = new ContactusPage(d);
		conpage.contactusmenu();
		Thread.sleep(2000);
	}

	@When("fillsout get in touch")
	public void fillsout_get_in_touch() {
		ContactusPage conpage = new ContactusPage(d);
	    conpage.emailget("");
	}

	@When("uploads file")
	public void uploads_file() {
		ContactusPage conpage = new ContactusPage(d);
		conpage.uploadfile();
	}
	
	@When("clicks on submit")
	public void clicks_on_submit() {
		ContactusPage conpage = new ContactusPage(d);
		conpage.submitbtn();
	}
	@Then("verify the message")
	public void verify_the_message() throws IOException {
		ContactusPage conpage = new ContactusPage(d);
		conpage.errormsg();
	}

}
