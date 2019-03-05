package selenium.testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.Common.Modals;
import selenium.pageobjects.Common.SiteHeader;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.login.LoginPage;
import selenium.pageobjects.modal.StartNowModal;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

import static selenium.utils.annotations.browser.Browsers.*;
import static selenium.utils.browser.Screen.XLARGE;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })
public class StartNowModalTest extends SeleniumTestWrapper {

    StartPage startPage = PageFactory.initElements(getDriver(), StartPage.class);
    LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
    WebDriver driver = startPage.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 1);
    Modals modals = PageFactory.initElements(getDriver(), Modals.class);

    @BeforeTest
    public void setup() {
        startPage.open();
    }

    @Test(groups ={"sanity"},  description= "the script is performing login from the Start Now button")
    public void login() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("user-login-btn")));
        driver.findElement(By.id("user-login-btn")).click();
        SiteHeader siteHeader = PageFactory.initElements(getDriver(), SiteHeader.class);
        StartNowModal StartNowModal = PageFactory.initElements(getDriver(), StartNowModal.class);

        Thread.sleep(3000);
        siteHeader.clickStartNowBtn();
        StartNowModal.setFullName("ilan amgar");
        StartNowModal.setEmail("ilanmg@artlist.io");
        StartNowModal.setPassWord("Tomido12");
        StartNowModal.clickFreeSignUp();
      
    }
}

