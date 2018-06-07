package pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDef.Wwisteps;
import utility.TestBase;

public class PageOne extends TestBase {
	
	
	//@FindBy(xpath="//span[contains(.,'Weight Watchers Home')]")
	@FindBy(xpath = "//a[@class='find-a-meeting']")
	WebElement btnFindMeeting;
	
	@FindBy(xpath = "//span[contains(.,'Weight Watchers Home')]")
	WebElement lnkWeightPage;
	
	@FindBy(xpath = ".//*[@id='meetingSearch']")
	WebElement txtZipCode;
	
	@FindBy(xpath = ".//*[@id='content']/div/div/ui-view/ui-view/div/div[1]/div/div/div[2]/div[1]/div/form/div[1]/span/button")
	WebElement btnSearch;
	
	@FindBy(xpath = ".//*[@id='ml-1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[1]/span")
	WebElement lblLocation;
	
	@FindBy(xpath = ".//*[@id='ml-1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[2]")
	WebElement lblDistance;
	
	@FindBy(xpath = ".//*[@id='ml-1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[1]/span")
	WebElement LocationFirstElement;
	
	@FindBy(xpath = "//div[@class='hours-list-item-wrapper hours-list--currentday']/div[@class='hours-list-item-hours']")
	WebElement TodaysHoursOp;
	
	@FindBy(xpath = ".//*[@id='content']/div/div/ui-view/ui-view/div[1]/div/div/div[1]/div[2]/div[2]/div/location-address/div/div/div[1]/div/span")
	WebElement lblLocationSecond;
	
	//To initialize page object
	public PageOne()
	{
		TestBase.initialization();
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyHomePage() 
	{
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.getTitle();
		//System.out.println(jim);
		
	}
	
	public void GotoFindMeeting()
	{
//		
		this.btnFindMeeting.sendKeys(Keys.ENTER);
		
	}
	
	public String verifyPage2()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.getTitle();
		
	}
	
	public void EnterZipCode()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.txtZipCode.sendKeys("10011");
		this.btnSearch.sendKeys(Keys.ENTER);
	}
	
	public String PrintLocation()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
		String a1 = this.lblLocation.getText();
		String a2 = this.lblDistance.getText();
		return a1+a2;
		
	}
	
	public String StoreLocation()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		String b1 = this.lblLocation.getText();

		return b1;
		
	}
	
	public void GotoFirstResult()
	{
		//String b1 = this.lblLocation.getText();
		Actions builder = new Actions(driver);
		 builder.moveToElement(LocationFirstElement).perform();
		 //this.LocationFirstElement.sendKeys(Keys.ENTER);
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();",LocationFirstElement );
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public String StoreLocationSecond()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		String d1 = this.lblLocationSecond.getText();

		return d1;
		
	}
	
	public String HoursOfOperation()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String h1 = this.TodaysHoursOp.getText();
		return h1;
	}

	public void closeBrowser()
	{
		driver.close();
	}
}
