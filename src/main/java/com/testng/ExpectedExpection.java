package com.testng;

import org.testng.annotations.Test;

public class ExpectedExpection {
	@Test(expectedExceptions = ArithmeticException.class)
	private void hust() {

	int a= 22;
	System.out.println(a/0);
	}
	@Test
	private void gust() {

		System.out.println("senthil");
	}

}
