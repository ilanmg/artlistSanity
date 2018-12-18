package Artlist;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Parameters;
import resources.baseTest;



public class addToCartGetLicenseTest extends baseTest{

	 @BeforeTest
     public void addToCartGetLicense() throws IOException, InterruptedException { 
	      Login();
	      Thread.sleep(5000);
		
      }	
	 
	@Test
		public void addingSongToCart() throws IOException, InterruptedException
		  	{
	    		driver.findElement(By.cssSelector("#song_9184 a.add-cart")).click();
	    		Thread.sleep(2000);
	    		driver.findElement(By.className("carttop")).click();
	    		Thread.sleep(2000);
	    		driver.findElement(By.cssSelector("#btnCheckOut")).click();
	    		Thread.sleep(2000);
	    		driver.findElement(By.id("congratscompletepayment")).click();
	    		Thread.sleep(2000);
	    		driver.findElement(By.cssSelector("#startnow-next > button > span:nth-child(1)")).click();  
	    		                               
   		    }
    
	 @AfterTest
		  public void afterTest() {
			  driver.close();
		  }
			
	} 


	

		
	

		

		
	
	
