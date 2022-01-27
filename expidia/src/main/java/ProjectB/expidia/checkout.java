package ProjectB.expidia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class checkout {
	public WebDriver driver;
	@FindBy(xpath = "//*[@id='firstname[0]'and@class='text cko-field always-include gb-whitelist traveler-name']")WebElement firstname;
	@FindBy(xpath = "//*[@data-tealeaf-name='middleName'and@class='text cko-field always-include gb-whitelist']")WebElement middlename;
	@FindBy(xpath = "//*[@id='lastname[0]']")WebElement lastname;
	@FindBy(xpath = "//*[@id='phone-number[0]']")WebElement phonenumber;
	@FindBy(xpath = "//*[@id='gender_male[0]']")WebElement gender;
	@FindBy(xpath = "//*[@class='cko-field date-of-birth-month compound-validation main-traveler']")WebElement dobmonth;
	@FindBy(xpath = "//*[@id='date_of_birth_day[0]']") WebElement dobday;
	@FindBy(xpath = "//*[@id='date_of_birth_year[0]']")WebElement dobyear;
	public checkout(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
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
