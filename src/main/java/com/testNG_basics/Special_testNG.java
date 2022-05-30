package com.testNG_basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Special_testNG {
	
	//@BeforeMethod > @Test1 > @Test2 > @Test3 >AfterMethod
	@BeforeMethod
	public void init() {
		System.out.println("this is before method annotation");
	}
	
	@Test
	public void test1() {
		System.out.println("this is first test case");
	}
	
	@Test
	public void test2() {
		System.out.println("this is second test case");
	}
	
	@Test
	public void test3() {
		System.out.println("this is third test case");
	}
	
	@AfterMethod
	public void end() {
		System.out.println("this is after method annotation");
	}

}
