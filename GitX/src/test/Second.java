package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Second {

	@BeforeTest
	public void GoodEvening() {
		System.out.println("Good Evening TestNG");
	}
	
	@Test(groups= {"Smoke"})
	public void Good() {
		System.out.println("Good TestNG");
	}
	
	@BeforeSuite
	public void first() {
		System.out.println("I am the first");
	}
	
	@Parameters({"URI"})
	@Test
	public void SetUp(String urlName) {
		System.out.println(" Personal Loan Set Up");
		System.out.println(urlName);
	}
	
	
	
}
