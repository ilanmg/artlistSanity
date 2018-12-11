package Artlist;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.baseTest;

public class paymentTest extends baseTest{
	
	@SuppressWarnings("null")
	@Test
	public void payment() throws InterruptedException, IOException
	{
		Login();
		 //WebDriverManager.chromedriver().setup(); 
		 //driver = new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		//driver.get("https://test.artlist.io/");
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"top-bar\"]/div[1]/div/div/div/div[2]/div/a[1]")).click();
		driver.findElement(By.id("visitor-fullname")).sendKeys("ilan amgar");
		Thread.sleep(2000);
		driver.findElement(By.id("visitoremail")).sendKeys("test74@artlist1.io");
		Thread.sleep(2000);
		driver.findElement(By.id("visitor-password")).sendKeys("Tomido12");
		driver.findElement(By.id("free-signup")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='creditcard']")).click();
		//driver.findElement(By.name("payMethodNextStep")).click();
		
		//System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"bluesnap-area-name-NextStep\"]")).sendKeys("ilan amgar");
		driver.switchTo().frame(driver.findElement(By.name("bluesnap-hosted-iframe-ccn")));
		driver.findElement(By.xpath("//*[@id=\"ccn\"]")).sendKeys("4263982640269299");
		//driver.findElement(By.xpath("//*[@id=\"ccn\"]")).sendKeys("9826");
		//driver.findElement(By.xpath("//*[@id=\"ccn\"]")).sendKeys("4026");
		//driver.findElement(By.xpath("//*[@id=\"ccn\"]")).sendKeys("9299");
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("bluesnap-hosted-iframe-exp")));
		driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("04");
		driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("23");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("bluesnap-hosted-iframe-cvv")));
		driver.findElement(By.id("cvv")).sendKeys("837");
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//By form = null;
		//form.findElement((SearchContext) By.id("registerFormFree-NextStep"));
		driver.findElement(By.id("btnRegUserFree-NextStep")).click();
		//driver.findElement(By.id("bluesnap-area-top-msg-NextStep")).click();
		Thread.sleep(5000);
		
	}
	 @AfterTest
	  public void afterTest() {
		  driver.close();
	  }
		
	
}


	
