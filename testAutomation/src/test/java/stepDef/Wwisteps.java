package stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.PageOne;
import utility.TestBase;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;

public class Wwisteps extends TestBase {

PageOne pageone = new PageOne();
	
@Given("^user is on Weightwatchers page$")
public void user_is_on_Weightwatchers_page() throws Throwable  {
		//TestBase.initialization();
		//Thread.sleep(2000);
		
	}

	@Then("^verify the given text$")
	public void verify_the_given_text() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title = pageone.VerifyHomePage();
		System.out.println(title);
		Assert.assertEquals("Weight Loss Program, Recipes & Help | Weight Watchers", title);
		
//		boolean flag = pageone.VerifyHomePage();
//		
//		Assert.assertTrue(flag);
		
	}

	@Then("^click on find a meeting link$")
	public void click_on_find_a_meeting_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pageone.GotoFindMeeting();
	}

	@Then("^verify if title contains desired text$")
	public void verify_if_title_contains_desired_text() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   String title1 = pageone.verifyPage2();
	   title1.contains("Get Schedules & Times Near You");
	}

	@Then("^search for meeting with zipcode$")
	public void search_for_meeting_with_zipcode() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    pageone.EnterZipCode();
	}

	@Then("^print the title of the result$")
	public void print_the_title_of_the_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title2 = pageone.PrintLocation();
		System.out.println(title2);
	}

	@Then("^click on the first search result and verify location$")
	public void click_on_the_first_search_result_and_verify_location() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String title3 = pageone.StoreLocation();
	    pageone.GotoFirstResult();
	    String title4 = pageone.StoreLocationSecond();
	    Assert.assertEquals(title3, title4);
	    
	    
	}

	@Then("^print todays hours of operation$")
	public void print_todays_hours_of_operation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		String title3 = pageone.HoursOfOperation();
	    System.out.println(title3);
	    
	   pageone.closeBrowser();
	}
	
}
