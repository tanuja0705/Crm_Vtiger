package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Calendar")
	private WebElement calendar;
	
	@FindBy(linkText = "Organizations")
	private WebElement org;
	
	@FindBy(linkText = "Contacts")
	private WebElement contact;
	
	@FindBy(xpath = "//img[contains(@src,'user.PNG')]")
	private WebElement userIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement logout;

	public WebElement getCalendar() {
		return calendar;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getUserIcon() {
		return userIcon;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	public void userLogout(WebDriver driver) {
		WebDriverUtility wu = new WebDriverUtility();
		wu.moveToAnElement(driver, userIcon);
		logout.click();
	}
}
