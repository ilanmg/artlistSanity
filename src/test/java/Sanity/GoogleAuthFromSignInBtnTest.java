package Sanity;

import static selenium.utils.annotations.browser.Browsers.EDGE;
import static selenium.utils.annotations.browser.Browsers.INTERNET_EXPLORER;
import static selenium.utils.annotations.browser.Browsers.PHANTOMJS;
import static selenium.utils.browser.Screen.XLARGE;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.*;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.login.LoginPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

@SuppressWarnings("rawtypes")
@BrowserDimension(XLARGE)
@Browser(skip = {INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX})


public class GoogleAuthFromSignInBtnTest extends SeleniumTestWrapper {

    WebDriver driver = getDriver();
  
    StartPage startPage = PageFactory.initElements(driver, StartPage.class);
    SiteHeader siteHeader = PageFactory.initElements(driver, SiteHeader.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    FacebookGoogleAuth facebookGoogleAuth = PageFactory.initElements(driver, FacebookGoogleAuth.class);  

    
    @BeforeTest
    public void setup() throws InterruptedException {
        startPage.open();
       
    }

    @Test(groups = {"Sanity"}, description = "this test performs a login to artlist site through Google after clicking the sign in button")
    public void GoogleLogin() throws InterruptedException, IOException {
    	
    	String artlistWindowUrl = driver.getCurrentUrl();
        
        siteHeader.clickOnSignIn();
        maximize();
        
        loginPage.clickGoogleBtn();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //Assert.assertEquals(true, siteHeader.startBtnIsDisplayed());
        facebookGoogleAuth.switchToGoogleForm();
        if (facebookGoogleAuth.isGoogleAllreadyAssign()) {
        	//checking google on local 
            facebookGoogleAuth.setGoogleEmailOrPhone("ilanmg@artlist.io"); 
            facebookGoogleAuth.clickOnGoogleNextBtn();
            facebookGoogleAuth.setGooglePassword("Tomido1212*");
            facebookGoogleAuth.clickOnGoogleLoginBtn();
            facebookGoogleAuth.switchToArtlist(artlistWindowUrl);
            Assert.assertEquals(false, siteHeader.startBtnIsDisplayed());
        } else {
        	//checking google on remote 
        	facebookGoogleAuth.setGoogleEmailOrPhoneIncognito("ilanmg@artlist.io");
            facebookGoogleAuth.clickOnGoogleNextIncognitoBtn();
            facebookGoogleAuth.setGoogleIncognitoPassword("Tomido1212*");
            facebookGoogleAuth.clickOnGoogleLastNextIncognitoBtn();
            facebookGoogleAuth.switchToArtlist(artlistWindowUrl);
            Assert.assertEquals(true, siteHeader.startBtnIsDisplayed());
        }

        
    }
}