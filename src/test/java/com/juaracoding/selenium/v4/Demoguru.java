package com.juaracoding.selenium.v4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoguru {
  @Test
  public void Login() {
  System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
  String baseURL = "https://demo.guru99.com/V1/index.php";
  WebDriver driver = new ChromeDriver();
  driver.get(baseURL);
  

  
  }
}
