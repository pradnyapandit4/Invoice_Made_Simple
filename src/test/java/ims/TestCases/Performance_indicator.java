package ims.TestCases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import ims.Utilities.Utilities;

public class Performance_indicator extends BaseClass {

	@Test(groups = {"AllTest","Performance_indicator"})
	public void check_fun_PerformanceIndicator()
	{
		//Utilities.hardWait(3);
		
		//hover on Performance module
		System.out.println("Hovering on Performance module");
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@title='Performance']/img[@class='leftmenuicons']"));
		action.moveToElement(element).build().perform();
		
		Utilities.hardWait(3);
		
		//click on Performance Indicator sub-module
		System.out.println("Clicking on Performance Indicator");
		driver.findElement(By.xpath("//li[@class='nav-sub-item']/a[@title='Performance Indicator']")).click();
		
		Utilities.hardWait(3);
		
		//Click on Add New Performance Indicator button
		driver.findElement(By.xpath("//a[@tooltip='Add New Performance Indicator']/i[@class='fa fa-plus-circle fa-fw']")).click();
		
		Utilities.hardWait(7);
		
		//Requested by
		driver.findElement(By.xpath("//div[@id='user_chosen']/a[@class='chosen-single']/span")).click();
		Utilities.hardWait(5);
		
		WebElement reqby = driver.findElement(By.xpath("//div[@class='chosen-drop']/ul[@class='chosen-results']/li[3]"));
		reqby.click();
		Utilities.hardWait(3);
		
		//Job Title
		driver.findElement(By.xpath("//div[@id='jobTitle_chosen']/a[@class='chosen-single']/span")).click();
		
		Utilities.hardWait(5);
		
		WebElement jobtitle = driver.findElement(By.xpath("//li[contains(text(),'automation tester')]"));
		jobtitle.click();
		
		Utilities.hardWait(3);
		
		//Period
		driver.findElement(By.xpath("//div[@id='PERIOD_ID_chosen']/a[@class='chosen-single']/span")).click();
		
		Utilities.hardWait(5);
		
		WebElement period = driver.findElement(By.xpath("//li[contains(text(),'2023')]"));
		period.click();
		
		Utilities.hardWait(3);
		
		//Goal Type
		driver.findElement(By.xpath("//div[@id='GOAL_TYPE_chosen']/a[@class='chosen-single']/span")).click();
		
		Utilities.hardWait(5);
		
		WebElement goaltype = driver.findElement(By.xpath("//li[contains(text(),'Collabrative Goal')]"));
		goaltype.click();
		
		Utilities.hardWait(3);
		
		//Goal Type Description
		driver.findElement(By.id("GOAL_TYPE_DESC")).sendKeys("Achievement");
		
		Utilities.hardWait(3);
		
		//Goal Type Description
		driver.findElement(By.id("DESCRIPTION")).sendKeys("Performance");
		
		Utilities.hardWait(3);
		
		//Goal Title
		driver.findElement(By.xpath("//div[@id='GOAL_TITLE_chosen']/a[@class='chosen-single']/span")).click();
		
		Utilities.hardWait(5);
		
		WebElement goaltitle = driver.findElement(By.xpath("//div[9]/div[1]/div[1]/div[1]/ul[1]/li[22]"));
		goaltitle.click();
		
		Utilities.hardWait(3);
		
		//Minimum Rating
		driver.findElement(By.xpath("//div[@id='RATE_MIN_chosen']/a[@class='chosen-single']/span")).click();
		
		Utilities.hardWait(5);
		
		WebElement minrate = driver.findElement(By.xpath("//li[contains(text(),'Rating 3 Quality Contributor')]"));
		minrate.click();
		
		Utilities.hardWait(3);
		
		//Maximum Rating
		driver.findElement(By.xpath("//div[@id='RATE_MAX_chosen']/a[@class='chosen-single']/span")).click();
		
		Utilities.hardWait(5);
		
		WebElement maxrate = driver.findElement(By.xpath("//div[13]/div[1]/div[1]/div[1]/ul[1]/li[5]"));
		maxrate.click();
		
		Utilities.hardWait(3);
		
		//Default Rating
		driver.findElement(By.xpath("//div[@id='RATE_DEFAULT_chosen']/a[@class='chosen-single']/span")).click();
		
		Utilities.hardWait(5);
		
		WebElement defrate = driver.findElement(By.xpath("//div[15]/div[1]/div[1]/div[1]/ul[1]/li[6]"));
		defrate.click();
		
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
