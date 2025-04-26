package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RemoveCartPage;

public class RemoveCartStepDefn {
	WebDriver d;
	@Given("On lognpage")
	public void on_lognpage() {
	    d=new ChromeDriver();
	    d.get("https://www.automationexercise.com/login");
	    d.manage().window().maximize();;
	}

	@When("loggedin")
	public void loggedin() {
		RemoveCartPage rmcart = new RemoveCartPage(d);
		rmcart.emaillogin("s23verse@gmail.com");
		rmcart.passlog("Sai@12345");
		rmcart.loginbtnn();
	}

	@When("productadded to cart")
	public void productadded_to_cart() throws InterruptedException {
		RemoveCartPage rmcart = new RemoveCartPage(d);
		rmcart.products_menu();
		((JavascriptExecutor) d).executeScript("arguments[0].click();", d.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[5]/div/div[1]/div[1]/a")));
		Thread.sleep(1500);
		rmcart.cont_shopping();

	}

	@When("Remove from cart")
	public void remove_from_cart() throws IOException {
		RemoveCartPage rmcart = new RemoveCartPage(d);
		rmcart.cart();
		((JavascriptExecutor) d).executeScript("arguments[0].click();", d.findElement(By.xpath("//*[@id=\"product-4\"]/td[6]/a")));
		rmcart.screenshots();
	}

	@Then("valdiate products")
	public void valdiate_products() {
	    
	}

}
