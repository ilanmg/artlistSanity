package selenium.pageobjects.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

public class LoginPage extends Pages {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "form .join-link")
    private WebElement loginForm;

    @FindBy(css= "#logemail")
    private WebElement logemail;

    @FindBy(css= "#logpassword")
    private WebElement loaginPasswordInput;

    @FindBy(css= "#btnlogin")
    private WebElement loginBtn;

    @FindBy(css= ".join-link")
    private WebElement joinlink;

    @FindBy(css = "form button.loginBtn--Google")
    private WebElement GoogleElementFromStartNowBtn;
    
    @FindBy(css ="form button.loginBtn--Google")
    private WebElement googleBtnLogin;
    
    @FindBy(css ="form button.loginBtn--Facebook")
    private WebElement facebookBtnLogin;
    
    @FindBy(css = "button.btn.btn-default.loginBtn.loginBtn--Facebook")
    private WebElement FacebookElementFromStartNowBtn;



    public void setEmail(String email){
        waitForElement(logemail, 10);
        logemail.sendKeys(email);
    }

    public void setPassword(String password){
        waitForElement(loaginPasswordInput, 10);
        loaginPasswordInput.sendKeys(password);
    }

    public void clickLoginBtn() {
        waitForElement(loginBtn, 10);
        waitForElement(loaginPasswordInput, 10);
       //waitForElement(logemail, 10);
        loginBtn.click();
    }

    public void clickJoinLink() {
        waitForElement(joinlink, 10);
        waitForElement(loaginPasswordInput, 10);
        waitForElement(logemail, 10);
        joinlink.click();
    }


    public WebElement clickGoogleBtn() {
        waitForElement(googleBtnLogin, 10);
        googleBtnLogin.click();
        return googleBtnLogin;

    }
    
    public WebElement clickFacebookBtn() {
        waitForElement(facebookBtnLogin, 10);
        facebookBtnLogin.click();
        return facebookBtnLogin;

    }
    
    public WebElement clickFacebookBtnAfterClickingStartNowBtn() {
        waitForElement(FacebookElementFromStartNowBtn, 10);
        FacebookElementFromStartNowBtn.click();
        return FacebookElementFromStartNowBtn;

    }
    
    public WebElement clickGoogletnAfterClickingStartNowBtn() {
        waitForElement(GoogleElementFromStartNowBtn, 10);
        GoogleElementFromStartNowBtn.click();
        return GoogleElementFromStartNowBtn;

    }
    
 }
