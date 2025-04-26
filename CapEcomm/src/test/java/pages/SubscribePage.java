package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SubscribePage {
	WebDriver d;
	
	By type_mail = By.cssSelector("#susbscribe_email");
	By susbcribe_btn = By.cssSelector("#subscribe");
	By alertmsg = By.xpath("//*[@id=\"success-subscribe\"]/div");
	public SubscribePage(WebDriver d) {
		this.d =d;
	}
	
	public void typeinmail(String mail) {
		d.findElement(type_mail).sendKeys(mail);
	}
	
	public void subsbtn() {
		d.findElement(susbcribe_btn).click();
	}
	public void alertmsg() throws IOException {
		WebElement alertmsgs = d.findElement(alertmsg);
		TakesScreenshot screen = (TakesScreenshot)d;
		File sc = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\Rajagopal\\Downloads\\JAVA_WIPRO\\SCREENSHOTS\\subscribe.png"));
		String wq= alertmsgs.getText();
		String oq ="You have been successfully subscribed!";
		Assert.assertEquals(oq, wq,"Doesnt match");
		System.out.println(wq);
	}
	@SuppressWarnings("deprecation")
	public void erroralert() throws IOException {
		WebElement errormsg= d.findElement(type_mail);
		System.out.println(errormsg.getAttribute("validationMessage"));
		TakesScreenshot screen = (TakesScreenshot)d;
		File sc = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\Rajagopal\\Downloads\\JAVA_WIPRO\\SCREENSHOTS\\InvalidSubscribe.png"));
	}
}
