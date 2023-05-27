package com.adactinrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base_class.Base_class;

public class Runner_class extends Base_class {
	
	public static void main(String[] args) throws Throwable {
		browserLaunch("chrome");
		
		getUrl("https://adactinhotelapp.com/");
		
		WebElement email = driver.findElement(By.id("username"));
		inputValueElement(email, "sredtfgj");
		
		WebElement pass = driver.findElement(By.id("password"));
		inputValueElement(pass, "bshxx");
		
		WebElement login = driver.findElement(By.id("login"));
		clickOn(login);
		
	}

}
