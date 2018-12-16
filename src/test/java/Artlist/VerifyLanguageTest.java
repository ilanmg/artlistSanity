package Artlist;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.baseTest;
 



	public class VerifyLanguageTest extends baseTest{
		       
		
		@BeforeTest
		public void Logo() throws IOException, InterruptedException 	{ 
		    Login();
		}
		 @Test
		 public void getTitle() throws IOException, InterruptedException{         
			    
		        String expectedTitle="Royalty-Free Music Licensing For Video, Film & Youtube - Artlist.io";
		  	    //driver.get(baseUrl);
		  	    String actualTitle=driver.getTitle();
		  	    
		  	    if(actualTitle.equals(expectedTitle)){
		  	        System.out.println("Test Passed - the right title is presented : Royalty-Free Music Licensing For Video, Film & Youtube - Artlist.io");
		  	    }
		  	    else{
		  	        System.out.println("Test Failed - title is wrong");
		  	    }
		  	 
		 }   
		   @AfterTest
			  public void afterTest() {
				  driver.close();
    }
}   
	
	
	    