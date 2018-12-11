package Artlist;



import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;

public class clickAboutUsTest extends baseTest {	

	
		  @BeforeTest
		       public void clickAboutUs() throws IOException, InterruptedException 	{
			       Login();
		   }	
	
		  @Test
          public void AboutUs() throws IOException, InterruptedException
	        {
				
		        driver.findElement(By.className("trigger")).click();
		        Thread.sleep(2000);

		        driver.findElement(By.id("about-modal-link")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.cssSelector(" #about-modal > button > span:nth-child(1)")).click();
		       
		       // Thread.sleep(2000);
		   }		
		  
		  @AfterTest
		  public void afterclass() {
			  driver.close();
		  }	
	}   
