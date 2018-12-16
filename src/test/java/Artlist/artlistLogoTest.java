package Artlist;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;

   public class artlistLogoTest extends baseTest{
	   
	   @BeforeTest
       public void Logo() throws IOException, InterruptedException 	{ 
	       Login();
        }	
	   
	   @Test
	   public void artlistLogo() throws IOException, InterruptedException
	   {
				      driver.findElement(By.className("trigger")).click();
				        Thread.sleep(2000);
				      driver.findElement(By.cssSelector("#mainlogo > img")).click();
			       
			          
		}
	   
	   @AfterTest
		  public void afterTest() {
			  driver.close();
		  }
			
	}   
