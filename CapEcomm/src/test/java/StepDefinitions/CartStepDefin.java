package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;

public class CartStepDefin {
	WebDriver d;
	CartPage cart;
	@Given("User is on products page")
	public void user_is_on_products_page() {
		d=new ChromeDriver();
		d.get("https://www.automationexercise.com/products");
		d.manage().window().maximize();
	}

	@When("Add to cart")
	public void add_to_cart() throws InterruptedException {
		((JavascriptExecutor) d).executeScript("arguments[0].click();", d.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[5]/div/div[1]/div[1]/a")));
		Thread.sleep(2000);
	}

	@When("Click on view cart")
	public void click_on_view_cart() {
		CartPage cart = new CartPage(d);
		cart.cont_shopping();
		cart.cart();
	}

	@When("verify product details in cart")
	public void verify_product_details_in_cart() {
		CartPage cart = new CartPage(d);
		cart.verify();
		cart.click_proceedtocheckout();
		cart.click_login();
		cart.emaillogin("s23verse@gmail.com");
		cart.passlog("Sai@12345");
		cart.loginbtnn();
		cart.cartmenu();
		cart.click_proceedtocheckout();
		((JavascriptExecutor) d).executeScript("arguments[0].click();", d.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")));
		cart.namepayment("Gandikota Venkat Sai Kumar");
		cart.cardnumpayment("4073987745661234");
		cart.cvcpayment("565");
		cart.expirymonpayment("11");
		cart.yearpayment("2029");
		((JavascriptExecutor) d).executeScript("arguments[0].click();", d.findElement(By.id("submit")));
	}
	@Then("cart functionality performed")
	public void cart_functionality_performed() throws IOException {
		CartPage cart = new CartPage(d);
		cart.orderverify();
	}

}
