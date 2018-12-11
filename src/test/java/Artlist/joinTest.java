package Artlist;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import resources.baseTest;

public class joinTest extends baseTest{

	

	private static final CharSequence name = null;
	private static final CharSequence email = null;
	private static final CharSequence password = null;

	@Test(dataProvider="getData")
	public void loginTest( String name, String email, CharSequence[] password ) throws InterruptedException, IOException	
	{
	
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Login();
		
		//driver.get("https://test.artlist.io/");
	    //driver.manage().window().maximize();
		//driver.findElement(By.id("user-login-btn")).click();
		//driver.findElement(By.name("loginemail")).sendKeys("ilanmg036@artlist.io");
		//driver.findElement(By.id("logpassword")).sendKeys("Tomido12");
		//Thread.sleep(2000);
		driver.findElement(By.className("join-link")).click();
		driver.findElement(By.id("visitor-fullname")).sendKeys("name");
		driver.findElement(By.id("visitoremail")).sendKeys("email");
		driver.findElement(By.id("visitor-password")).sendKeys("password");
		driver.findElement(By.id("free-signup")).click();
		driver.close();
	}
	
		//Thread.sleep(2000);
		
		@DataProvider
		public Object[][] getData() 
		{
		
			Object[][] data = new Object[3][3];
			data[0][0]="ilanmg@artlist.io";
			data[0][1]="Tomido12";
			data[0][2]="restricted user";
						
			data[1][0]="ilanmg@artlist.io";
			data[1][1]="Tomido12";
			data[1][2]="restricted user";
			
			data[2][0]="ilanmg@artlist.io";
			data[2][1]="Tomido12";
			data[1][2]="restricted user";
			
			return data;
			
	}
		 @AfterTest
		  public void afterTest() {
			  driver.close();
		  }
				
}