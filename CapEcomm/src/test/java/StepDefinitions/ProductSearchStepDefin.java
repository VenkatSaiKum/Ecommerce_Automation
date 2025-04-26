package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductSearchPage;

public class ProductSearchStepDefin {
	WebDriver d;
	ProductSearchPage searchpage;
	@Given("User on products page")
	public void user_on_products_page() {
		d =new ChromeDriver();
	    d.get("https://www.automationexercise.com/products");
	    d.manage().window().maximize();
	}

	@When("User type-in product")
	public void user_type_in_product() {
		ProductSearchPage searchpage = new ProductSearchPage(d);
		searchpage.searchtypein("Blue Top");
	}

	@When("Click on Search")
	public void click_on_search() {
		ProductSearchPage searchpage = new ProductSearchPage(d);
		searchpage.searchclick();
	}

	@When("Validate product")
	public void validate_product() throws IOException {
		ProductSearchPage searchpage = new ProductSearchPage(d);
		searchpage.verify();
	}

	@Then("verify product")
	public void verify_product() {
		System.out.println("Verified and displayed correct product.");
	}

}
