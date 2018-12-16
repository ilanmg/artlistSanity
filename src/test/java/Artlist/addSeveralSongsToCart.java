package Artlist;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;



public class addSeveralSongsToCart  extends baseTest{

	 @BeforeTest
     public void addToCart() throws IOException, InterruptedException { 
	      Login();
	      Thread.sleep(2000);
		
      }	
	 
	@Test
		public void addingSongToCart() throws IOException, InterruptedException
		  	{
	    		driver.findElement(By.cssSelector("#song_9184 a.add-cart")).click();
	    		Thread.sleep(2000);
	    		    		    		
   		    }
	@Test
	public void addingSongToCart1() throws IOException, InterruptedException
	  	{
		   driver.findElement(By.cssSelector("#song_8880 a.add-cart")).click();
		   Thread.sleep(2000);
	  	}
	
	@Test
	public void addingSongToCart2() throws IOException, InterruptedException
	  	{
		   driver.findElement(By.cssSelector("#song_6748 a.add-cart")).click();
		   Thread.sleep(3000);
	  	}
	
	@Test
	public void addingSongToCart3() throws IOException, InterruptedException
	  	{
			driver.findElement(By.cssSelector("#song_8920 a.add-cart")).click();
			Thread.sleep(3000);
	  	}
	
	@Test
	public void addingSongToCart4() throws IOException, InterruptedException
	  	{
			driver.findElement(By.cssSelector("#song_8371 a.add-cart")).click();
			Thread.sleep(3000);
	  	}
	
	@Test
	public void addingSongToCart5() throws IOException, InterruptedException
	  	{
			driver.findElement(By.cssSelector("#song_8686 a.add-cart")).click();
			Thread.sleep(2000);
	  	}
	
	 @AfterTest
		  public void afterTest() throws InterruptedException {
			driver.findElement(By.className("carttop")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.cssSelector("#btnCheckOut")).click();
    		Thread.sleep(2000);
    		driver.findElement(By.cssSelector("#congratulation-modal > button > span:nth-child(1)")).click();  
		 
			driver.close();
		  }
			
	} 


	

		
	

		

		
	
	

