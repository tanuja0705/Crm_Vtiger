package org_Module;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtility;
import objRepo.HomePage;
import objRepo.NewOrganizationPage;
import objRepo.OrganizationPage;

public class CreateOrganizationWithOrgName_Test extends BaseClass{
	@Test
	public void creatOrganizationWitOrgName_Test() throws Exception {
		HomePage hp = new HomePage(driver);
		hp.getOrg().click();
		
		OrganizationPage op = new OrganizationPage(driver);
		op.getAddOrg().click();
		
		JavaUtility ju = new JavaUtility();
		ExcelUtility eu = new ExcelUtility();
		String orgName =eu.readDataFromExcel("org", 1, 0)+ju.generateRandomNumber();
		String assign=eu.readDataFromExcel("org", 1, 1);
		String assVal=eu.readDataFromExcel("org", 1, 2);
		
		NewOrganizationPage nop = new NewOrganizationPage(driver);
		nop.createOrg(orgName, assign, assVal);		
	}
}
