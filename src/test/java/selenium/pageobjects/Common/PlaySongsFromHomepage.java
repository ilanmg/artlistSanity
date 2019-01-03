package selenium.pageobjects.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import selenium.Pages;


public class PlaySongsFromHomepage extends Pages {

    public PlaySongsFromHomepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
    @FindBy(css = ".music-item a.play-pause-btn")
    private WebElement playSongBtnList;
    
           
   
  

    public WebElement clickFirstSongOnListPauseBtn() {
        waitForElement(playSongBtnList, 10);
        playSongBtnList.click();
        return playSongBtnList;
    }
    
   
}


