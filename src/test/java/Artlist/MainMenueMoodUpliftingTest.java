package Artlist;


import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;



public class MainMenueMoodUpliftingTest extends baseTest{

	 @BeforeTest
     public void MainMenueMoodUplifting() throws IOException, InterruptedException { 
	      Login();
	      Thread.sleep(5000);
		
      }	
	 
	@Test
		public void addingSongToCart() throws IOException, InterruptedException
		  	{
				driver.findElement(By.linkText("Mood")).click();
				 Thread.sleep(2000);
	    		driver.findElement(By.linkText("Uplifting")).click();
	    		 Thread.sleep(2000);
	    		driver.findElement(By.className("remove-tag-link")).click();
	    		
	    		
	    		
	    	  	    		    		
   		    }
    
	 @AfterTest
		  public void afterTest() {
			  driver.close();
		  }
			
	} 


	

		
	

		

		
	
	
