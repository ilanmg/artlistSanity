package selenium.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import selenium.Pages;

public class StartPage extends Pages {

	public StartPage(final WebDriver driver) {
		super(driver);
	}

	public void open(){
		super.open(); 
		
	}

	public   WebDriver getDriver(){return driver;}

}
