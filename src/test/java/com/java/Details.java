package com.java;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Details {
	
	@Parameters({"user","pass"})
	@Test
	private void tc01(String username , String password) {
		System.out.println(username);
		System.out.println(password);
	}


}
