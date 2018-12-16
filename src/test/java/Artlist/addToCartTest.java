package Artlist;


import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;



public class addToCartTest extends baseTest{

	 @BeforeTest
     public void addToCart() throws IOException, InterruptedException { 
	      Login();
	      Thread.sleep(5000);
		
      }	
	 
	@Test
		public void addingSongToCart() throws IOException, InterruptedException
		  	{
	    		driver.findElement(By.cssSelector("#song_9184 a.add-cart")).click();
	    		Thread.sleep(2000);
	    		driver.findElement(By.className("carttop")).click();
	    		Thread.sleep(2000);
	    		driver.findElement(By.cssSelector("#btnCheckOut")).click();
	    		Thread.sleep(2000);
	    		driver.findElement(By.cssSelector("#congratulation-modal > button > span:nth-child(1)")).click();  	    		    		
   		    }
    
	 @AfterTest
		  public void afterTest() {
			  driver.close();
		  }
			
	} 


	

		
	

		

		
	
	
