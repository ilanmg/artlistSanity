
package selenium.testcases;

import static selenium.utils.annotations.browser.Browsers.EDGE;
import static selenium.utils.annotations.browser.Browsers.INTERNET_EXPLORER;
import static selenium.utils.annotations.browser.Browsers.PHANTOMJS;
import static selenium.utils.browser.Screen.XLARGE;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.SiteHeader;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.login.LoginPage;
import selenium.pageobjects.modal.JoinModal;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })

public class JoinTest extends SeleniumTestWrapper {

    StartPage  startPage = PageFactory.initElements(getDriver(), StartPage.class);
    LoginPage  loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
    SiteHeader siteHeader = PageFactory.initElements(getDriver(), SiteHeader.class);
    JoinModal joinModal = PageFactory.initElements(getDriver(), JoinModal.class);

    WebDriver driver = startPage.getDriver();
    //WebDriverWait wait = new WebDriverWait(driver, 5);

    @BeforeTest
    public void setup() {
        startPage.open();
    }

    @Test(groups ={"Artlist"}, description= "the script is clicking the join link just to make sure the user is led to the free-trial page")
    public void joinUs() throws InterruptedException {

        siteHeader.clickOnSignIn();
        loginPage.clickJoinLink();
        
        Thread.sleep(3000);
       
    }
}

















