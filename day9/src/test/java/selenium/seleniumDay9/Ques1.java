package selenium.seleniumDay9;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import selenium.day9.CalculatorLogic;

public class Ques1 {
	CalculatorLogic c1=new CalculatorLogic();
	
  @Test(dataProvider="testData")
  public void addMethod(int a,int b,int exp) {
	  int res=c1.add(a, b);
	  Assert.assertEquals(exp, res);
  }
  
  @DataProvider
  public Object[][] testData()
  {
	  return new Object[][] {{1,2,3},{2,2,4}};
  }
  
  @Test(dataProvider="testData1")
  public void subMethod(int c,int d,int exp)
  {
	  int res=c1.sub(c, d);
	  Assert.assertEquals(exp, res);
  }
  @DataProvider
  public Object[][] testData1()
  {
	  return new Object[][] {{2,1,1},{2,2,0}};
  }
  
  @Test(dataProvider="testData2")
  public void mulMethod(int e,int f,int exp)
  {
	  int res=c1.mul(e, f);
	  Assert.assertEquals(exp, res);
  }
  @DataProvider
  public Object[][] testData2()
  {
	  return new Object[][] {{2,2,4},{2,1,2}};
  }
  
  @Test(dataProvider="testData3")
  public void divMethod(int g,int h,int exp)
  {
	  int res=c1.div(g, h);
	  Assert.assertEquals(exp, res);
  }
  @DataProvider
  public Object[][] testData3()
  {
	  return new Object[][] {{6,3,2},{4,2,2}};
  }
}
