package selenium.pageobjects.modal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

public class StartNowModal extends Pages {

    public StartNowModal(WebDriver driver) { super(driver); }

    @FindBy(linkText = "Start Now")
    private WebElement startnowbtnInput;

    @FindBy(id = "visitor-fullname")
    private WebElement fullNameInput;

    @FindBy(id = "visitoremail")
    private WebElement emailInput;

    @FindBy(id = "visitor-password")
    private WebElement passwordInput;

    @FindBy(id = "free-signup")
    private WebElement freeSignUpBtn;



    public WebElement clickStartNowBtn() {
        waitForElement(startnowbtnInput, 10);
        startnowbtnInput.click();
        return startnowbtnInput;
    }

    public WebElement setFullName(String fullName) {
        waitForElement(fullNameInput, 10);
        fullNameInput.sendKeys(fullName);
        return fullNameInput;
    }

    public WebElement setEmail(String email) {
        waitForElement(emailInput, 10);
        emailInput.sendKeys(email);
        return emailInput;
    }

    public WebElement setPassWord(String password) {
        waitForElement(passwordInput, 10);
        passwordInput.sendKeys(password);
        return passwordInput;
    }

    public WebElement clickFreeSignUp() {
        waitForElement(freeSignUpBtn, 10);
        freeSignUpBtn.click();
        return freeSignUpBtn;
    }

//    public void closeModal();
//    public void emailIsValid();
//    public void passWordIsValid();
//    public void joinUsModalIsDisplayed();


}
