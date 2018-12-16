package Artlist;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;


public class MainMenueMoodScaryAndDarkTest extends baseTest {

	
	 
	 
	 @BeforeTest
     public void MainMenueMoodScaryAndDark() throws IOException, InterruptedException { 
	      Login();
	      Thread.sleep(3000);
		
      }	
	 
	@Test
		public void Mood() throws IOException, InterruptedException
		  	{
				driver.findElement(By.linkText("Mood")).click();
				
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		       
		        WebElement Element = driver.findElement(By.cssSelector("#mCSB_1_container > li:nth-child(15) > a.side-menu-category-link"));
		        js.executeScript("arguments[0].scrollIntoView();", Element);
		        driver.findElement(By.cssSelector("#mCSB_1_container > li:nth-child(15) > a.side-menu-category-link")).click();
		        Thread.sleep(2000);
		       
	    		//driver.findElement(By.className("remove-tag-link")).click();
		        	
   		    }
    
	 @AfterTest
		  public void afterTest() {
			  driver.close();
		  }
			
	} 


	

		
	

		

		
	
	
