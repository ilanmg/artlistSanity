package Artlist;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import resources.baseTest;

public class paymentTest extends baseTest{
	
	@SuppressWarnings("null")
	@Test
	public void payment() throws InterruptedException, IOException
	{
		Login();
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		//driver.get("https://test.artlist.io/");
		//driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".start-btn")).click();
		driver.findElement(By.id("visitor-fullname")).sendKeys("ilan amgar");
		driver.findElement(By.id("visitoremail")).sendKeys("test980@artlist1.io");
		Thread.sleep(2000);
		driver.findElement(By.id("visitor-password")).sendKeys("Tomido12");
		driver.findElement(By.id("free-signup")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"registerFormFree-NextStep\"]/fieldset/div/div[1]/div/div[1]/input")).click();
		
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
		//Thread.sleep(20000);
		//driver.navigate().refresh();
		//driver.close();
		//driver.close();
	}
	
	
}


	
