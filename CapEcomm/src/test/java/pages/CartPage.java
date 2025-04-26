package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class CartPage {
	WebDriver d;
	By cont_shop = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
	By cart = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
	By name_pro = By.xpath("//*[@id=\"product-4\"]/td[2]/h4/a");
	By price = By.xpath("//*[@id=\"product-4\"]/td[3]/p");
	By quant = By.xpath("//*[@id=\"product-4\"]/td[4]/button");
	By proceedtocheck = By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");
	By login_btn =By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a"); 
	By email_log = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
	By pass_log = By.name("password");
	By loginbtn = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	By cart_menu = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
	By name_payment = By.name("name_on_card");
	By cardnum_payment = By.name("card_number");
	By cvv_payment = By.name("cvc");
	By expirymon_payment = By.name("expiry_month");
	By expiryyear_payment = By.name("expiry_year");
	By veriforder = By.xpath("//*[@id=\"form\"]/div/div/div/p");
	
	public CartPage(WebDriver d) {
		this.d=d;
	}

	
	public void cont_shopping() {
		d.findElement(cont_shop).click();
	}
	
	public void cart() {
		d.findElement(cart).click();
	}
	
	public void verify() {
		String expected = d.findElement(name_pro).getText();
		String actual = "Stylish Dress";
		Assert.assertEquals(actual, expected);
		System.out.println(expected);
		
		String expect = d.findElement(price).getText();
		String actu = "Rs. 1500";
		Assert.assertEquals(actu, expect);
		System.out.println(expect);
		
		String ex = d.findElement(quant).getText();
		String ac = "1";
		Assert.assertEquals(ac, ex);
		System.out.println(ex);
		
	}
	
	public void click_proceedtocheckout() {
		d.findElement(proceedtocheck).click();
	}
	public void click_login() {
		d.findElement(login_btn).click();
	}
	
	public void emaillogin(String mail) {
		d.findElement(email_log).sendKeys(mail);
	}
	
	public void passlog(String passlog) {
		d.findElement(pass_log).sendKeys(passlog);
	}
	
	public void loginbtnn() {
		d.findElement(loginbtn).click();
	}
	public void cartmenu() {
		d.findElement(cart_menu).click();
	}
	public void namepayment(String namepay) {
		d.findElement(name_payment).sendKeys(namepay);
	}
	public void cardnumpayment(String cardnum) {
		d.findElement(cardnum_payment).sendKeys(cardnum);
	}
	public void cvcpayment(String cvv) {
		d.findElement(cvv_payment).sendKeys(cvv);
	}
	public void expirymonpayment(String mon) {
		d.findElement(expirymon_payment).sendKeys(mon);
	}
	public void yearpayment(String year) {
		d.findElement(expiryyear_payment).sendKeys(year);
	}
	
	public void orderverify() throws IOException {
		String expected =d.findElement(veriforder).getText();
		String actual = "Congratulations! Your order has been confirmed!";
		Assert.assertEquals(actual, expected);
		System.out.println(expected);
		TakesScreenshot screen = (TakesScreenshot)d;
		File sc = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\Rajagopal\\Downloads\\JAVA_WIPRO\\SCREENSHOTS\\CART.png"));
		
	}
	
}
