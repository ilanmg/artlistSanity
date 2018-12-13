package Artlist;


import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;
 


public class clickSpotLightCollectionTest  extends baseTest{	

	
		@BeforeTest
	               public void beforeTest() throws IOException, InterruptedException {
	                   Login();
	        }	
	
		  @Test
          public void clickSpotLightCollection() throws IOException, InterruptedException
	        {
					  	
					        driver.findElement(By.className("trigger")).click();
					        Thread.sleep(2000);

					        driver.findElement(By.id("spotlight-link")).click();
					        Thread.sleep(2000);
					        
					        driver.findElement(By.xpath("/html/body/section[1]/div[2]/section/div/main/section[5]/div[2]/div[1]/div/ul/li[1]/a")).click();
					      
					        Thread.sleep(2000);
					        
					        driver.findElement(By.xpath("/html/body/section[1]/div[2]/section/div/main/section[5]/div[2]/div[1]/div/ul/li[1]/a")).click();
		                 
		                }
			  @AfterTest
			      public void afterclass() {
				     driver.close();
		 }	
	}   
