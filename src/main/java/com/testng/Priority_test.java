package com.testng;

import org.testng.annotations.Test;

public class Priority_test {
	
	@Test(priority = -1)
	private void simpl() {

	System.out.println("senthil");	
	}
	@Test(priority = -2)
	private void polite() {

	System.out.println("sam");	
	}
	@Test(priority = 1)
	private void logo() {

	System.out.println("house");	
	}
	@Test
	private void police() {

		System.out.println("frog");
	}
	@Test(priority = 2)
	private void prid() {

		System.out.println("fazail");
	}
	

}
