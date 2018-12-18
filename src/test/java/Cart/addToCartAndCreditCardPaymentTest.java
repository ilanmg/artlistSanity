package Artlist;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;



public class addToCartAndCreditCardPaymentTest extends baseTest{

	 @BeforeTest
     public void addToCartAndCreditCardPayment() throws IOException, InterruptedException { 
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
	    		driver.findElement(By.id("congratscompletepayment")).click();
	    		Thread.sleep(2000);
		  	}  		
	@Test
	public void paymentAfteraddingToCart() throws IOException, InterruptedException
	    	{
		
	    		driver.findElement(By.xpath("//input[@value='creditcard']")).click();
	    		
	    		Thread.sleep(2000);
	    		driver.findElement(By.xpath("//*[@id=\"bluesnap-area-name-NextStep\"]")).sendKeys("ilan amgar");
	    		driver.switchTo().frame(driver.findElement(By.name("bluesnap-hosted-iframe-ccn")));
	    		driver.findElement(By.xpath("//*[@id=\"ccn\"]")).sendKeys("4263982640269299");
	    			    		
	    		driver.switchTo().defaultContent();
	    		
	    		driver.switchTo().frame(driver.findElement(By.name("bluesnap-hosted-iframe-exp")));
	    		driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("04");
	    		driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("23");
	    		
	    		driver.switchTo().defaultContent();
	    		
	    		driver.switchTo().frame(driver.findElement(By.name("bluesnap-hosted-iframe-cvv")));
	    		driver.findElement(By.id("cvv")).sendKeys("837");
	    		
	    		driver.switchTo().defaultContent();
	    		Thread.sleep(5000);
	    		
	    		driver.findElement(By.id("btnRegUserFree-NextStep")).click();
	    		
	    		Thread.sleep(5000);
	    		                               
   		    }
    
	 @AfterTest
		  public void afterTest() {
			 driver.close();
		  }
			
	} 


	

		
	

		

		
	
	
