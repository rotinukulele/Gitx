package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class First {

	@Test(groups= {"Smoke"})
	public void Hello() {
		System.out.println("Hello TestNG");
	}
	
    
	@AfterTest
	public void Bye() {
		
		System.out.println("Bye TestNG");
	}
	
	@AfterSuite
	public void last() {
		System.out.println("I am the last");
	}
	
	@Parameters({"URL"})
	@Test
	public void setUp(String urlname) {
		System.out.println("setUp QA enviroments");
		System.out.println(urlname);
	}
	
	
}
