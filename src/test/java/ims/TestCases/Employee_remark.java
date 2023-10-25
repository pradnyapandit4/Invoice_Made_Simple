package ims.TestCases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ims.Utilities.Utilities;

public class Employee_remark extends BaseClass {

	@Test(groups = {"AllTest","Employee_remark"})
	public void check_fun_EmployeeRemark()
	{
		Utilities.hardWait(3);
		
		//hover on Performance module
		System.out.println("Hovering on Performance module");
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@title='Performance']/img[@class='leftmenuicons']"));
		action.moveToElement(element).build().perform();
		
		Utilities.hardWait(3);
		
		//click on Employee Remark sub-module
		System.out.println("Clicking on Employee Remark");
		driver.findElement(By.xpath("//li[@class='nav-sub-item']/a[@title='Employee Remark']")).click();
		
		Utilities.hardWait(3);
		
		//Click on Add new employee remark button
		driver.findElement(By.xpath("//a[@tooltip='Add New Employee Remark']/i[@class='fa fa-plus-circle fa-fw']")).click();
		
		Utilities.hardWait(10);
		
		//Requested by
		driver.findElement(By.xpath("//div[@id='user_chosen']/a[@class='chosen-single']/span")).click();
		Utilities.hardWait(5);
		
		WebElement reqby = driver.findElement(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li[3]"));
		reqby.click();
		Utilities.hardWait(3);
		
		//Employee full name	
		driver.findElement(By.xpath("//div[@id='empid_chosen']/a[@class='chosen-single']/span")).click();
		Utilities.hardWait(5);
		
		WebElement efname = driver.findElement(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li[29]"));
		efname.click();
		
		Utilities.hardWait(3);
		
		//Remark
		driver.findElement(By.id("remark")).sendKeys("Good");
		Utilities.hardWait(3);
		
		//Remark Date
		WebElement redate = driver.findElement(By.id("remark_date"));
		redate.click();
		Utilities.hardWait(5);
		
		//month and year selection
		Select month_drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month_drp.selectByVisibleText("Oct");
		
		Select year_drp = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year_drp.selectByVisibleText("2023");
		
		String date = "15";
		
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
		
		//Save button
		driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary saveButton']")).click();
		Utilities.hardWait(3);
		
		//Save and add button
//		driver.findElement(By.xpath("//button[@class='btn btn-sm btn-success saveAndAddButton']")).click();
		//Utilities.hardWait(3);
		
		//Cancel button
//		driver.findElement(By.xpath("//a[@class='btn btn-sm btn-default cancelButton']")).click();
		//Utilities.hardWait(3);
		
		//Approve Selected Remark
		List<WebElement> tableData = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size = tableData.size();
		//System.out.println(size);
		Utilities.hardWait(5);
		
		for(int i = 0; i<size;)
		{
				tableData.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//a[@id='approve_remark_request']/i[@class='fa fa-thumbs-o-up fa-fw']")).click();
				Utilities.hardWait(4);
				break;
			
		}
		
		//Reject Selected Remark
		List<WebElement> tableData2 = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size2 = tableData2.size();
		//System.out.println(size);
		Utilities.hardWait(5);
		
		for(int i = 0; i<size2;)
		{
				tableData2.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//a[@id='reject_remark_request']/i[@class='fa fa-thumbs-o-down fa-fw']")).click();
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
		List<WebElement> tableData3 = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size3 = tableData3.size();
		System.out.println(size3);
		Utilities.hardWait(5);
		
		for(int i = 0; i<size3;)
		{
				tableData3.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//button[@class='btn-primary-delete']")).click();
				Utilities.hardWait(4);
				break;
			
		}
		
		System.out.println("Record deleted successfully...");
		
		//Delete record from table with red button
		List<WebElement> tableData4 = driver.findElements(By.xpath("//tr/td[2]/a[2]/span[@class='fa fa-trash fa-1xx text-danger']"));	
		
		int size4 = tableData4.size();
		System.out.print(size4);
		Utilities.hardWait(5);
		
		for(int i=0; i<size4;)
		{
			tableData4.get(i).click();
			Utilities.hardWait(5);
			driver.findElement(By.xpath("//i[@class='fa fa-check fa-2x']")).click();
			Utilities.hardWait(4);
			break;
		}
		
		System.out.println("Record deleted successfully...");
		
	}
	
}
