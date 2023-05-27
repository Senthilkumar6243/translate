package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hardassertt {
	public static String text;
	@Test
	private static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=mobille&crid=32Q0URDPIF9FY&sprefix=mobile%2Caps%2C244&ref=nb_sb_noss_1");
		driver.manage().window().maximize();
		WebElement mobile = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		 text = mobile.getText();
		//System.out.println(text);
	}
	@Test
	private static void brow() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/Samsung-Galaxy-Storage-MediaTek-Battery/dp/B0BMGC6LHP/ref=sr_1_1_sspa?crid=32Q0URDPIF9FY&keywords=mobille&qid=1674569507&sprefix=mobile%2Caps%2C244&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
		driver.manage().window().maximize();
		WebElement mo = driver.findElement(By.xpath("//span[@id=\"productTitle\"]"));
	    text = mo.getText();
		//System.out.println(text);
		Assert.assertEquals(text, text);
		System.out.println("validation");
	}

}
