package selenium.seleniumDay9;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerDay09 implements ITestListener{
  

@Override
public void onTestStart(ITestResult result) {
	System.out.println("test stated: "+result.getMethod());
	
}

@Override
public void onTestSuccess(ITestResult result) {
	System.out.println("test sucess: "+result.getName());
	
}

@Override
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("test fail: "+result.getName());
	
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}
