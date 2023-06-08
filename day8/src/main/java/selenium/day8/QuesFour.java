package selenium.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuesFour {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Coimbatore");
		driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Bangalore");
		WebElement date=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','11/12/2023')",date);
	}

}
