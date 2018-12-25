package selenium.testcases;

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
public class search extends SeleniumTestWrapper {

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
    public void search() throws InterruptedException {

        SearchHeader SearchHeader = PageFactory.initElements(getDriver(), SearchHeader.class);


        SearchHeader.clickTriggerIcon();

        Thread.sleep(2000);
        SearchHeader.clickSearchIcon().sendKeys("a");
        //Thread.sleep(4000);
        SearchHeader.clickFirstResult().click();
        Thread.sleep(2000);
        SearchHeader.removeResult().click();

      // Assert.assertTrue(SearchHeader.modalIsVisibile(modals.pricingModal, true));



       // modals.closeModal(modals.pricingModal);



    }
}

