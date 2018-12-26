
package selenium.testcases;

import static selenium.utils.annotations.browser.Browsers.EDGE;
import static selenium.utils.annotations.browser.Browsers.INTERNET_EXPLORER;
import static selenium.utils.annotations.browser.Browsers.PHANTOMJS;
import static selenium.utils.browser.Screen.XLARGE;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.MusicList;
import selenium.pageobjects.Common.SiteHeader;
import selenium.pageobjects.HeaderSearch;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.login.LoginPage;
import selenium.pageobjects.modal.JoinModal;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })

public class playSong extends SeleniumTestWrapper {

    StartPage  startPage = PageFactory.initElements(getDriver(), StartPage.class);
    LoginPage  loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
    SiteHeader siteHeader = PageFactory.initElements(getDriver(), SiteHeader.class);
    JoinModal joinModal = PageFactory.initElements(getDriver(), JoinModal.class);
    MusicList musicList = PageFactory.initElements(getDriver(), MusicList.class);
    
    
    WebDriver driver = startPage.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 5);

    @Before
    public void setup() {
        startPage.open();
    }

    @Test
    public void playSong() throws InterruptedException {

//    	MusicList.clickplayIcon().click();
        //loginPage.clickJoinLink();
        //joinModal.setFullName('tets')
       // joinModal.setEMail('tets@test.io');
      //  joinModal.setPassword('tets@test.io');
      //  joinModal.clckOnJoin();


    }
}

















