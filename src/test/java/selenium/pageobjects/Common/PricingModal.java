package selenium.pageobjects.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.Pages;

public class PricingModal extends Pages {

    public PricingModal (WebDriver driver) {
        super(driver);
    }

    @FindBy(css="#top-bar .price-btn")
    private WebElement clickPricingBtn;

    @FindBy(className = "pricing-subscribe-now-paypal")
    private WebElement clicksubscribeBtn;

    @FindBy(name="payMethodNextStep")
    private WebElement visaRadio;

    @FindBy(xpath="//*[@id=\\\"bluesnap-area-name-NextStep\\\"]")
    private WebElement visaname;
  
    @FindBy(name="bluesnap-hosted-iframe-ccn")
    private WebElement visaccn;
    
    @FindBy(name="//*[@id=\\\"ccn\\\"]")
    private WebElement visanumber;
    
    @FindBy(name="bluesnap-hosted-iframe-exp")
    private WebElement visaexp;
  
    @FindBy(xpath="//*[@id=\\\"month\\\"]")
    private WebElement visamonth;
    
    @FindBy(xpath="//*[@id=\\\"year\\\"]")
    private WebElement visayear;
  
    @FindBy(name="bluesnap-hosted-iframe-cvv")
    private WebElement visaiframecvv;
    
    @FindBy(id="cvv")
    private WebElement visacvv;
    
    @FindBy(id="btnRegUserFree-NextStep")
    private WebElement visaNextStep;
    
    
    

    public WebElement PricingBtn() {
       // waitForElement(clickPricingBtn, 10);
        clickPricingBtn.click();
        return clickPricingBtn; 
    }

    public  WebElement clicSubscribeNow() {
        waitForElement(clicksubscribeBtn, 10);
        clicksubscribeBtn.click();
        return clicksubscribeBtn;

    }

    public WebElement clickVisaRadioBtn() {
        waitForElement(visaRadio, 10);
        visaRadio.click();
        return visaRadio;
    }

    public WebElement enterVisaNameHolder() {
        waitForElement(visaname, 10);
        visaname.click();
        return visaname;
    }
    
    public WebElement enterVisaCcn() {
    waitForElement(visaccn, 10);
    visaccn.click();
    return visaccn;
   }
    
    public WebElement enterVisaNumber() {
        waitForElement(visanumber, 10);
        visanumber.click();
        return visanumber;
        }
    
    public WebElement enterVisaExpNumber() {
        waitForElement(visaexp, 10);
        visaexp.click();
        return visaexp;
        }
    
    public WebElement enterVisaMonth() {
        waitForElement(visamonth, 10);
        visamonth.click();
        return visamonth;
        }
    
    public WebElement enterVisaYear() {
        waitForElement(visayear, 10);
        visayear.click();
        return visayear;
        }
    
    public WebElement VisaIframeCvv() {
        waitForElement(visaiframecvv, 10);
        visaiframecvv.click();
        return visaiframecvv;
        }
    
    public WebElement VisaCvv() {
        waitForElement(visacvv, 10);
        visacvv.click();
        return visacvv;
        }
    
    public WebElement VisaNext() {
        waitForElement(visaNextStep, 10);
        visaNextStep.click();
        return visaNextStep;
    
 }
    
    
	
}


