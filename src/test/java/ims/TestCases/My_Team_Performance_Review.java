package ims.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ims.Utilities.Utilities;

public class My_Team_Performance_Review extends BaseClass{

	@Test(groups = {"AllTest","My_Team_Performance_Review"})
	public void chec_fun_MyTeamPerformanceReview()
	{
		Utilities.hardWait(3);
		
		//hover on Performance module
		System.out.println("Hovering on Performance module");
		Actions action = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("//a[@title='Performance']/img[@class='leftmenuicons']"));
		action.moveToElement(element).build().perform();
		
		Utilities.hardWait(3);
		
		//click on My Team Performance Review sub-module
		System.out.println("Clicking on My Team Performance Review");
		driver.findElement(By.xpath("//li[@class='nav-sub-item']/a[@title='My Team Performance Review']")).click();
		
		Utilities.hardWait(3);
		
		//Approve Selected Performance Review
		List<WebElement> tableData = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size = tableData.size();
		//System.out.println(size);
		Utilities.hardWait(5);
		
		for(int i = 0; i<size;)
		{
				tableData.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//button[1]/i[@class='fa fa-thumbs-o-up fa-fw']")).click();
				Utilities.hardWait(4);
				break;
			
		}
		
		//Reject Selected Performance Review
		List<WebElement> tableData2 = driver.findElements(By.xpath("//tbody/tr/td[@class=' select-checkbox']"));
		
		int size2 = tableData2.size();
		//System.out.println(size);
		Utilities.hardWait(5);
		
		for(int i = 0; i<size2;)
		{
				tableData2.get(i).click();
				Utilities.hardWait(5);
				driver.findElement(By.xpath("//button[2]/i[@class='fa fa-thumbs-o-down fa-fw']")).click();
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
