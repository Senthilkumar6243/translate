package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardaser  {
	@Test(retryAnalyzer = Retryclass.class)
	private void movies() {
      String s = "sentikl";
      System.out.println(s);
      String r = "senthil";
      System.out.println(r);
      
      Assert.assertEquals(s, r);
      System.out.println("validation");
      
      
		
	}

}
