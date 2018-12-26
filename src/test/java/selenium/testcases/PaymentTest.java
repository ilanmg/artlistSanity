package selenium.testcases;

import static selenium.utils.annotations.browser.Browsers.EDGE;
import static selenium.utils.annotations.browser.Browsers.INTERNET_EXPLORER;
import static selenium.utils.annotations.browser.Browsers.PHANTOMJS;
import static selenium.utils.browser.Screen.XLARGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.Common.PricingModal;
import selenium.pageobjects.login.LoginPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })


public class PaymentTest extends SeleniumTestWrapper {

    StartPage startPage = PageFactory.initElements(getDriver(), StartPage.class);
    LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
    WebDriver driver = startPage.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 5);
    //Modals modals = PageFactory.initElements(getDriver(), Modals.class);
    PricingModal PricingModal = PageFactory.initElements(getDriver(), PricingModal.class);
    
    @BeforeTest
    public void setup() throws InterruptedException {
        startPage.open();
     }

    @Test
    public void Payment() throws InterruptedException {
    	
    	PricingModal.PricingBtn().click();
    	PricingModal.clicSubscribeNow().click();
    	PricingModal.clickVisaRadioBtn().click();
    	PricingModal.enterVisaNameHolder().sendKeys("a");
    	PricingModal.enterVisaCcn().sendKeys("4263982640269299");
    	
    	driver.switchTo().defaultContent();
    	
    	PricingModal.enterVisaCcn();
    	PricingModal.enterVisaMonth().sendKeys("04");
    	PricingModal.enterVisaYear().sendKeys("23");
    	
    	driver.switchTo().defaultContent();
    	
    	PricingModal.VisaIframeCvv();
    	PricingModal.VisaCvv().sendKeys("837");
    	
    	
    	driver.switchTo().defaultContent();
    	Thread.sleep(5000);
    	
    	PricingModal.VisaNext().click();
    	
    	
    	
    	
    	
    	
    }
}

