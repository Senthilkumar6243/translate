package com.testng;

import org.testng.annotations.Test;

public class Timeout {
	@Test
	private void browser() {

	System.out.println("chrome");	
	}
	@Test(timeOut = 5000)
	private void drivers() throws InterruptedException {

		System.out.println("frend");
		Thread.sleep(4000);
	}
	

}
