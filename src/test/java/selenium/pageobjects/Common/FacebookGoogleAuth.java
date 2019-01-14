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

    @FindBy(css = ".card.signin-card")
    private WebElement googleAllreadyAssign;

    //Google incognito
    @FindBy(css = "div#identifierNext")
    private WebElement googleNextIncognitoBtn;
    
    @FindBy(css = "#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")
    private WebElement googlePasswordIncognitoInput;
    
    @FindBy(id = "passwordNext")
    private WebElement googleLastNextIncognitoBtnInput;


    //Google
    @FindBy(css = "input[type=\"Email\"]")
    private WebElement googleEmailOrPhoneInput;

    @FindBy(css = "input#next")
    private WebElement googleNextBtn;
   
    @FindBy(css = "#Passwd" )
    private WebElement googlePasswordInput;
    
    @FindBy(css = "#signIn")
    private WebElement googleLoginBtn;


    //Facebook
    @FindBy(id = "#m_login_email")
    private WebElement setFacebookLoginEmail;
    
    @FindBy(id = "#m_login_password")
    private WebElement setFacebookPassword;
    
    @FindBy(css = "#login_form > ul > li:nth-child(3) > input")
    private WebElement clickFacebookLoginBtn;

    @FindBy(css = "#u_0_5")
    private WebElement clickFacebookLoginBtnInput;
    
    //Facebook incognito
    @FindBy(css = "#email") 
    private WebElement FacebookLoginEmailInput;

    @FindBy(id = "#pass")
    private WebElement FacebookPasswordIncognitoInput;

    @FindBy(id = "#loginbutton")
    private WebElement FacebookIncognitoLoginBtnInput;



    public boolean isGoogleAllreadyAssign(){
        return isElementPresent(googleAllreadyAssign);
    }

    public boolean isFaceBookAllreadyAssign(){
        return isElementPresent(googleAllreadyAssign);
    }
    
    
   
    public void switchToGoogleForm() {

        String[] popUpWindows  = driver.getWindowHandles().toArray(new String[0]);
        this.driver.switchTo().window(popUpWindows[1]);

     }
    public void switchToFaceBookForm() {

        String[] popUpWindows  = driver.getWindowHandles().toArray(new String[0]);
        this.driver.switchTo().window(popUpWindows[1]);

     }
     
    //Google incognito
    public WebElement setGoogleEmailOrPhoneIncognito(String email) {
        waitForElement(googleEmailOrPhoneInput, 30);
        googleEmailOrPhoneInput.sendKeys(email);
        return googleEmailOrPhoneInput;
    }
    
    public WebElement clickOnGoogleNextIncognitoBtn() {

        waitForElement(googleNextIncognitoBtn, 10);
        googleNextIncognitoBtn.click();
        return googleNextIncognitoBtn;
    }
    
    public WebElement setGoogleIncognitoPassword(String password) {
        waitForElement(googlePasswordIncognitoInput, 10);
        googlePasswordIncognitoInput.sendKeys(password);
        return googlePasswordIncognitoInput;
    }
    
    public WebElement clickOnGoogleLastNextIncognitoBtn() {
        waitForElement(googleLastNextIncognitoBtnInput, 20);
        googleLastNextIncognitoBtnInput.click();
        return googleLastNextIncognitoBtnInput;
    }

  //Facebook incognito
    public WebElement setFacebookIncognitoEmail(String email) {
        waitForElement(FacebookLoginEmailInput, 30);
        FacebookLoginEmailInput.sendKeys(email);
        return FacebookLoginEmailInput;
    }
    public WebElement setFacebookIncognitoPassword(String password) {
        waitForElement(FacebookPasswordIncognitoInput, 30);
        FacebookPasswordIncognitoInput.sendKeys(password);
        return FacebookPasswordIncognitoInput;
    }

    public WebElement clickFacebookIncognitoLoginBtn() {
        waitForElement(FacebookIncognitoLoginBtnInput, 20);
        FacebookIncognitoLoginBtnInput.click();
        return FacebookIncognitoLoginBtnInput;
    }




    //Google
    public WebElement setGoogleEmailOrPhone(String email) {
        waitForElement(googleEmailOrPhoneInput, 30);
        googleEmailOrPhoneInput.sendKeys(email);
        return googleEmailOrPhoneInput;
    }

    public WebElement   clickOnGoogleNextBtn() {
        if(this.isGoogleAllreadyAssign()){
            waitForElement(googleNextBtn, 10);
            googleNextBtn.click();
            return googleNextBtn;
        }
        else{
            waitForElement(googleNextIncognitoBtn, 10);
            googleNextIncognitoBtn.click();
            return googleNextIncognitoBtn;
        }

    }
    
    public void switchToArtlist(String url) {
        switchWindow(url);
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
    
    public WebElement   clickOnFaceBookNextBtn() {
        if(this.isFaceBookAllreadyAssign()){
            waitForElement(clickFacebookLoginBtnInput, 10);
            clickFacebookLoginBtnInput.click();
            return clickFacebookLoginBtnInput;
        }
        else{
            waitForElement(googleNextIncognitoBtn, 10);
            googleNextIncognitoBtn.click();
            return googleNextIncognitoBtn;
        }

    }
    
    //Facebook
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
    


