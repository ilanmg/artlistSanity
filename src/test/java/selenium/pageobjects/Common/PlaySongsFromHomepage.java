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

   
   
    @FindBy(css = "#song_9184 > div:nth-child(1) > div > div.flex2.item-left > div > div.flex.add-to-his > a > i")
    private WebElement playSongBtnListInput;
    
    @FindBy(css = "#song_9184 > div.wrap-item > div.flex > div.flex1.item-right > div.flex > div.flex3.wave-row > div.wawe > div.wave-wrapper > div.song-wave > canvas.song-wave-canvas")
    private WebElement playOtherSongFromCanvasInput;
    
    @FindBy(css = "#song_9184 > div.wrap-item > div.flex > div.flex2.item-left > div.flex.item-contain > div.flex.add-to-his > a.play-pause-btn > i.fa.fa-pause")
    private WebElement pausingSongInput;
 
    @FindBy(css = ".bottom-player .volume-speak")
    private WebElement clickVolumeSpeakerInput;
 
    @FindBy(css = ".bottom-player .volume-speak")
    private WebElement clickTheVolumeSpeakerForTheSecondTimeInput;
    
    @FindBy(css = "#song_6748 > div.wrap-item > div.flex > div.flex2.item-left > div.flex.item-contain > div.flex.add-to-his > a.play-pause-btn > i.fa.fa-play")
    private WebElement playOtherSongFromBtnListInput;
    
   
  
   
  
    public WebElement clickToPlayFirstSongOnList() {
        waitForElement(playSongBtnListInput, 10);
        playSongBtnListInput.click();
        return playSongBtnListInput; 
    }
    public WebElement clickCanvasSongWave() {
        waitForElement(playOtherSongFromCanvasInput, 10); 
        playOtherSongFromCanvasInput.click();
        return playOtherSongFromCanvasInput;  
    } 
    
    public WebElement clickToPauseFirstSongOnList() {
        waitForElement(pausingSongInput, 10);
        pausingSongInput.click();
        return pausingSongInput; 
    }
    
    public WebElement clickVolumeSpeaker() {
        waitForElement(clickTheVolumeSpeakerForTheSecondTimeInput, 10);
        clickTheVolumeSpeakerForTheSecondTimeInput.click();
        return clickTheVolumeSpeakerForTheSecondTimeInput; 
    }
    
    public WebElement clickTheVolumeSpeakerForTheSecondTime() {
        waitForElement(clickTheVolumeSpeakerForTheSecondTimeInput, 10);
        clickTheVolumeSpeakerForTheSecondTimeInput.click();
        return clickTheVolumeSpeakerForTheSecondTimeInput; 
    }
   
  
  }


