package selenium.pageobjects.modal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

public class JoinModal extends Pages {

    public JoinModal(WebDriver driver) { super(driver); }

    @FindBy(id = "visitor-fullname")
    private WebElement fullNameInput;

    @FindBy(id = "visitoremail")
    private WebElement emailInput;

    @FindBy(id = "visitor-password")
    private WebElement passwordInput;

    @FindBy(id = "free-signup")
    private WebElement joinUsBtn;


    public WebElement setPassWord(String password) {
        waitForElement(passwordInput, 10);
        passwordInput.sendKeys(password);
        return passwordInput;
    }


    public WebElement setEmail(String email) {
        waitForElement(emailInput, 10);
        emailInput.sendKeys(email);
        return emailInput;
    }

    public WebElement setFullName(String fullName) {
        waitForElement(fullNameInput, 10);
        fullNameInput.sendKeys(fullName);
        return fullNameInput;
    }

    public WebElement clickFreeSignUp() {
        waitForElement(joinUsBtn, 10);
        joinUsBtn.click();
        return joinUsBtn;
    }


}
