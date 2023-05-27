package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency {
	@Test
	private void systemSet() {

	System.out.println("ndhs");	
	}
	@Test(dependsOnMethods = "systemSet")
	private void actions() {

	System.out.println("friend");	
	}

	@Test
	private void dropdown() {

	System.out.println("fraud");	
	}
	@Ignore
	@Test
	private void multipoledropdown() {

	System.out.println("maximize");	
	}
	
	@Test(dependsOnMethods = "actions")
	private void frames() {

	System.out.println("minimize");	
	}
	@Ignore
	@Test
	private void xpath() {

	System.out.println("lakhs");	
	}
	@Ignore
	@Test
	private void alert() {

	System.out.println("ground");	
	}


}
