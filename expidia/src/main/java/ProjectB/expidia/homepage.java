package ProjectB.expidia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	public WebDriver driver;
	@FindBy(xpath = "//*[@class='uitk-tab-anchor'and@aria-controls='wizard-flight-pwa']")WebElement flights;
	@FindBy(xpath = "//*[@class='uitk-fake-input uitk-form-field-trigger'and@type='button']")WebElement leavingfrom;
	@FindBy(xpath = "//*[@id='location-field-leg1-origin'and@class='uitk-field-input uitk-typeahead-input']") WebElement cityname;
	@FindBy(xpath = "//*[@aria-label='Washington (IAD - Washington Dulles Intl.)'and@class='uitk-button uitk-button-medium uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext']")WebElement selectairp;
	@FindBy(xpath = "//*[@aria-label='Going to']")WebElement goingto;
	@FindBy(xpath = "//*[@class='uitk-field-input uitk-typeahead-input'and@placeholder='Where are you going to?']")WebElement sendcity;
	@FindBy(xpath = "//*[@class='uitk-button uitk-button-medium uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext'and@aria-label='New York (LGA - LaGuardia)']")WebElement selectairport;
	@FindBy(xpath = "//*[@id='d1-btn']")WebElement depurturedate;
	@FindBy(xpath = "//*[@aria-label='Feb 14, 2022']")WebElement ddate;
	@FindBy(xpath = "//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-layout-flex-item uitk-layout-flex-item-flex-shrink-0 dialog-done']")WebElement done;
	@FindBy(xpath = "//*[@id='d2-btn']")WebElement returnbox;
	@FindBy(xpath = "//*[@aria-label='Mar 3, 2022']")WebElement returndate;
	@FindBy(xpath = "//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-layout-flex-item uitk-layout-flex-item-flex-shrink-0 dialog-done']")WebElement done2;
    @FindBy(xpath = "//*[@type='submit'and@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary'and@data-testid='submit-button']")WebElement search;
	public homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickflights() {
		flights.click();}
	public void leaveairportclick() {
		leavingfrom.click();}
	public void sendcity() {
		cityname.sendKeys("dc");}
	public void leavearp() {
		Actions ac1=new Actions(driver);
		ac1.moveToElement(selectairp).click().build().perform();}
	public void goingtocity() {
		goingto.click();}
	public void sendcityname() {
		sendcity.sendKeys("ny");}
    public void selectarrivearp() {
    	Actions aa=new Actions(driver);
    	aa.moveToElement(selectairport).click().build().perform();}
    public void clickdeputuredatebox() {
    	depurturedate.click();}
    public void selectdepurturedate() {
    	ddate.click();}
    public void clickdone() {
    	done.click();}
    public void clickreturnbox() {
    	returnbox.click();}
    public void clickreturndate() {
    	returndate.click();}
    public void clickd() {
    	done2.click(); }
    public void clicksearch() {
    	search.click();
    }










}

