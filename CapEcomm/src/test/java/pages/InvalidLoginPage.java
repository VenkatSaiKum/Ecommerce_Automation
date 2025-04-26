package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InvalidLoginPage {
	WebDriver d;
	By email_log = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
	By pass_log = By.name("password");
	By loginbtn = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	By errormsg = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/p");
	
	public InvalidLoginPage(WebDriver d) {
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
	public void erromsg() throws IOException {
		String Errormessage = d.findElement(errormsg).getText();
		String Actualerror = "Your email or password is incorrect!";
		Assert.assertEquals(Actualerror, Errormessage);
		System.out.println(Errormessage);
		TakesScreenshot screen = (TakesScreenshot)d;
		File sc = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\Rajagopal\\Downloads\\JAVA_WIPRO\\SCREENSHOTS\\InvalidLOGIN.png"));
	}
}
