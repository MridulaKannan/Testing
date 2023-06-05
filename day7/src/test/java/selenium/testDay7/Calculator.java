package selenium.testDay7;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Calculator {
	
	int num1=20;
	int num2=10;
	
  @Test(priority=1)
  public void addition() {
	  int sum=num1+num2;
	  Assert.assertEquals(sum, 30);
  }
  
  @Test(priority=4)
  public void subtract() {
	  int diff=num1-num2;
	  Assert.assertEquals(diff, 10);
  }
  
  @Test(priority=3)
  public void multiply() {
	  int pro=num1*num2;
	  Assert.assertEquals(pro, 200);
  }
  
  @Test(priority=2)
  public void divide() {
	  int mod=num1/num2;
	  Assert.assertEquals(mod, 2);
  }
}
