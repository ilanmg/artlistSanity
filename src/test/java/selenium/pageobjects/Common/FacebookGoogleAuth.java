package selenium.pageobjects.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

import java.util.Set;

public class FacebookGoogleAuth extends Pages {

    public FacebookGoogleAuth (WebDriver driver) {
        super(driver);
    }
   
    //Google
       
    @FindBy(css = "#gaia_loginform input#Email")
    private WebElement googleEmailOrPhoneInput;

    @FindBy(css = "#gaia_loginform input#next")
    private WebElement googleNextBtn;
   
    @FindBy(css = "#Passwd" )
    private WebElement googlePasswordInput;
    
    @FindBy(css = "#signIn")
    private WebElement googleLoginBtn;
    
    
    //Facebook
    @FindBy(css = "#m_login_email")
    private WebElement setFacebookLoginEmail;
    
    @FindBy(css = "#login_form > ul > li:nth-child(2) > div > input")
    private WebElement setFacebookPassword;
    
    @FindBy(css = "#login_form > ul > li:nth-child(3) > input")
    private WebElement clickFacebookLoginBtn;
   
    
    
    
   
    public void switchToGoogleForm() {

        String[] popUpWindows  = driver.getWindowHandles().toArray(new String[0]);
        this.driver.switchTo().window(popUpWindows[1]);

     }
       
    public WebElement setGoogleEmailOrPhone(String email) {
        waitForElement(googleEmailOrPhoneInput, 10);
        googleEmailOrPhoneInput.sendKeys(email);
        return googleEmailOrPhoneInput;
    }

    public WebElement clickOnGoogleNextBtn() {
        waitForElement(googleNextBtn, 10);
        googleNextBtn.click();
        return googleNextBtn;
    }
    
    public WebElement setGooglePassword(String password) {
        waitForElement(googlePasswordInput, 10);
        googlePasswordInput.sendKeys(password);
        return googlePasswordInput;
    }
    
    public WebElement clickOnGoogleLoginBtn() {
        waitForElement(googleLoginBtn, 10);
        googleLoginBtn.click();
        return googleLoginBtn;
    }
    
    public WebElement setFacebookEmailOrPhone(String email) {
        waitForElement(setFacebookLoginEmail, 10);
        setFacebookLoginEmail.sendKeys(email);
        return setFacebookLoginEmail;
    }


    public void switchToArtlist(String url) {
        switchWindow(url);
    }
    
    public WebElement setFacebookmailOrPhone(String email) {
        waitForElement(setFacebookLoginEmail, 10);
        setFacebookLoginEmail.sendKeys(email);
        return setFacebookLoginEmail;
    }
    public WebElement setFacebookPassword(String password) {
        waitForElement(setFacebookPassword, 10);
        setFacebookPassword.sendKeys(password);
        return setFacebookPassword;
    }
    
    
    public WebElement clickOnFacebookLoginBtn() {
        waitForElement(clickFacebookLoginBtn, 10);
        clickFacebookLoginBtn.click();
        return clickFacebookLoginBtn;
    }
  
}


