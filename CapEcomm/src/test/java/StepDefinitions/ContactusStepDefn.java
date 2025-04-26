package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactusPage;

public class ContactusStepDefn {
	WebDriver d;
	ContactusPage conpage;
	@Given("user on website home")
	public void user_on_website_home() {
	    d =new ChromeDriver();
	    d.get("https://www.automationexercise.com/");
	    d.manage().window().maximize();
	}

	@When("click on contactus")
	public void click_on_contactus() throws InterruptedException {
		ContactusPage conpage = new ContactusPage(d);
		conpage.contactusmenu();
		Thread.sleep(2000);
	}

	@When("fillout get in touch")
	public void fillout_get_in_touch() {
		ContactusPage conpage = new ContactusPage(d);
	    conpage.nameget("Saikuamr");
	    conpage.emailget("s23verse@gmail.com");
	    conpage.subjectget("Enquiry about order");
	    conpage.messageget("I have ordered a stylish dress i still haven't got it!");
	}

	@When("upload file")
	public void upload_file() {
		ContactusPage conpage = new ContactusPage(d);
		conpage.uploadfile();
	}

	@When("click on submit")
	public void click_on_submit() throws InterruptedException {
		ContactusPage conpage = new ContactusPage(d);
		conpage.submitbtn();
		Alert a = d.switchTo().alert();
		a.accept();
	}

	@Then("verify success message")
	public void verify_success_message() throws IOException {
		ContactusPage conpage = new ContactusPage(d);
		conpage.verifyMessage();
	}

}
