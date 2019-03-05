package Sanity;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.Modals;
import selenium.pageobjects.Common.SearchHeader;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.login.LoginPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;
import static selenium.utils.annotations.browser.Browsers.*;
import static selenium.utils.browser.Screen.XLARGE;

import java.util.concurrent.TimeUnit;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })


public class searchTest extends SeleniumTestWrapper {

    StartPage startPage = PageFactory.initElements(getDriver(), StartPage.class);
    LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
    WebDriver driver = startPage.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 1);
    Modals modals = PageFactory.initElements(getDriver(), Modals.class);
    SearchHeader searchHeader = PageFactory.initElements(getDriver(), SearchHeader.class); 

    @BeforeTest
    public void setup() { 
        startPage.open();
    }

    @Test(groups ={"sanity"},  description= "the script is searching for a letter, then picks up the first result")
    public void search() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        searchHeader.clickTriggerIcon();
        searchHeader.clickSearchIcon().sendKeys("b");
        searchHeader.clickFirstResult();
       Assert.assertEquals(true, searchHeader.ResultToGetArtlistPageIsDisplayed()); 
    }
}

