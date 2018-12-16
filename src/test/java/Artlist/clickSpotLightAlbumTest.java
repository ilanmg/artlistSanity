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
 


public class clickSpotLightAlbumTest  extends baseTest{	
	          
		  @BeforeTest
		 	public void beforeTest() throws IOException, InterruptedException {
			 	Login();
		 	}	
	
	
		  @Test
          public void clickSpotLightArtist() throws IOException, InterruptedException
	        {
					  		
			    driver.findElement(By.className("trigger")).click();
			    Thread.sleep(2000);

               driver.findElement(By.id("spotlight-link")).click();
			   Thread.sleep(2000);
					        
		        driver.findElement(By.xpath("//*[@id=\"inspierd\"]/div[2]/div[1]/div/ul/li[3]/a")).click();
				Thread.sleep(2000);
					        
			    driver.findElement(By.xpath("//*[@id=\"inspierd\"]/div[2]/div[1]/div/ul/li[3]/a")).click();
		                 
		     }
				  @AfterTest
				    public void afterclass() {
					  driver.close();
				  }	
			}   
