package Artlist;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.Modals;
import selenium.pageobjects.Common.SearchHeader;
import selenium.pageobjects.Common.SiteHeader;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.login.LoginPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

import static selenium.utils.annotations.browser.Browsers.*;
import static selenium.utils.browser.Screen.XLARGE;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })
public class closeTriggerIconTest extends SeleniumTestWrapper {

    StartPage startPage = PageFactory.initElements(getDriver(), StartPage.class);
    LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
    WebDriver driver = startPage.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 5);
    Modals modals = PageFactory.initElements(getDriver(), Modals.class);

    @Before
    public void setup() {
        startPage.open();
    }

    @Test
    public void CloseTrigger() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("user-login-btn")));
        driver.findElement(By.id("user-login-btn")).click();
        SiteHeader siteHeader = PageFactory.initElements(getDriver(), SiteHeader.class);
        SearchHeader SearchHeader = PageFactory.initElements(getDriver(), SearchHeader.class);

        SearchHeader.clickTriggerIcon();
        SearchHeader.closeTriggerIcon();



       // Assert.assertTrue(modals.modalIsVisibile(modals.pricingModal, true));
       // modals.closeModal(modals.pricingModal);



    }
}

