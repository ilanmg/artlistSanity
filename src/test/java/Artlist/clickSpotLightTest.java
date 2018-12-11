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
 

public class clickSpotLightTest extends baseTest{	
		  
		 @BeforeTest
		      public void beforeTest() throws IOException, InterruptedException {
		         Login();
		    }	
	
	
		  @Test
          public void clickSpotLight() throws IOException, InterruptedException
	        {
					  	
					        driver.findElement(By.className("trigger")).click();
					        Thread.sleep(2000);

					        driver.findElement(By.id("spotlight-link")).click();
					        Thread.sleep(2000);
	        }
		  @AfterTest
		  		public void aftertest() {
			  		driver.close();
              }	
        }   
