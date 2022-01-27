package ProjectB.expidia;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class arraivalflight {
	public WebDriver driver;
	@FindBy(xpath ="(//*[@class='uitk-card-link'][1])")WebElement returnf;
	@FindBy(xpath = "//*[@class='uitk-button uitk-button-large uitk-button-has-text uitk-button-primary uitk-spacing uitk-spacing-margin-blockstart-six']")WebElement select;
	@FindBy(xpath = "//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary'and@aria-label='Continue to checkout']")WebElement checkout;
	@FindBy(xpath = "//*[@id='firstname[0]'and@class='text cko-field always-include gb-whitelist traveler-name']")WebElement firstname;
	@FindBy(xpath = "//*[@data-tealeaf-name='middleName'and@class='text cko-field always-include gb-whitelist']")WebElement middlename;
	@FindBy(xpath = "//*[@id='lastname[0]']")WebElement lastname;
	@FindBy(xpath = "//*[@id='phone-number[0]']")WebElement phonenumber;
	@FindBy(xpath = "//*[@id='gender_male[0]']")WebElement gender;
	@FindBy(xpath = "//*[@class='cko-field date-of-birth-month compound-validation main-traveler']")WebElement dobmonth;
	@FindBy(xpath = "//*[@id='date_of_birth_day[0]']") WebElement dobday;
	@FindBy(xpath = "//*[@id='date_of_birth_year[0]']")WebElement dobyear;
	public arraivalflight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickreturnflight() {
		returnf.click();
	}
	public void clickselect() {
		select.click();
		String currentwindow=driver.getWindowHandle();
		System.out.println(currentwindow);
		Set<String> windowh=driver.getWindowHandles();
		Iterator<String>iterators=windowh.iterator();
		String pwh=iterators.next();
		String cwh=iterators.next();
		System.out.println("this is parent window"+pwh);
		System.out.println("this is child window "+cwh);
		driver.switchTo().window(cwh);

		}
	public void clickcheckout() {
		checkout.click();
	}
	public void sendfirstname() {
		firstname.sendKeys("naim");
	}
	public void sendlastname() {
		lastname.sendKeys("chowdhury");
	}
	public void putphonenumber() {
		phonenumber.sendKeys("9293286687");
	}
	public void selectgender() {
		gender.click();
	}
	public void selectmonth() {
		Select m=new Select(dobmonth);
		m.selectByValue("03");
	}
	public void selectday() {
		Select d=new Select(dobday);
		d.selectByValue("03");
	}
	public void selectyear() {
		Select y=new Select(dobyear);
		y.selectByValue("1997");
	}





}
