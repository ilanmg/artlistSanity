package selenium.pageobjects.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends Pages {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "loginForm")
    private WebElement loginForm;

    @FindBy(id= "logemail")
    private WebElement logemail;

    @FindBy(id= "logpassword")
    private WebElement loaginPasswordInput;

    @FindBy(id= "btnlogin")
    private WebElement loginBtn;




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
        waitForElement(logemail, 10);
        loginBtn.click();
    }
}
