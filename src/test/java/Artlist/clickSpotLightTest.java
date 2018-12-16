package Artlist;



import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
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
		  		public void afterTest() {
			  		driver.close();
              }	
        }   
