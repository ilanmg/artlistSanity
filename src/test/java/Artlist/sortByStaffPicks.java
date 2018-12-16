package Artlist;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;
 


public class sortByStaffPicks  extends baseTest {


		@BeforeTest
			     public void SortOrder() throws IOException, InterruptedException {
			        Login();
			        Thread.sleep(3000);
		 	}	
	
		  @Test
		    public void selectStudyType(String studyType) throws Exception
		    {
			  WebElement element=driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Genre 0/18'])[1]/following::li[1]"));
			  Select select=new Select(element);
			  List<WebElement> list=select.getOptions();
			  for(int i=0;i<list.size();i++)          
			      {
			          System.out.println(list.get(i).getText());
			      }
		 }
			     // Select 'MySortOrder' Drop down
			  
			//driver.findElement(By.className("selected")).click();;
			  
			//  sort.selectByVisibleText("Top Downloads");
			//  sort.selectByVisibleText("Staff pick");
			//  sort.selectByVisibleText("Newest");
			  
			      // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Genre 0/18'])[1]/following::li[1]")).click();	
			      // Thread.sleep(1000);    
			     //  driver.findElement(By.xpath(" (.//*[normalize-space(text()) and normalize-space(.)='Top Downloads'])[1]/following::li[1]")).click();	
			     //  Thread.sleep(1000);  
			     //  driver.findElement(By.xpath(" (.//*[normalize-space(text()) and normalize-space(.)='Staff pick'])[1]/following::li[1]")).click();	
			       
		 @AfterTest
	  		  public void aftertest() {
		  		//driver.close();
      }	
}   





