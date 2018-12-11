package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class baseTest{
	
	public WebDriver driver=null;
	
	@Test
	public WebDriver Login() throws IOException, InterruptedException
	{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\dev\\QA\\assets\\data.properties");
		//FileInputStream fis=new FileInputStream("\\QA\\assets\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		//System.out.println("browserName");
		
		
		if(browserName.equals("chrome"))
		{
			 WebDriverManager.chromedriver().setup(); 
			//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup(); 
			//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else 
		{
			 driver = new InternetExplorerDriver();
		}
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		  driver.get("https://test.artlist.io/");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("user-login-btn")).click();
		  driver.findElement(By.name("loginemail")).sendKeys("ilanmg@artlist.io");
		  driver.findElement(By.id("logpassword")).sendKeys("Tomido12");
		  driver.findElement(By.id("btnlogin")).click(); 
		  
		 //Thread.sleep(2000);
		 // driver.close();
		  return driver;
		 
		 
		  //driver.manage().window().maximize();
		 // driver.findElement(By.id("user-login-btn")).click();
		  //driver.findElement(By.id("logemail")).sendKeys("email");
		 // driver.findElement(By.id("logpassword")).sendKeys("password");
		  //driver.findElement(By.xpath("//*[@id=\"btnlogin\"]")).click();		}
		
	}	
	