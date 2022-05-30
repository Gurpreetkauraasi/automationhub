package com.testNG_basics;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertion_Method {
	//Assertions in TestNG- special validation within TestNg which will make TestNG adhere to automation testers validation technique alongside tester's logic
    //Types of Assertions- Hardassert() and Softassert()
	public static void a() {
		System.out.println("This is Primart Testcase Part 1");
		System.out.println("This is Primart Testcase Part 2");
		Assert.fail("give your reason why you are failing this Testcase");//hardassert
		System.out.println("Primary Testcase logic1 after assertions");
		}
	
	public static void b() {
		System.out.println("This is Primart Testcase Part 3");
		System.out.println("This is Primart Testcase Part 4");
		SoftAssert softassert= new SoftAssert();// first make obj of softassert
		softassert.fail("This is Soft Failure");
		System.out.println("Primary Testcase logic2 after assertions");
		softassert.assertAll();
		}
	
	public static void c() {
		System.out.println("This is Primart Testcase Part 5");
		System.out.println("This is Primart Testcase Part 6");
		Assert.assertTrue(1<=2, "True condtion");//TestNG will recognizes this successful logic
		Assert.assertFalse(2<=1, "False condtion");//TestNG will recognizes this successful logic and is true as 1<=2 is false
		Assert.assertEquals(true, true);//TestNG will recognizes this successful logic
		Assert.assertNotEquals(false,true);//TestNG will recognizes this successful logic
		System.out.println("Primary Testcase logic3 after assertions");
		}
	
	
	
}
