package selenium.testDay7;

import org.testng.annotations.Test;

public class NewTest {
  
	@Test(description="my test class case",priority=2)
	public void description()
	{
		System.out.print("TestNG"+" ");
	}
	
	@Test(priority=1)
	public void priority()
	{
		System.out.print("Priority Attribute"+" ");
	}
	
	@Test(enabled=true)
	public void enable()
	{
		System.out.print("Enabled Attribute");
	}
	
	@Test(dependsOnMethods="description")
	public void dependsOn()
	{
		System.out.print("DependsOnMethod");
	}
}
