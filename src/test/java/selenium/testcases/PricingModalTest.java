
package selenium.testcases;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.Modals;
import selenium.pageobjects.Common.SiteHeader;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.login.LoginPage;
import selenium.pageobjects.modal.JoinModal;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

import java.util.concurrent.TimeUnit;

import static selenium.utils.annotations.browser.Browsers.*;
import static selenium.utils.browser.Screen.XLARGE;

@BrowserDimension(XLARGE)
@Browser(skip = {INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX})

public class PricingModalTest extends SeleniumTestWrapper {

    StartPage startPage = PageFactory.initElements(getDriver(), StartPage.class);
    SiteHeader siteHeader = PageFactory.initElements(getDriver(), SiteHeader.class);
    Modals modals = PageFactory.initElements(getDriver(), Modals.class);

    WebDriver driver = startPage.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 5);

    @Before
    public void setup() {
        startPage.open();
    }

    @Test
    public void showingPricingPage() throws InterruptedException {
        siteHeader.clickOnPricingBtn();
        Assert.assertTrue(modals.modalIsVisibile(modals.pricingModal, true));
        modals.closeModal(modals.pricingModal);
    }
}

















