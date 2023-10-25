package ims.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ims.Utilities.Utilities;

public class Supplier_projects extends BaseClass {

	@Test(groups = {"AllTest","Supplier_projects"})
	public void check_fun_SupplierProjects()
	{
		Utilities.hardWait(3);
		
		//hover on Bills module
		System.out.println("Hovering on Bills module");
		Actions action = new Actions(driver);
		
		WebElement billsmo = driver.findElement(By.xpath("//a[@title='Bills']/img[@class='leftmenuicons']"));
		action.moveToElement(billsmo).build().perform();
		
		Utilities.hardWait(3);
		
		//click on Payout sub-module
		System.out.println("Clicking on Payout");
		driver.findElement(By.xpath("//li[@class='nav-sub-item']/a[@title='Supplier Projects']")).click();
		
		Utilities.hardWait(3);
		
		//Click on Add new Payout Details button
		driver.findElement(By.xpath("//a[@tooltip='Add Details']/i[@class='fa fa-plus-circle fa-fw']")).click();
		
		Utilities.hardWait(10);
		
		//Requested By
		driver.findElement(By.xpath("//div[@id='user_chosen']")).click();
		Utilities.hardWait(5);
		
		driver.findElement(By.xpath("//li[contains(text(),'Bhavna Pandey')]")).click();
		Utilities.hardWait(3);
		
		//Product Owner
		driver.findElement(By.xpath("//div[@id='userName_chosen']")).click();
		Utilities.hardWait(5);
		
		driver.findElement(By.xpath("//div[4]/div[1]/div[1]/div[1]/ul[1]/li[37]")).click();
		Utilities.hardWait(3);
		
		//Company
		driver.findElement(By.xpath("//div[@id='venderName_chosen']")).click();
		Utilities.hardWait(5);
		
		driver.findElement(By.xpath("//li[contains(text(),'Madeleine Corp')]")).click();
		Utilities.hardWait(4);
		
		//Assignment Name
		driver.findElement(By.id("assignmentName")).sendKeys("testing");
		Utilities.hardWait(3);
		
		//Assignment Code
		driver.findElement(By.id("assignmentCode")).sendKeys("274855");
		Utilities.hardWait(3);
		
		//Unit
		driver.findElement(By.xpath("//div[@id='unit_chosen']")).click();
		Utilities.hardWait(5);
		
		WebElement unit = driver.findElement(By.xpath("//li[contains(text(),'Month(s)')]"));
		unit.click();
		Utilities.hardWait(3);
		
		//Rate Per Unit
		driver.findElement(By.id("ratePerUnit")).sendKeys("10");
		Utilities.hardWait(3);
		
		//VAT Percentage
		driver .findElement(By.id("vatTax")).sendKeys("80");
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
