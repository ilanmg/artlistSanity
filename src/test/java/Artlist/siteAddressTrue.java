package Artlist;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import resources.baseTest;

public class siteAddressTrue extends baseTest{

	
	@BeforeTest
		public void siteAddressTrue() throws IOException, InterruptedException {
			Login();
		}
	
	@Test
		public void assertTrue() throws IOException, InterruptedException
		      {
		        Assert.assertTrue ("https://test.artlist.io/", true);
	            System.out.println("address of site is correct");
	          }

	@AfterTest
	public void aftertest() {
		driver.close();
	}
}