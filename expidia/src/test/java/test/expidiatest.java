package test;

import org.testng.annotations.Test;

import ProjectB.expidia.Utility;
import ProjectB.expidia.arraivalflight;
import ProjectB.expidia.checkout;
import ProjectB.expidia.flights;
import ProjectB.expidia.homepage;

public class expidiatest extends Utility{
  @Test
  public void f() throws InterruptedException {
	  homepage hm=new homepage(driver);
	  hm.clickflights();
	  Thread.sleep(2000);
	 hm.leaveairportclick();Thread.sleep(1000);
	 hm.sendcity();Thread.sleep(1000);
	 hm.leavearp();Thread.sleep(1000);
	 hm.goingtocity();Thread.sleep(1000);
	 hm.sendcityname();Thread.sleep(1000);
	 hm.selectarrivearp();Thread.sleep(1000);
	 hm.clickdeputuredatebox();Thread.sleep(1000);
	 hm.selectdepurturedate();Thread.sleep(1000);
	 hm.clickdone();Thread.sleep(1000);
	 hm.clickreturnbox();Thread.sleep(1000);
	 hm.clickreturndate();Thread.sleep(1000);
	 hm.clickd();Thread.sleep(1000);
	 hm.clicksearch();Thread.sleep(12000);
	 flights f=new flights(driver);
	 f.selectdepflight();Thread.sleep(1000);
	 f.ammountselectclick();Thread.sleep(10000);
	 arraivalflight af=new arraivalflight(driver);
	 af.clickreturnflight();Thread.sleep(1000);
	 af.clickselect();Thread.sleep(10000);
	 af.clickcheckout();Thread.sleep(1000);
	 af.sendfirstname();
	 af.sendlastname();
	 af.putphonenumber();
	 af.selectgender();
	 af.selectmonth();
	 af.selectday();
	 af.selectyear();
	 
	  
  }
}
