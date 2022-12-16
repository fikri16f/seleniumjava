package com.juaracoding.selenium.v4;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation.WithThrowawayExecutorService;

public class Tokopedia {
  @Test
  public void Tokped() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
//	  String baseURL = "https://www.tokopedia.com/";
	 String baseURL = "https://www.tokopedia.com/search?st=product&q=Chana&srp_component_id=01.07.00.00&srp_page_id=&srp_page_title=&navsource=";
		
	  WebDriver driver = new ChromeDriver();
	  driver.get(baseURL);
	  
//	  WebElement Cari = driver.findElement(By.cssSelector("input[placeholder='Cari di Tokopedia']"));
//	  Cari.sendKeys("Chana");
//	  driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();  
//	  Thread.sleep(5000);
	  int hargaTampung = 0;
	  
	  boolean state= true;
	  
	  String path = "//div[@data-testid=\"divProductWrapper\"]/div/div/div/div[2]/a/div[2]/div";
	while (state) {
		try {
			List<WebElement> elements = driver.findElements(By.xpath(path));
			for (WebElement harga : elements) {
				hargaTampung += Integer.parseInt(harga.getText().replaceAll("\\D+", ""));
//				System.out.println(hargaTampung);
			}
			state = false;
		} catch (Exception e) {
			// TODO: handle exception
			state = true;
			System.out.println("Error");
		}
		
		assertTrue (hargaTampung > 0);
	} 
	
	
	driver.close();
	  
  }
}
