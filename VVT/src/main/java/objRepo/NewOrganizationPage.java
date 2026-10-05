package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class NewOrganizationPage {
	public NewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "accountname")
	private WebElement name;
	
	@FindBy(xpath = "//input[@value='U']")
	private WebElement user;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement group;
	
	@FindBy(name = "assigned_user_id")
	private WebElement assigned;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement save;

	public WebElement getName() {
		return name;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getGroup() {
		return group;
	}

	public WebElement getAssigned() {
		return assigned;
	}
	
	public WebElement getSave() {
		return save;
	}
	
	public void createOrg(String orgName, String assign, String assignedVal) {
		name.clear();
		name.sendKeys(orgName);
		if(assign.equalsIgnoreCase("user"))
			user.click();
		else
			group.click();
		WebDriverUtility wu = new WebDriverUtility();
		wu.select(assigned, assignedVal);
		save.click();
	}
}
