package selenium.pageobjects.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

public class SiteHeader extends Pages {

    public SiteHeader (WebDriver driver) {
        super(driver);
    }



    @FindBy(css = "#user-login-btn")
    private WebElement sginInbtn;

    @FindBy(css = "div.login > a#user-logined-btn")
    private WebElement accountBtn;

    @FindBy(css = ".start-btn.topsign")
    private WebElement startNowBtn;

    @FindBy(css = "div.login >.price-btn.for-new")
    private WebElement pricingBtn;

    @FindBy(css="div.login > a.start-btn")
    private WebElement startnowbtnInput;





    public WebElement clickOnSignIn() {
        waitForElement(sginInbtn, 10);
        sginInbtn.click();
        return sginInbtn;
    }

    public WebElement clickOnStartNowIn() {
        waitForElement(startNowBtn, 10);
        startNowBtn.click();
        return startNowBtn;

    }

    public WebElement clickOnPricingBtn() {
        waitForElement(pricingBtn, 10);
        pricingBtn.click();
        return pricingBtn;
    }

    public WebElement clickStartNowBtn() {
        waitForElement(startnowbtnInput, 10);
        startnowbtnInput.click();
        return startnowbtnInput;
    }

    public String getAccountValue() {
        waitForElement(accountBtn, 10);
        return accountBtn.getText();
    }




}


