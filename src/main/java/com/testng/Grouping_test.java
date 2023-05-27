package com.testng;

import org.testng.annotations.Test;

public class Grouping_test {
	@Test(groups = "names")
	private void user() {

	System.out.println("sam");	
	}
	@Test(groups = "names")
	private void pass() {

	System.out.println("desecent");	
	}
	@Test(groups = "names")
	private void log() {

	System.out.println("ground");	
	}
	@Test
	private void hut() {

	System.out.println("kumar");	
	}
	@Test(groups = "water")
	private void plugi() {

	System.out.println("logock");	
	}
	@Test(groups = "water")
	private void drug() {

	System.out.println("plorou");	
	}

}
