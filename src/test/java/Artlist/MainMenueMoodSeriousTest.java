package Artlist;


import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;



public class MainMenueMoodSeriousTest extends baseTest{

	 @BeforeTest
     public void MainMenueMoodSerious() throws IOException, InterruptedException { 
	      Login();
	      Thread.sleep(3000);
		
      }	
	 
	@Test
		public void Mood() throws IOException, InterruptedException
		  	{
				driver.findElement(By.linkText("Mood")).click();
				 Thread.sleep(2000);
	    		driver.findElement(By.linkText("Serious")).click();
	    		 Thread.sleep(2000);
	    		driver.findElement(By.className("remove-tag-link")).click();
	    		
	    		
	    		
	    	  	    		    		
   		    }
    
	 @AfterTest
		  public void afterTest() {
			  driver.close();
		  }
			
	} 


	

		
	

		

		
	
	