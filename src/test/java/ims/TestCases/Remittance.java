package ims.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ims.Utilities.Utilities;

public class Remittance extends BaseClass{

	@Test(groups = {"AllTest","Remittance"})
	public void check_fun_Remittance()
	{
		Utilities.hardWait(3);
		
		//hover on Invoicing module
		System.out.println("Hovering on Invoicing module");
		Actions action = new Actions(driver);
		
		WebElement invmo = driver.findElement(By.xpath("//a[@title='Invoicing']/img[@class='leftmenuicons']"));
		action.moveToElement(invmo).build().perform();
		
		Utilities.hardWait(3);
		
		//click on Remittance sub-module
		System.out.println("Clicking on Remittance");
		driver.findElement(By.xpath("//li[@class='nav-sub-item']/a[@title='Remittance']")).click();
		
		Utilities.hardWait(3);
		
		//Click on Add new Remittance Details button
		driver.findElement(By.xpath("//a[@tooltip='Add New Remittance Details']/i[@class='fa fa-plus-circle fa-fw']")).click();
		
		Utilities.hardWait(8);
		
		//Requested By
		driver.findElement(By.xpath("//div[@id='user_chosen']")).click();
		Utilities.hardWait(5);
		
		driver.findElement(By.xpath("//li[contains(text(),'Bhavna Pandey')]")).click();
		Utilities.hardWait(3);
		
		//Remittance Date
		WebElement rtdate = driver.findElement(By.id("remittancedate"));
		rtdate.click();
		Utilities.hardWait(5);
		
		//month and year selection
		Select month_drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month_drp.selectByVisibleText("Oct");
		
		Select year_drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year_drp.selectByVisibleText("2023");
		
		String date = "20";
		
		//Date Selection
		List <WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates)
		{
			String dt = ele.getText();
			//System.out.println(dt);
			
			if(dt.equals(date))
			{
				ele.click();
				break;
			}
		}

		Utilities.hardWait(3);
		
		//Vendor Name
		driver.findElement(By.xpath("//div[@id='company_name_chosen']")).click();
		Utilities.hardWait(5);
		
		driver.findElement(By.xpath("//li[contains(text(),'Geecon systems')]")).click();
		Utilities.hardWait(3);
		
		//Project
		driver.findElement(By.xpath("//div[@id='project_chosen']")).click();
		Utilities.hardWait(5);
		
		driver.findElement(By.xpath("//div[9]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
		Utilities.hardWait(3);
		
		//Start Date
		WebElement sdate = driver.findElement(By.id("startdate"));
		sdate.click();
		Utilities.hardWait(5);
		
		//month and year selection
		Select month_sel = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month_sel.selectByVisibleText("Oct");
		
		Select year_sel = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year_sel.selectByVisibleText("2023");
		
		String date2 = "1";
		
		//Date Selection
		List <WebElement> allDates2 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele2:allDates2)
		{
			String dt2 = ele2.getText();
			//System.out.println(dt2);
			
			if(dt2.equals(date2))
			{
				ele2.click();
				break;
			}
		}

		Utilities.hardWait(3);
		
		//End Date
		WebElement edate = driver.findElement(By.id("enddate"));
		edate.click();
		Utilities.hardWait(5);
		
		//month and year selection
		Select month_sel2 = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month_sel2.selectByVisibleText("Oct");
		
		Select year_sel2 = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year_sel2.selectByVisibleText("2023");
		
		String date3 = "31";
		
		//Date Selection
		List <WebElement> allDates3 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele3:allDates3)
		{
			String dt3 = ele3.getText();
			//System.out.println(dt3);
			
			if(dt3.equals(date3))
			{
				ele3.click();
				break;
			}
		}

		Utilities.hardWait(3);
		
		//Ref Remittance Code
		driver.findElement(By.id("remittance_desc")).sendKeys("3565156");
		Utilities.hardWait(3);
		
		//Remittance Amount
		driver.findElement(By.id("remittanceamt")).sendKeys("200");
		Utilities.hardWait(3);
		
		//Save button
		driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary saveButton']")).click();
		Utilities.hardWait(3);
		
		//Save and add button
//		driver.findElement(By.xpath("//button[@class='btn btn-sm btn-success saveAndAddButton']")).click();
		//Utilities.hardWait(3);
		
		//Cancel button
//		driver.findElement(By.xpath("//a[@class='btn btn-sm btn-default cancelButton']")).click();
		//Utilities.hardWait(3);
		
		//click on export button
		driver.findElement(By.xpath("//span[@class='fa-stack fa-fw']/i[@class='fa fa-arrow-right fa-stack-1x']")).click();
		
		Utilities.hardWait(3);
		
		//click on CSV option
		driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[@class='dropdown-item export-csv']")).click();
		
		Utilities.hardWait(3);
		
		//click on export button
		driver.findElement(By.xpath("//span[@class='fa-stack fa-fw']/i[@class='fa fa-arrow-right fa-stack-1x']")).click();
		
		Utilities.hardWait(3);
		
		//click on Excel option
		driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[@class='dropdown-item export-excel']")).click();
		
		Utilities.hardWait(3);
		
		//click on export button
		driver.findElement(By.xpath("//span[@class='fa-stack fa-fw']/i[@class='fa fa-arrow-right fa-stack-1x']")).click();
		
		Utilities.hardWait(3);
		
		//click on PDF option
		driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[@class='dropdown-item export-pdf']")).click();
		
		Utilities.hardWait(3);
		
		//click on export button
		driver.findElement(By.xpath("//span[@class='fa-stack fa-fw']/i[@class='fa fa-arrow-right fa-stack-1x']")).click();
		
		Utilities.hardWait(3);
		
		//click on PRINT option
		driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[@class='dropdown-item print']")).click();
		
		Utilities.hardWait(5);
		 
//		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.ESCAPE).perform(); // Simulates pressing the Escape key (usually closes the alert)
		
		Utilities.hardWait(3);
		
		//click on export button
		driver.findElement(By.xpath("//span[@class='fa-stack fa-fw']/i[@class='fa fa-arrow-right fa-stack-1x']")).click();
		
		Utilities.hardWait(3);
		
		//click on Copy option
		driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[@class='dropdown-item copy']")).click();
		
		Utilities.hardWait(3);
		
		//Delete record from table with white button
		List<WebElement> tableData = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size = tableData.size();
		System.out.println(size);
		Utilities.hardWait(5);
		
		for(int i = 0; i<size;)
		{
				tableData.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//button[@class='btn-primary-delete']")).click();
				Utilities.hardWait(4);
				break;
			
		}
		
		System.out.println("Record deleted successfully...");
		
		//Delete record from table with red button
		List<WebElement> tableData2 = driver.findElements(By.xpath("//tr/td[2]/a[2]/span[@class='fa fa-trash fa-1xx text-danger']"));	
		
		int size2 = tableData2.size();
		System.out.print(size2);
		Utilities.hardWait(5);
		
		for(int i=0; i<size2;)
		{
			tableData2.get(i).click();
			Utilities.hardWait(5);
			driver.findElement(By.xpath("//i[@class='fa fa-check fa-2x']")).click();
			Utilities.hardWait(4);
			break;
		}
		
		System.out.println("Record deleted successfully...");
		
	}
	
}
