package ProjectB.expidia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Utility {
	 public  WebDriver driver;
	 @Parameters({"browser","wbsite"})
	 
	 @BeforeMethod
	 public void beforeMethod(String browser,String wbsite) throws InterruptedException {
		  String local=System.getProperty("user.dir");
		  System.out.println(local);
		  if(browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", local+"\\src\\drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.navigate().to(wbsite);
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		  }else if(browser.equalsIgnoreCase("Edge")) {
			  System.setProperty("webdriver.edge.driver", local+"\\src\\drivers\\msedgedriver.exe");
				 driver=new EdgeDriver();
				 driver.navigate().to(wbsite);
				 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				 driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
		  }else {
			  System.out.println("wrong code");
		  }
	 }

	 @AfterMethod
	 public void afterMethod() {
		  

	 }

}
