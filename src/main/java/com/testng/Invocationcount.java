package com.testng;

import org.testng.annotations.Test;

public class Invocationcount {
	@Test
	private void setpro() {

	System.out.println("hello");	
	}
	@Test(invocationCount = 5)
	private void frand() {

	System.out.println("java");	
	}
	@Test
	private void hand() {

	System.out.println("land");	
	}
	@Test
	private void hammer() {

	System.out.println("grass");	
	}
	

}
