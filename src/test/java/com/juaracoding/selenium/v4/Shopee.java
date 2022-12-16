package com.juaracoding.selenium.v4;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Shopee {
	private String baseURL = "https://shopee.co.id/search?keyword=philips";
	private WebDriver driver;
	private WebDriverWait wait;
	private JavascriptExecutor js;

	
	
  @BeforeSuite
  public void Test() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
//	  String baseURL = "https://shopee.co.id/search?keyword=philips\n";
	  
	  
	  	driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		js = (JavascriptExecutor) driver;
		driver.get(baseURL);
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,20000)");
		Thread.sleep(6000);
	}
	
	@Test
	public void priceTest() throws InterruptedException {
		
//		Thread.sleep(10000);
		String path = "//a[@data-sqe=\"link\"]/div/div/div[2]/div[2]/div/span[2]";
		int sum = 0;
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
//		List<WebElement> elements = wait.until(
//			ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(path))
//		);
		List<WebElement> elements = driver.findElements(By.xpath(path));
		
		for (WebElement elem: elements) {
			String a = elem.getText().replaceAll("\\.", "");
			System.out.println(a);
			sum += Integer.parseInt(a);
		}
		
		System.out.println(sum);
		System.out.println(elements.size());
		assertTrue(sum > 0);
		
		driver.quit();

	  
  }
}
