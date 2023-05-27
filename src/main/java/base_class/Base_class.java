package base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
	public  static WebDriver driver;
	
	public static void browserLaunch(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
		    driver = new ChromeDriver(); //chrome
//			driver.manage().window().maximize();
			
		}
		else if (type.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}

	}
	public static void getUrl(String value) {
		
		driver.get(value);

	}
	
	public static void inputValueElement(WebElement element , String value) {
		element.sendKeys(value);
	}
	public static void clickOn(WebElement element) {
        element.click();
	}
	

}
