package com.testng;

import org.testng.annotations.Test;

public class Groupofgroup {
	@Test(groups = "music")
	private void wynk() {

	System.out.println("wynk");	
	}
	@Test(groups = "music")
	private void lyric() {

	System.out.println("lyric");	
	}
	@Test(groups = "music")
	private void statues() {

	System.out.println("statues");	
	}
	@Test(groups = "food")
	private void grill() {

	System.out.println("grill");	
	}
	@Test(groups = "food")
	private void chicken() {

	System.out.println("chicken");	
	}
	@Test(groups = "food")
	private void mutton() {

	System.out.println("mutton");	
	}
	@Test
	private void soap() {

	System.out.println("articles");		
	}
	

}
