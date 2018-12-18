package selenium.testcases;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static selenium.utils.annotations.browser.Browsers.EDGE;
import static selenium.utils.annotations.browser.Browsers.INTERNET_EXPLORER;
import static selenium.utils.annotations.browser.Browsers.PHANTOMJS;
import static selenium.utils.browser.Screen.XLARGE;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.SeleniumTestWrapper;
import selenium.pageobjects.HeaderSearch;
import selenium.pageobjects.SearchResultPage;
import selenium.pageobjects.StartPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS })
public class SearchIT2 extends SeleniumTestWrapper {

	StartPage startPage = PageFactory.initElements(getDriver(), StartPage.class);
	HeaderSearch search = PageFactory.initElements(getDriver(), HeaderSearch.class);
	SearchResultPage searchResultPage = PageFactory.initElements(getDriver(), SearchResultPage.class);

	WebDriver driver = null;
	
	@Before
	public void setup() {
		startPage.open();
	}

	@Test
	public void clickAboutUs() throws IOException, InterruptedException 	{
 	   
	      // Properties prop=new Properties();
	  
	     
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
