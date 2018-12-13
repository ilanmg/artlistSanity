package Artlist;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;
 


public class clickMainMenueMoodTest  extends baseTest{	

	
	  @BeforeTest
      public void clickMainMenueMood() throws IOException, InterruptedException 	{
         Login();
     }	

	  @Test
	  public void clickKeyboardShortcut() throws IOException, InterruptedException
	    {
					       
	        driver.findElement(By.className("toggle-sub")).click();
	        Thread.sleep(2000);
	
	        driver.findElement(By.className("side-menu-category-link")).click();
	        Thread.sleep(2000);
	      
	    }	
	  
	  @AfterTest
	    public void afterclass() {
		  driver.close();
	  }	
}   
