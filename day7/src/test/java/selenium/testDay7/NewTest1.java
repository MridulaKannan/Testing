package selenium.testDay7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

 class NewTest1 {
	
  @Test(description="Veriied Title")
  public void verifyTitle() {
	  
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
	  Assert.assertEquals(title,driver.getTitle());
  }
}
