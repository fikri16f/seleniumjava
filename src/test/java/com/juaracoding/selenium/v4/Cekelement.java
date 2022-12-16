package com.juaracoding.selenium.v4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cekelement {
  @Test
  public void Element() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
	  String baseURL = "https://formy-project.herokuapp.com/buttons";
	  WebDriver driver = new ChromeDriver();
	  driver.get(baseURL);
	  
	  driver.findElement(By.cssSelector("button[class=\"btn btn-lg btn-primary\"]")).click();
//	  driver.findElement(By.cssSelector("button[class ^=\"btn-primary\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[class=\"btn btn-lg btn-success\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[class=\"btn btn-lg btn-info\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[class=\"btn btn-lg btn-warning\"]")).click();	
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[class=\"btn btn-lg btn-danger\"]")).click();	
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[class=\"btn btn-lg btn-link\"]")).click();	
	  Thread.sleep(2000);
	  
	  driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(1)")).click();	
	  Thread.sleep(2000);
	  
	  driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(2)")).click();	
	  Thread.sleep(2000);
	  
	  driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(3)")).click();	
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("body > div > form > div:nth-child(3) > div > div > div > button:nth-child(1)")).click();	
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("body > div > form > div:nth-child(3) > div > div > div > button:nth-child(2)")).click();	
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#btnGroupDrop1")).click();	
	  Thread.sleep(2000);
//	  driver.findElement(By.cssSelector("##btnGroupDrop1 body > div > form > div:nth-child(3) > div > div > div > div > div > a:nth-child(1)")).click();;
	  
	  driver.close();
  }
  
  
}
