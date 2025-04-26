package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class RemoveCartPage {
	WebDriver d;
	
	By email_log = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
	By pass_log = By.name("password");
	By loginbtn = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	By products_menu = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
	By cont_shop = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
	By cart = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
	
	
	
	public RemoveCartPage(WebDriver d) {
		this.d =d;
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
	public void products_menu() {
		d.findElement(products_menu).click();
	}
	
	public void cont_shopping() {
		d.findElement(cont_shop).click();
	}
	
	public void cart() {
		d.findElement(cart).click();
	}
	public void screenshots() throws IOException {
		TakesScreenshot screen = (TakesScreenshot)d;
		File sc = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\Rajagopal\\Downloads\\JAVA_WIPRO\\SCREENSHOTS\\Rmcart.png"));
	}

}

