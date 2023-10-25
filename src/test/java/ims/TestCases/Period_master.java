package ims.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.List;
import ims.Utilities.Utilities;

public class Period_master extends BaseClass {

	@Test(groups = {"AllTest","Period_master"})
	public void check_fun_PeriodMaster()
	{
		Utilities.hardWait(3);
		
		//hover on Performance module
		System.out.println("Hovering on Performance module");
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@title='Performance']/img[@class='leftmenuicons']"));
		action.moveToElement(element).build().perform();
		
		Utilities.hardWait(3);
		
		//click on Period Master sub-module
		System.out.println("Clicking on Employee Info");
		driver.findElement(By.xpath("//li[@class='nav-sub-item']/a[@title='Performance Period Details']")).click();
		
		Utilities.hardWait(3);
		
		//Click on Add New Period Master button
		driver.findElement(By.xpath("//a[@tooltip='Add New Period Master']/i[@class='fa fa-plus-circle fa-fw']")).click();
		
		Utilities.hardWait(7);
		
		//Requested by
		driver.findElement(By.xpath("//div[@id='user_chosen']/a[@class='chosen-single']/span")).click();
		Utilities.hardWait(5);
		
		WebElement reqby = driver.findElement(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li[3]"));
		reqby.click();
		Utilities.hardWait(3);
		
		//Period Type
		driver.findElement(By.xpath("//div[@id='periodTypeId_chosen']/a[@class='chosen-single']/span")).click();
		
		Utilities.hardWait(5);
		
		WebElement prdType = driver.findElement(By.xpath("//div[4]/div[1]/div[1]/div[1]/ul[1]"));
		prdType.click();
		
		Utilities.hardWait(3);
		
		//Period Start Date
		WebElement psdate = driver.findElement(By.id("periodStartDate"));
		psdate.click();
		Utilities.hardWait(5);
		
		//month and year selection
		Select month_drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month_drp.selectByVisibleText("Sep");
		
		Select year_drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year_drp.selectByVisibleText("2023");
		
		String date = "1";
		
		//Date Selection
		List <WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates)
		{
			String dt = ele.getText();
			System.out.println(dt);
			
			if(dt.equals(date))
			{
				ele.click();
				break;
			}
		}
		Utilities.hardWait(3);
		
		//Period End Date
		WebElement pedate = driver.findElement(By.id("periodEndDate"));
		pedate.click();
		Utilities.hardWait(5);
		
		//month and year selection
		Select month_Drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month_Drp.selectByVisibleText("Sep");
		
		Select year_Drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year_Drp.selectByVisibleText("2023");
		
		String date2 = "30";
		
		//Date Selection
		List <WebElement> allDates2 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele2:allDates2)
		{
			String dt2 = ele2.getText();
			System.out.println(dt2);
			
			if(dt2.equals(date2))
			{
				ele2.click();
				break;
			}
		}
		Utilities.hardWait(3);
		
		//Fiscal Period Description
		driver.findElement(By.id("fiscalPeriodDesc")).sendKeys("Achievement Period 2023");
		
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
		
		//Lock Period by selecting record
		List<WebElement> tableData = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size = tableData.size();
		//System.out.println(size);
		Utilities.hardWait(5);
		
		for(int i = 0; i<size;)
		{
				tableData.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//button[1]/i[@class='fa fa-lock']")).click();
				Utilities.hardWait(4);
				break;
			
		}
		
		//Unlock Period by selecting record
		List<WebElement> tableData2 = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size2 = tableData2.size();
		//System.out.println(size);
		Utilities.hardWait(5);
		
		for(int i = 0; i<size2;)
		{
				tableData2.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//button[2]/i[@class='fa fa-unlock']")).click();
				Utilities.hardWait(4);
				break;
			
		}
		
		//Verify Period by selecting record
		List<WebElement> tableData3 = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size3 = tableData3.size();
		//System.out.println(size);
		Utilities.hardWait(5);
		
		for(int i = 0; i<size3;)
		{
				tableData3.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//button[3]/i[@class='fa fa-check fa-fw']")).click();
				Utilities.hardWait(4);
				break;
			
		}
		
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
		List<WebElement> tableData4 = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size4 = tableData4.size();
		//System.out.println(size);
		Utilities.hardWait(5);
		
		for(int i = 0; i<size4;)
		{
				tableData4.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//button[@class='btn-primary-delete']")).click();
				Utilities.hardWait(4);
				break;
			
		}
		
		System.out.println("Record deleted successfully...");
		
		//Delete record from table with red button
		List<WebElement> tableData5 = driver.findElements(By.xpath("//tr/td[2]/a[2]/span[@class='fa fa-trash fa-1xx text-danger']"));	
		
		int size5 = tableData5.size();
		//System.out.print(size2);
		Utilities.hardWait(5);
		
		for(int i=0; i<size5;)
		{
			tableData5.get(i).click();
			Utilities.hardWait(5);
			driver.findElement(By.xpath("//i[@class='fa fa-check fa-2x']")).click();
			Utilities.hardWait(4);
			break;
		}
		
		System.out.println("Record deleted successfully...");
		
	}
	
}
