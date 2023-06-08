package selenium.day8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuesFive {
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		String t1=driver.getTitle();
		String id1=driver.getWindowHandle();
		System.out.print(t1);
		System.out.print(id1);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search1=driver.findElement(By.name("q"));
		search1.sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		String t2=driver.getTitle();
		String id2=driver.getWindowHandle();
		System.out.print(t2);
		System.out.print(id2);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search3=driver.findElement(By.name("q"));
		search3.sendKeys("Cucumber");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		String t3=driver.getTitle();
		String id3=driver.getWindowHandle();
		System.out.print(t3);
		System.out.print(id3);
		
		// to print total tabs opened
		Set<String> total=driver.getWindowHandles();
		System.out.println("Total tabs "+total.size());
		
		driver.quit();
	}

}
