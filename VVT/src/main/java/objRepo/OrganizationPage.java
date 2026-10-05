package objRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class OrganizationPage {
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement addOrg;
	
	@FindBy(name = "search_text")
	private WebElement searchText;
	
	@FindBy(id = "bas_searchfield")
	private WebElement searchFilter;
	
	@FindBy(name = "submit")
	private WebElement searchButton;

	public WebElement getAddOrg() {
		return addOrg;
	}

	public WebElement getSearchText() {
		return searchText;
	}

	public WebElement getSearchFilter() {
		return searchFilter;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	public void searchOrg(String filter, String searchValue) {
		WebDriverUtility wu = new WebDriverUtility();
		wu.select(filter, searchFilter);
		searchText.clear();
		searchText.sendKeys(searchValue);
		searchButton.click();
	}
}
