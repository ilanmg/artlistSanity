package Artlist;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;

	public class playSongTest extends baseTest{

		 @BeforeTest
	       public void playSong() throws IOException, InterruptedException 	{ 
		       Login();
	        }	
		

	@Test
	public void login() throws InterruptedException, IOException
		
	{
		
		    Thread.sleep(2000);
			driver.findElement(By.cssSelector("#song_9184 > div.wrap-item > div.flex > div.flex2.item-left > div.flex.item-contain > div.flex.add-to-his > a.play-pause-btn > i.fa.fa-play")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#song_9184 > div.wrap-item > div.flex > div.flex2.item-left > div.flex.item-contain > div.flex.add-to-his > a.play-pause-btn > i.fa.fa-pause")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#song_6748 > div.wrap-item > div.flex > div.flex2.item-left > div.flex.item-contain > div.flex.add-to-his > a.play-pause-btn > i.fa.fa-play")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".bottom-player .volume-speak")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.cssSelector("#song_6748 > div.wrap-item > div.flex > div.flex1.item-right > div.flex > div.flex3.wave-row > div.wawe > div.wave-wrapper > div.song-wave > canvas.song-wave-canvas")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.cssSelector("#song_6748 > div.wrap-item > div.flex > div.flex2.item-left > div.flex.item-contain > div.flex.add-to-his > a.play-pause-btn > i.fa.fa-play")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.cssSelector(".bottom-player .volume-speak")).click();
			Thread.sleep(3000);
			
	        
			driver.findElement(By.cssSelector("#song_6748 > div.wrap-item > div.flex > div.flex2.item-left > div.flex.item-contain > div.flex.add-to-his > a.play-pause-btn > i.fa.fa-play")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(".bottom-player .volume-speak")).click();
			
			
			Thread.sleep(5000);
			
			
			
			 }
	   @AfterTest
	          public void afterTest() {
		          driver.close();
	  }
		
	}
			



	
	