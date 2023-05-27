package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_test {
	
	@Test
	@Parameters({"usn" , "pass"})
	private void credentials(String usn , String pass) {
      
		System.out.println("username is "+ usn);
		System.out.println("password is "+ pass);
		
	}

}
