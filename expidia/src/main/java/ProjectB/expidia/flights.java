package ProjectB.expidia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flights {
	public WebDriver driver;
	@FindBy(xpath = "(//button[@class='uitk-card-link'][1])")WebElement depflight;
	@FindBy(xpath = "(//*[@data-test-id='select-button'][1])")WebElement ammountselect;
public flights(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void selectdepflight() {
	Actions sf=new Actions(driver);
	sf.moveToElement(depflight).click().build().perform();
}
public void ammountselectclick() {
	ammountselect.click();
}
}
