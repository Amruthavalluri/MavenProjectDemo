package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppSearch {
	WebDriver driver;
	String url="https://adactinhotelapp.com/";
	
	@After 
	public void t2() {
		driver.quit();
	}
	
	@Given("I am on Hotel App Login Page")
	public void i_am_on_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	     driver = new ChromeDriver();
	     driver.get("https://adactinhotelapp.com/");
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(string);
	    //throw new io.cucumber.java.PendingException();
	//hotel app page login
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(string);
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I click Login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login")).click();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("I am Logged in Successfully")
	public void i_am_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}


}
