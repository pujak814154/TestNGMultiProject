package codebehind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleWindow {
	
	public WebDriver driver;
@Parameters("browser")
@BeforeClass
public void m1(String browser)
{
	String url = "http://demo.guru99.com/test/newtours/";
	if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","E:\\Workspace\\Library\\GeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	if(browser.equalsIgnoreCase("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", "E:/Workspace/Library/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	driver.get(url);
}
@Test
public void m2()
{
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Puja");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Puja@123");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
}
@AfterClass
public void m3()
{
	System.out.println("loging successfully");
}
}
