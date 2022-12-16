package com.juaracoding.selenium.v4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Forminput {
  @Test
  public void input() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
	  String baseURL = "https://formy-project.herokuapp.com/form";
	  WebDriver driver = new ChromeDriver();
	  driver.get(baseURL);
	  
	 WebElement firstname = driver.findElement(By.cssSelector("#first-name"));
	 firstname.sendKeys("fikri");
	 Thread.sleep(2000);
	 WebElement lastname = driver.findElement(By.cssSelector("#last-name"));
	 lastname.sendKeys("firmansyah");
	 Thread.sleep(2000);
	 WebElement job = driver.findElement(By.cssSelector("#job-title"));
	 job.sendKeys("SQA Automation");
	 Thread.sleep(2000);
	 WebElement radio = driver.findElement(By.id("radio-button-1"));
     radio.click();
     Thread.sleep(1000);
     WebElement radio2 = driver.findElement(By.id("radio-button-2"));
     radio2.click();
     Thread.sleep(1000);
     WebElement checkbox = driver.findElement(By.id("checkbox-1"));
     checkbox.click();
     Thread.sleep(1000);
     
     Select menu = new Select(driver.findElement(By.id("select-menu")));
     menu.selectByValue("1");
     Thread.sleep(1000);
     
     WebElement selectDate = driver.findElement(By.id("datepicker"));
     selectDate.click();
     Thread.sleep(3000);
     List<WebElement> dates = driver.findElements(By.className("day"));

     int count = driver.findElements(By.className("day")).size();
   
	for(int i=0;i<count;i++){
		String text=driver.findElements(By.className("day")).get(i).getText();
	     if(text.equalsIgnoreCase("23")){
	     driver.findElements(By.className("day")).get(i).click();
	     break;
	     }
     } 
    
     Thread.sleep(5000);
	 driver.close();
  }
}
