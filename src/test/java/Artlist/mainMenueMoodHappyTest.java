package Artlist;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;



public class mainMenueMoodHappyTest extends baseTest{

	 @BeforeTest
     public void mainMenueMoodHappy() throws IOException, InterruptedException { 
	      Login();
	      Thread.sleep(5000);
		
      }	
	 
	@Test
		public void addingSongToCart() throws IOException, InterruptedException
		  	{
				driver.findElement(By.linkText("Mood")).click();
				 Thread.sleep(2000);
	    		driver.findElement(By.linkText("Happy")).click();
	    		 Thread.sleep(2000);
	    		driver.findElement(By.className("remove-tag-link")).click();
	    		
	    		
	    		
	    	  	    		    		
   		    }
    
	 @AfterTest
		  public void afterTest() {
			  driver.close();
		  }
			
	} 


	

		
	

		

		
	
	
