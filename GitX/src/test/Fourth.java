package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fourth {

	@Test
	public void mobileLoginCarLoan() {
		System.out.println("Mobile Login Car Loan");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("I will executed after every method");
	}
	
	
	@Test(groups= {"Smoke"})
	public void laptopLoginCarLoan() {
		System.out.println("Laptop Login Car Loan");
	}
	
	@Test
	public void tabLoginCarLoan() {
		System.out.println("Tab Login Car Loan");
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("I will executed before every method");
	}
	
	@Test
	public void failTestCase() {
		System.out.println("Failed Test case");
		Assert.assertTrue(false);
	}
	
}
