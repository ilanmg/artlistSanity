package wip;

import static selenium.utils.annotations.browser.Browsers.EDGE;
import static selenium.utils.annotations.browser.Browsers.INTERNET_EXPLORER;
import static selenium.utils.annotations.browser.Browsers.PHANTOMJS;
import static selenium.utils.browser.Screen.XLARGE;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.SeleniumTestWrapper;
import selenium.pageobjects.StartPage;
import selenium.pageobjects.login.LoginPage;
import selenium.utils.annotations.browser.Browser;
import selenium.utils.annotations.browser.BrowserDimension;
import selenium.utils.annotations.browser.Browsers;

@BrowserDimension(XLARGE)
@Browser(skip = { INTERNET_EXPLORER, EDGE, PHANTOMJS, Browsers.FIREFOX })
public class LoginTest extends SeleniumTestWrapper {

    StartPage startPage = PageFactory.initElements(getDriver(), StartPage.class);
    LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);
    WebDriver driver = startPage.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 1);
    
    
    @BeforeTest
    public void setup() {
        startPage.open();
    }

    @Test(groups ={"Sanity"}, description= "the script should perform a login by giving the Email, Pass, and click the login button")
    public void login() throws InterruptedException {
    	
       // wait.until(ExpectedConditions.elementToBeClickable(By.id("user-login-btn")));
      //  driver.findElement(By.id("user-login-btn")).click();
Thread.sleep(5000);
        loginPage.clickSignInBtn();
        loginPage.setEmail("Login@test.com");
        loginPage.setPassword("qaw1234");
        loginPage.clickLoginBtn();

    }
}

