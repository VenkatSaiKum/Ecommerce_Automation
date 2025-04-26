package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class RegisterPage {
	WebDriver d;
	By txt_name = By.name("name");
	By email_email = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
	By submit_signup = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
	By radio_mrtitle = By.id("id_gender1");
	By password_pass = By.id("password");
	By news_letter = By.id("newsletter");
	By special_offers = By.id("optin");
	By first_name = By.id("first_name");
	By last_name = By.id("last_name");
	By comp_ny = By.id("company");
	By ad_dress = By.id("address1");
	By state = By.id("state");
	By city = By.id("city");
	By zipc = By.id("zipcode"); 
	By mobnum = By.id("mobile_number");
	By continu_e = By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
	
	By logot = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
	public RegisterPage(WebDriver d) {
		this.d=d;
	}
	
	public void enterName(String username) {
		d.findElement(txt_name).sendKeys(username);
	}
	public void enteremail(String email) {
		d.findElement(email_email).sendKeys(email);
	}
	public void clicksignup() {
		d.findElement(submit_signup).click();
	}
	public void mrtitle() {
		d.findElement(radio_mrtitle).click();
	}
	public void password_acc(String passAcc) {
		d.findElement(password_pass).sendKeys(passAcc);
	}
	public void newsletter() {
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].click();",d.findElement(news_letter));
	} 
	public void specialoffers() {
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].click();",d.findElement(special_offers));
	}
	public void firstname(String firstname) {
		d.findElement(first_name).sendKeys(firstname);
	}
	public void lastname(String lastname) {
		d.findElement(last_name).sendKeys(lastname);
	}
	public void comp(String company) {
		d.findElement(comp_ny).sendKeys(company);
	}
	public void address(String addrss) {
		d.findElement(ad_dress).sendKeys(addrss);
	}
	public void state(String stat) {
		d.findElement(state).sendKeys(stat);
	}
	public void city(String cty) {
		d.findElement(city).sendKeys(cty);
	}
	public void zipcode(String zip) {
		d.findElement(zipc).sendKeys(zip);
	}
	public void mobno(String mbnum) {
		d.findElement(mobnum).sendKeys(mbnum);
	}
	public void cont_nue() throws IOException {
		TakesScreenshot screen = (TakesScreenshot)d;
		File sc = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\Rajagopal\\Downloads\\JAVA_WIPRO\\SCREENSHOTS\\REGISTER.png"));
		d.findElement(continu_e).click();
	}
	
	
	public void logout() throws IOException {
		
		d.findElement(logot).click();
		d.navigate().to("https://www.automationexercise.com/");
		TakesScreenshot screen = (TakesScreenshot)d;
		File sc = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\Rajagopal\\Downloads\\JAVA_WIPRO\\SCREENSHOTS\\HomePage.png"));
	}
	
	
	
}
