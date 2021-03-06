package development;

import static selenium.utils.annotations.browser.Browsers.EDGE;
import static selenium.utils.annotations.browser.Browsers.INTERNET_EXPLORER;
import static selenium.utils.annotations.browser.Browsers.PHANTOMJS;
import static selenium.utils.browser.Screen.XLARGE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.SiteHeader;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.Common.PlaySongsFromHomepage;
import selenium.pageobjects.Common.PricingModal;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })


public class playSong extends SeleniumTestWrapper {

    WebDriver driver = getDriver();

    StartPage startPage = PageFactory.initElements(driver, StartPage.class);
    SiteHeader siteHeader = PageFactory.initElements(driver, SiteHeader.class);
    PlaySongsFromHomepage playSongs = PageFactory.initElements(driver, PlaySongsFromHomepage.class); 
    
  
    @BeforeTest
    public void setup() throws InterruptedException {
        startPage.open();
     }

   
	@Test(description = "this test should play songs and pausing them")
    public void playPauseSong() throws InterruptedException {
			
		maximize();
		
		
		playSongs.clickToPlayFirstSongOnList();
		Thread.sleep(5000);
		
		playSongs.clickCanvasSongWave();
		Thread.sleep(3000);
		
		playSongs.clickToPauseFirstSongOnList();
		Thread.sleep(10000);
		
		playSongs.clickToPlayFirstSongOnList();
		Thread.sleep(5000);
		
		playSongs.clickVolumeSpeaker();
		Thread.sleep(5000);
		
		playSongs.clickTheVolumeSpeakerForTheSecondTime();
		Thread.sleep(5000);
		 Assert.assertEquals(true, siteHeader.startBtnIsDisplayed());
		
    }
}

