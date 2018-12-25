package selenium.pageobjects.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

public class SiteHeader extends Pages {

    public SiteHeader (WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-login-btn")
    private WebElement signIn;

    @FindBy(css = ".start-btn.topsign")
    private WebElement startNowBtn;

    @FindBy(css = ".price-btn.for-new")
    private WebElement pricingBtn;

    @FindBy(linkText="Start Now")
    private WebElement startnowbtnInput;










    public WebElement clickOnSignIn() {
        waitForElement(signIn, 10);
        signIn.click();
        return signIn;
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




}


