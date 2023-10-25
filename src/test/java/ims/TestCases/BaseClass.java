package ims.TestCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import ims.Utilities.Utilities;
import org.testng.annotations.AfterClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait ;
	
	By byUsername = By.id("username");
	By byPassword = By.id("password");
	By byClickLogin = By.name("submit");
	
	@BeforeClass(groups = {"AllTest","Employee_info","Employee_remark","Team_details","Period_master","Invoice Scheduler","Credit_note","Invoice","Project_details","Receipt","Remittance","Bill","Bill_payment","Debit_memo","Payout","Supplier_projects","Performance_indicator","My_Performance_Review","My_Team_Performance_Review"})
	public void setup_Login()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		
		driver.get("https://www.mydevsystems.com/dev/gap_v2/index.php/login/login");
		System.out.println("URL is opened");
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(80));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byUsername));
		WebElement user = driver.findElement(byUsername);
		user.sendKeys("INVadmin");
		System.out.println("Entered username");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byPassword));
		WebElement pass = driver.findElement(byPassword);
		pass.sendKeys("INVadmin");
		System.out.println("Entered password");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(byClickLogin));
		driver.findElement(byClickLogin).click();
		System.out.println("Successfully Login");
		
		Utilities.hardWait(5);
		
	}
	
	@AfterClass(groups = {"AllTest","Employee_info","Employee_remark","Team_details","Period_master","Invoice Scheduler","Credit_note","Invoice","Project_details","Receipt","Remittance","Bill","Bill_payment","Debit_memo","Payout","Supplier_projects","Performance_indicator","My_Performance_Review","My_Team_Performance_Review"})
	public void tearDown()
	{
		Utilities.hardWait(3);
		driver.close();
	}
	
}
