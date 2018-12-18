package selenium.testcases;



import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class clickAboutUsTest{	

	WebDriver driver = null;
	
		
		     
		       public void clickAboutUs() throws IOException, InterruptedException 	{
		    	   
			       Properties prop=new Properties();
			  
			     
				  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
				  driver.get("https://test.artlist.io/");
				  driver.manage().window().maximize();
				  driver.findElement(By.id("user-login-btn")).click();
				  driver.findElement(By.name("loginemail")).sendKeys("ilanmg@artlist.io");
				  driver.findElement(By.id("logpassword")).sendKeys("Tomido12");
				  driver.findElement(By.id("btnlogin")).click(); 
		
				
		        driver.findElement(By.className("trigger")).click();
		        Thread.sleep(2000);

		        driver.findElement(By.id("about-modal-link")).click();
		        Thread.sleep(3000);
		        
		        driver.findElement(By.cssSelector(" #about-modal > button > span:nth-child(1)")).click();
		       
		   
		
			  driver.close();
		  }	
	}   
