package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ContactusPage {
	WebDriver d;
	By contact_us = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
	By Name_get = By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input");
	By email_get =By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input");
	By subject_get =By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input");
	By message_get =By.xpath("//*[@id=\"message\"]");
	By upload_file = By.xpath("//*[@id=\"contact-us-form\"]/div[5]/input");
	By submit = By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input");
	By verifymessage = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]");
	public ContactusPage (WebDriver d) {
		this.d=d;
	}
	
	public void contactusmenu() {
		d.findElement(contact_us).click();
	}
	
	public void nameget(String name) {
		d.findElement(Name_get).sendKeys(name);
	}
	public void emailget(String email) {
		d.findElement(email_get).sendKeys(email);
	}
	public void subjectget (String subj) {
		d.findElement(subject_get).sendKeys(subj);
	}
	public void messageget(String msg) {
		d.findElement(message_get).sendKeys(msg);
	} 
	
	public void uploadfile() {
		WebElement  upl =d.findElement(upload_file);
		upl.sendKeys("C:\\Users\\Rajagopal\\Downloads\\invoice.txt");
	}
	
	public void submitbtn() {
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("arguments[0].click();",d.findElement(submit));
	}
	
	public void verifyMessage() throws IOException {
		String orignal="Success! Your details have been submitted successfully.";
		String expected=d.findElement(verifymessage).getText();
		Assert.assertEquals(orignal, expected,"Doesnt match");
		TakesScreenshot screen = (TakesScreenshot)d;
		File sc = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\Rajagopal\\Downloads\\JAVA_WIPRO\\conatactus.png"));
	}
	@SuppressWarnings("deprecation")
	public void errormsg() throws IOException {
		WebElement expected = d.findElement(email_get);
		
		System.out.println(expected.getAttribute("validationMessage")); 
		TakesScreenshot screen = (TakesScreenshot)d;
		File sc = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\Rajagopal\\Downloads\\JAVA_WIPRO\\SCREENSHOTS\\InvalidContactus.png"));
	}
}
