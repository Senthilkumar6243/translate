package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_test {
	@Test
	private void systemSet() {

	System.out.println("ndhs");	
	}
	@Test
	private void actions() {

	System.out.println("friend");	
	}
	@Ignore
	@Test
	private void dropdown() {

	System.out.println("fraud");	
	}
	@Test
	private void multipoledropdown() {

	System.out.println("maximize");	
	}
	@Test(enabled = false)
	private void frames() {

	System.out.println("minimize");	
	}
	@Ignore
	@Test
	private void xpath() {

	System.out.println("lakhs");	
	}
	@Test
	private void alert() {

	System.out.println("ground");	
	}

}
