package Artlist;



import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import resources.baseTest;
 
public class clickContactUsTest  extends baseTest{	

	
		  @BeforeTest
	          public void beforeTest() throws IOException, InterruptedException 	{
	        Login();
	        }	
	
		  @Test
          public void clickContactUs() throws IOException, InterruptedException
	        {
				
		        driver.findElement(By.className("trigger")).click();
		        Thread.sleep(2000);

		        driver.findElement(By.id("contact-us-link")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.cssSelector("#contact-modal > button:nth-child(1)")).click();
		       
		       // Thread.sleep(2000);
		      
            }	
		  
		  @AfterTest
		  public void afterclass() {
			  driver.close();
		  }	
	}   
