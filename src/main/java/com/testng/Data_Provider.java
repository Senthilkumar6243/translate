package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider = "data")
	private void crendentils(String s ,String p) {

		System.out.println("username is "+ s);
		System.out.println("password is "+ p);
	}
	@DataProvider
	private Object[][] data() {

		return new Object[][] {
		
			{"james","4567"},
			{"gosh","0987"},
			{"vicky","123"}
			
		};
		
	}

}
