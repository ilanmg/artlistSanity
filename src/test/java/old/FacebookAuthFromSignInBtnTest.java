package old;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.FacebookGoogleAuth;
import selenium.pageobjects.Common.SiteHeader;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.login.LoginPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

import java.io.IOException;

import static selenium.utils.annotations.browser.Browsers.*;
import static selenium.utils.browser.Screen.XLARGE;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })


public class FacebookAuthFromSignInBtnTest extends SeleniumTestWrapper {

    WebDriver driver = getDriver();

    StartPage startPage = PageFactory.initElements(driver, StartPage.class);
    SiteHeader siteHeader = PageFactory.initElements(driver, SiteHeader.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    FacebookGoogleAuth facebookGoogleAuth = PageFactory.initElements(driver, FacebookGoogleAuth.class); 
    
    @BeforeTest
    public void setup() throws InterruptedException {
        startPage.open();
     }

   	
	@Test(groups ={"Sanity"}, description = "this test performs a login to artlist site through Facebook after clicking the sign in button")
    public void FacebookLogin() throws InterruptedException, IOException {

        String artlistWindowUrl = driver.getCurrentUrl();
        siteHeader.clickOnSignIn();
        maximize();
        
        loginPage.clickFacebookBtn();
        
      
        facebookGoogleAuth.switchToGoogleForm();

        if (facebookGoogleAuth.isFaceBookAllreadyAssign()) {
        	facebookGoogleAuth.setFacebookIncognitoEmail("ilanmg@artlist.io");
            facebookGoogleAuth.setFacebookIncognitoPassword("Tomido1212*");
            facebookGoogleAuth.clickFacebookIncognitoLoginBtn();
            facebookGoogleAuth.switchToArtlist(artlistWindowUrl);
            Assert.assertEquals(true, siteHeader.startBtnIsDisplayed()); 
               	
        } else {
        	
            facebookGoogleAuth.setFacebookmailOrPhone("ilanmgr@gmail.com");
            facebookGoogleAuth.setFacebookPassword("Tomido12*");
            facebookGoogleAuth.clickOnFacebookLoginBtn();
            facebookGoogleAuth.switchToArtlist(artlistWindowUrl);
            Assert.assertEquals(true, siteHeader.startBtnIsDisplayed()); 
        }

       
       
    }
}