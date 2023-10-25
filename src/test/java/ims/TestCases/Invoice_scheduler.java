package ims.TestCases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import ims.Utilities.Utilities;

public class Invoice_scheduler extends BaseClass {
	
	@Test(groups = {"AllTest","Invoice_scheduler"})
	public void check_fun_InvoiceScheduler()
	{
		Utilities.hardWait(3);
		
		//hover on Invoicing module
		System.out.println("Hovering on Invoicing module");
		Actions action = new Actions(driver);
		
		WebElement invmo = driver.findElement(By.xpath("//a[@title='Invoicing']/img[@class='leftmenuicons']"));
		action.moveToElement(invmo).build().perform();
		
		Utilities.hardWait(3);
		
		//click on Invoice Scheduler sub-module
		System.out.println("Clicking on Invoice Scheduler");
		driver.findElement(By.xpath("//li[@class='nav-sub-item']/a[@title='Invoice Scheduler']")).click();
		
		Utilities.hardWait(3);
		
		//Click on Add new Invoice Scheduler button
		driver.findElement(By.xpath("//a[@tooltip='Add New Invoice Scheduler']/i[@class='fa fa-plus-circle fa-fw']")).click();
		
		Utilities.hardWait(10);
		
		//Requested by
		driver.findElement(By.xpath("//div[@id='user_chosen']/a[@class='chosen-single']/span")).click();
		Utilities.hardWait(5);
		
		WebElement reqby = driver.findElement(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li[3]"));
		reqby.click();
		Utilities.hardWait(3);
		
		//Invoice No
		driver.findElement(By.xpath("//div[@class='invoice_no_chosen']")).click();
		Utilities.hardWait(5);
		
		WebElement invno = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/ul[1]/li[31]"));
		invno.click();	
		Utilities.hardWait(3);
		
		//Date of Month
		driver.findElement(By.xpath("//div[@id='date_of_month_chosen']")).click();
		Utilities.hardWait(5);
		
		WebElement dom = driver.findElement(By.xpath("//div[2]/div[5]/div/div[1]/div/ul/li[11]"));
		dom.click();
		Utilities.hardWait(3);
		
		//Never Ending
//		driver.findElement(By.xpath("//div[@class='col-sm-9']/label[1]/span[1]")).click();
//		Utilities.hardWait(3);
		
		//End Date
		WebElement edate = driver.findElement(By.id("end_date"));
		edate.click();
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
			//System.out.println(dt);
			
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
		//System.out.println(size);
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
		//System.out.print(size2);
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
