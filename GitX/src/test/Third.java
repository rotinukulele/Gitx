package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Third {

	@Test(enabled=false)
	public void homeLoan() {
		System.out.println("Home Loan");
	}
	
	@Test(groups= {"Smoke"})
	public void laptopLoan() {
		System.out.println("laptop Loan");
	}
	
	@Test
	public void LoginHomeLoanmobile() {
		System.out.println("Mobile Login Home Loan");
		
	}
	
	@Test(dependsOnMethods= {"LoginHomeLoanmobile"})
	public void LoginHomeLoanlaptop() {
		System.out.println("Laptop Login Home Loan");
	}
	
	@Test(timeOut=4000)
	public void LoginHomeLoantab() {
		System.out.println("Tab Login Home Loan");
	}
	
	
	
	@DataProvider
	public Object[][] getData() {
		
		Object [][] data = new Object[3][2];
		data[0][0] = "firstusername";
		data[0][1] = "firstpassward";
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}
}
