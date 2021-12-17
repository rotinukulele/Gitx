package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestlistener interface which  implements TestNg listeners

public class Listeners implements ITestListener {
	
 @Override	
 public void onTestStart(ITestResult result) {
	 
 }
	
 @Override	
 public void onTestSuccess(ITestResult result) {
	 
	 System.out.println(" I successfully executed Listeners pass code");
 }

 @Override	
 public void onTestFailure(ITestResult result) {
	 
	 System.out.println(" I Failed executed Listeners pass code"+result.getTestName());
 }
 
@Override
public void onTestSkipped(ITestResult result) {
	 
 }
 
 
 @Override
 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
 	 
  }
 
 @Override
 public void onStart(ITestContext context) {
	 
 }
 
 @Override
public void onFinish(ITestContext context) {
	 
 }
 
 
}
