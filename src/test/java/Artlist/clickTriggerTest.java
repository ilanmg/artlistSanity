package Artlist;


import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;
 


public class clickTriggerTest  extends baseTest{	

	
		@BeforeTest
		public void clickTrigger() throws IOException, InterruptedException {
			Login();
		}
		  @Test
          public void search() throws IOException, InterruptedException
	        {
				driver.findElement(By.className("trigger")).click();
		        Thread.sleep(3000);

		        driver.findElement(By.className("trigger")).click();
		       
		     
            }
			
		  @AfterTest
		  public void afterTest() {
			 driver.close();
		  }
	}   
