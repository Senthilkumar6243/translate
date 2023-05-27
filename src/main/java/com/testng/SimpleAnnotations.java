package com.testng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations{
	@BeforeSuite
	private void systemSetProperty() {

		System.out.println("buehbcuehc");
	}
	@BeforeTest
	private void browserLaunch() {

		System.out.println("semnthik");
	}
	@BeforeClass
	private void getUrll() {

		System.out.println("kumar");
	}
	@BeforeMethod
	private void find() {

		System.out.println("find");
	}
	@Test
	private void dropdown() {

		System.out.println("fdrames");
	}
	@AfterMethod
	private void frames() {

		System.out.println("klimes");
	}
	@AfterClass
	private void alert() {

		System.out.println("kudmnd");
	}
	@AfterTest
	private void waitt() {

		System.out.println("jdwidd");
	}
	@AfterSuite
	private void actions() {

		System.out.println("csjkcnskc");
	}
	
	
	
	

}
