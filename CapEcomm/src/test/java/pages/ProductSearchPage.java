package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductSearchPage {
	WebDriver d;
	By searchbox = By.id("search_product");
	By searchicon = By.id("submit_search");
	By verifi = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/p");
	
	public ProductSearchPage(WebDriver d) {
		this.d = d;
	}
	
	public void searchtypein(String search_text) {
		d.findElement(searchbox).sendKeys(search_text);
	}
	
	public void searchclick() {
		d.findElement(searchicon).click();
	}
	public void verify() throws IOException {
		String expected =d.findElement(verifi).getText();
		String actual = "Blue Top";
		Assert.assertEquals(actual, expected);
		System.out.println(expected);
		TakesScreenshot screen = (TakesScreenshot)d;
		File sc = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("C:\\Users\\Rajagopal\\Downloads\\JAVA_WIPRO\\SCREENSHOTS\\PRODUCT_SEARCH.png"));
	}
}
