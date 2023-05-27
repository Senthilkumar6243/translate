package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runner_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Stepdefinition {
	
	public static WebDriver driver = Runner_Class.driver;
	
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/index.php");
		
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("SenthikumarParamesh");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("12345678");
	}

	@Then("^user Click The Login Button And It Navigates Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_Search_Hotel_Page() throws Throwable {
		WebElement log = driver.findElement(By.id("login"));
		log.click();
	}

	@Given("^user Login The Adactin Application$")
	public void user_Login_The_Adactin_Application() throws Throwable {
		Thread.sleep(2000);
	}

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByValue("Brisbane");
	}

	@When("^user Select The Hotel Name In Hotel Name Field$")
	public void user_Select_The_Hotel_Name_In_Hotel_Name_Field() throws Throwable {
		WebElement hot = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hot);
		s1.selectByValue("Hotel Hervey");
	}

	@When("^user Select The Roomtype In Roomtype Field$")
	public void user_Select_The_Roomtype_In_Roomtype_Field() throws Throwable {
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(roomtype);
		s2.selectByValue("Super Deluxe");
	}

	@When("^user Select The Room Number In Room Number Field$")
	public void user_Select_The_Room_Number_In_Room_Number_Field() throws Throwable {
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(roomno);
		s3.selectByValue("5");
	}

	@When("^user Enter The Checkin Date In Checkin Date Field$")
	public void user_Enter_The_Checkin_Date_In_Checkin_Date_Field() throws Throwable {
		WebElement Cin = driver.findElement(By.id("datepick_in"));
		Cin.clear();
		Cin.sendKeys("10/01/2023");

	}

	@When("^user Enter The Checkout Date In Checkout Date Field$")
	public void user_Enter_The_Checkout_Date_In_Checkout_Date_Field() throws Throwable {
		WebElement Cout = driver.findElement(By.id("datepick_out"));
		Cout.clear();
		Cout.sendKeys("12/01/2023");
	}

	@When("^user Select The Adultper Room In Adultper Room Field$")
	public void user_Select_The_Adultper_Room_In_Adultper_Room_Field() throws Throwable {
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByValue("3");
	}

	@When("^user Select The Childrenper Room In Chidrenper Room In Childrenper Room Field$")
	public void user_Select_The_Childrenper_Room_In_Chidrenper_Room_In_Childrenper_Room_Field() throws Throwable {
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByValue("2");
	}

	@Then("^user Click The Search Button  And It Navigates Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_Select_Hotel_Page() throws Throwable {
		WebElement sub = driver.findElement(By.id("Submit"));
		sub.click();
	}

	@Given("^user Select Hotel The Adactin Application$")
	public void user_Select_Hotel_The_Adactin_Application() throws Throwable {
		Thread.sleep(2000);
	}

	@When("^user Select The Radio Button In The Select Hotel Page$")
	public void user_Select_The_Radio_Button_In_The_Select_Hotel_Page() throws Throwable {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
	}

	@Then("^user Click The Continue Button And  It Navigates Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_Book_A_Hotel_Page() throws Throwable {
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
	}

	@Given("^user Select The Hotel Name In Adactin Application$")
	public void user_Select_The_Hotel_Name_In_Adactin_Application() throws Throwable {
		Thread.sleep(2000);
	}

	@When("^user Enter The Firstname In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
		WebElement fn = driver.findElement(By.id("first_name"));
		fn.sendKeys("senthil");
	}

	@When("^user Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
		WebElement ln = driver.findElement(By.id("last_name"));
		ln.sendKeys("kumar");
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("79,sarong st");
	}

	@When("^user Enter The Credit Card Number In Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_Number_Field() throws Throwable {
		WebElement cardno = driver.findElement(By.id("cc_num"));
		cardno.sendKeys("1234567890236547");
	}

	@When("^user Select The Credit Card Type In Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
		WebElement cardt = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cardt);
		s6.selectByValue("OTHR");
	}

	@When("^user Select The Month Year In Expirydate Field$")
	public void user_Select_The_Month_Year_In_Expirydate_Field() throws Throwable {
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(month);
		s7.selectByValue("8");
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(year);
		s8.selectByValue("2017");
	}

	@When("^user Enter The Cvv Number In Cvv Field$")
	public void user_Enter_The_Cvv_Number_In_Cvv_Field() throws Throwable {
		WebElement cv = driver.findElement(By.id("cc_cvv"));
		cv.sendKeys("1234");
	}

	@Then("^user Click The Booknow Button And It Navigates Logout Page$")
	public void user_Click_The_Booknow_Button_And_It_Navigates_Logout_Page() throws Throwable {
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		Thread.sleep(8000);
	}
	}
	




