package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import base_class.Base_class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbrowser extends Base_class {
	
	@Test(priority = -1)
	private void line1() {
		//browserLaunch("chrome");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		

	}
	@Test
	private void line2() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

	}

}
