package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

public class RegisterStepDefinition {
	WebDriver d;
	RegisterPage register;
	@Given("User on Website")
	public void user_on_website() {
	    d=new ChromeDriver();
	    d.get("https://www.automationexercise.com/");
	    d.manage().window().maximize();
	    d.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	}

	@When("Signup username and password")
	public void signup_username_and_password() {
		RegisterPage register = new RegisterPage(d);
		
		register.enterName("Saig");
		register.enteremail("s23verse@gmail.com");
		register.clicksignup();
	}

	@When("Enter Acc Info")
	public void enter_acc_info() {
	   RegisterPage register = new RegisterPage(d);
	   register.mrtitle();
	   register.password_acc("Sai@12345");
	   
	   WebElement day= d.findElement(By.id("days"));
	   Select day_dob = new Select(day);
	   day_dob.selectByContainsVisibleText("28");
	   WebElement mon= d.findElement(By.id("months"));
	   Select mon_dob = new Select(mon);
	   mon_dob.selectByContainsVisibleText("November");
	   WebElement year= d.findElement(By.id("years"));
	   Select year_dob = new Select(year);
	   year_dob.selectByContainsVisibleText("2002");	   
	   
	   register.newsletter();
	   register.specialoffers();
	}

	@When("Enter Address Info")
	public void enter_address_info() throws InterruptedException, IOException {
		RegisterPage register = new RegisterPage(d);
		register.firstname("Gandikota");
	    register.lastname("Venkat Sai Kumar");
	    register.comp("Wipro");
	    register.address("3-1-717, Lakshmipuram, Nellore");
	    register.state("AP");
	    register.city("Nellore");
	    register.zipcode("524002");
	    register.mobno("8464845006");
	    Thread.sleep(5000);
	    register.cont_nue();
	}

	@When("Logout funtion")
	public void logout_funtion() throws IOException {
		RegisterPage register = new RegisterPage(d);
		register.logout();
	}

	@Then("On homepage")
	public void on_homepage() {
	   
	}

}
