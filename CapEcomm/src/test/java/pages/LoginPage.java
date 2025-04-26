package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginPage {
	WebDriver d;
	By email_log = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
	By pass_log = By.name("password");
	By loginbtn = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	By log_verify = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
	
	
	public LoginPage(WebDriver d) {
		this.d=d;
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
	
	public void log_verification() throws IOException {
		String verification = d.findElement(log_verify).getText();
		String original = "Logged in as Saig";
		Assert.assertEquals(original, verification);
		System.out.println(verification);
		TakesScreenshot screen = (TakesScreenshot)d;
		File sc = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\Rajagopal\\Downloads\\JAVA_WIPRO\\SCREENSHOTS\\LOGIN.png"));
	}
}
