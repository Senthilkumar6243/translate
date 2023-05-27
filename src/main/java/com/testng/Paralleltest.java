package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import base_class.Base_class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Paralleltest extends Base_class {
	@Test
	private void line1() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("BrowserID:"+Thread.currentThread());
	}
	@Test
	private void line2() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
//		browserLaunch("firefox");

		driver.get("https://www.flipkart.com/");
		System.out.println("BrowserID:"+Thread.currentThread());
		
	}
	@Test
	private void line3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		System.out.println("BrowserID:"+Thread.currentThread());

	}
	

}
