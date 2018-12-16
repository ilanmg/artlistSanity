package Artlist;


import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest; 


public class searchTest  extends baseTest{	

	
		@BeforeTest
		public void beforeclass() throws IOException, InterruptedException {
			Login();
		}
		  @Test
          public void search() throws IOException, InterruptedException
	        {
					  		
		       
		        driver.findElement(By.className("trigger")).click();
		        Thread.sleep(2000);

		        driver.findElement(By.id("txtSearch")).sendKeys("on");
		        Thread.sleep(2000);
		    
		        driver.findElement(By.cssSelector("#artmenu > div > div.searchside > div > div.clear-search > span")).click();
		        Thread.sleep(2000);
		        
		        driver.findElement(By.className("trigger")).click();
		        Thread.sleep(2000);
		     
            }
			
		  @AfterTest
		  public void afterclass() {
			 driver.close();
		  }
	}   
