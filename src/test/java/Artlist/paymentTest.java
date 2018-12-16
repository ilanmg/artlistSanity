package Artlist;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.baseTest;

public class paymentTest extends baseTest{
	
	
	@Test
	public void payment() throws InterruptedException, IOException
	{
		Login();
		
		driver.findElement(By.xpath("//*[@id=\"top-bar\"]/div[1]/div/div/div/div[2]/div/a[1]")).click();
		driver.findElement(By.id("visitor-fullname")).sendKeys("ilan amgar");
		Thread.sleep(2000);
		driver.findElement(By.id("visitoremail")).sendKeys("test81@artlist1.io");
		Thread.sleep(2000);
		driver.findElement(By.id("visitor-password")).sendKeys("Tomido12");
		driver.findElement(By.id("free-signup")).click();
		Thread.sleep(3000);
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


	
