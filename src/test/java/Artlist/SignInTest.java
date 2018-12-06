package Artlist;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import resources.baseTest;



public class SignInTest extends baseTest{


	private static final CharSequence email = null;
	private static final CharSequence password = null;


	@Test(dataProvider="getData")
   		public void basePageNavigation (String email, CharSequence[] password) throws IOException, InterruptedException
		
		{
	    //driver=Login();
		//Object[][] data = getData();
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		Login();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://artlist.io/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-login-btn")).click();
		driver.findElement(By.id("logemail")).sendKeys(email);
		driver.findElement(By.id("logpassword")).sendKeys(password);
		Thread.sleep(2000);;
		driver.findElement(By.id("btnlogin")).click();
		//driver.close();
		}

    
		@DataProvider
		public Object[][] getData() 
		{
		
			Object[][] data = new Object[3][2];
			data[0][0]="ilanmg@artlist.io";
			data[0][1]="Tomido12";
			//data[0][2]="restricted user";
			
			
			data[1][0]="ilanmg@artlist.io";
			data[1][1]="Tomido12";
			//data[1][2]="restricted user";
			
			data[2][0]="ilanmg@artlist.io";
			data[2][1]="Tomido12";
			//data[1][2]="restricted user";
			
			return data;
			
			
		}
		
	} 


		//System.out.println("text");
		//Thread.sleep(2000);
			
		//driver.findElement(By.id("btnlogin")).click();
		//driver.findElement(By.partialLinkText("Sign In")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bjunlogin\"]")));

		
		//driver.close();
			
		/*
		@Test(dataProvider="getData")
		public void SignIn(String email, String password)
		{
			System.out.println("username");
			System.out.println("password");
		}
		*/
	

		
	

		

		
	
	
