package wip;

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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.SeleniumTestWrapper;
//import selenium.pageobjects.Common.PricingPaymentModal;
import selenium.pageobjects.Common.SiteHeader;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.Common.PricingModal;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })


public class PricingPaymentModal extends SeleniumTestWrapper {

    WebDriver driver = getDriver();

    StartPage startPage = PageFactory.initElements(driver, StartPage.class);
    SiteHeader siteHeader = PageFactory.initElements(driver, SiteHeader.class);
    PricingPaymentModal pricingPaymentModal = PageFactory.initElements(driver, PricingPaymentModal.class);
    PricingModal pricingModal = PageFactory.initElements(driver, PricingModal.class);

    @BeforeTest
    public void setup() throws InterruptedException {
        startPage.open();
     }

   
	@Test(description = "this test should enter a valid card and should be succeeded")
    public void PaymentTestSuccess() throws InterruptedException {
		
        siteHeader.clickOnPricingBtn();
        Thread.sleep(2000);
        pricingModal.clickSubscribeNow();
        
        driver.manage().window().maximize();
        
       
    }


	
}

