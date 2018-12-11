package Artlist;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import resources.baseTest;

public class siteAddressTrue extends baseTest{

@Test
public void assertTrue() throws IOException, InterruptedException
      {
          Login();
          Assert.assertTrue ("https://test.artlist.io/", true);
          System.out.println("address of site is correct");
         // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
          driver.close();  
      }
}