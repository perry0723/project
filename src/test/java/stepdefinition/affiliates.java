package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;
//import seleniumday1.Select;
//import seleniumday1.WebElement;

public class affiliates {
	
	WebDriver driver = hooksclass.driver;

	@Given("user is on login page")
		public void user_is_on_login_page() {
			driver.get("http://uniformm1.upskills.in/admin/");
	    
	}
	
	@When("user enters invalid username {string} and password {string}")
		public void user_enters_invalid_username_and_password(String username, String password){
			driver.findElement(By.id("input-username")).sendKeys(username);
			driver.findElement(By.id("input-password")).sendKeys(password);
		
	    
	}
	
	@When("clicks on login")
		public void clicks_on_login() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		Thread.sleep(1000);
	    
	}
	
	@Then("error message pops up")
		public void error_message_pops_up() {
		try{
			driver.findElement(By.xpath("//button[@class='close']"));
			System.out.println("test case pass");
			driver.quit();
			System.out.println("driver is closed");
		}
		catch(org.openqa.selenium.NoSuchElementException e){
			System.out.println("test case fails");
			driver.quit();
			System.out.println("driver is closed");
		}
	    
	}
	
	@When("user enters valid username {string} and password {string}")
		public void user_enters_valid_username_and_password(String username, String password) {
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		
	    
	}
	
	@Then("User navigates to homepage")
		public void user_navigates_to_homepage() {
		try{
			driver.findElement(By.xpath("//button[@class='close']"));
			System.out.println("test case fails");
			driver.quit();
			System.out.println("driver is closed");
		}
		catch(org.openqa.selenium.NoSuchElementException e){
			System.out.println("test case pass");
			driver.quit();
			System.out.println("driver is closed");
		}
	}
	

	@When("clicks on filter")
	public void clicks_on_filter() throws InterruptedException {
		try {
			driver.findElement(By.xpath("//button[@id='button-filter']")).click();
			System.out.println("List is filtered");
			Thread.sleep(3000);
			driver.quit();
			System.out.println("driver is closed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			driver.quit();
			System.out.println("driver is closed");
			e.printStackTrace();
		}
	}

	@Then("List of Affiliates is filtered")
	public void list_of_Affiliates_is_filtered() {
		   
	}
	
	@When("enters valid username and password")
	public void enters_valid_username_and_password() {
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("Admin@123");
	}

	@When("user navigates to Affiliates page")
	public void user_navigates_to_Affiliates_page() throws InterruptedException {
		driver.findElement(By.xpath("//a[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("html/body/div[1]/nav/ul/li[7]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("html/body/div[1]/nav/ul/li[7]/ul/li[2]")).click();
		Thread.sleep(1000);
		System.out.println("navigation successfull");
	}
	@When("user enters Name {string} and Id {string}")
	public void user_enters_Name_and_Id(String Name, String Id) {
		System.out.println("dekho");
		driver.findElement(By.xpath("//input[@id='input-name']")).sendKeys(Name);
		System.out.println("chla?");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(Id);
	}
	@When("user selects Status and Approved dropdowns")
	public void user_selects_Status_and_Approved_dropdowns() {
		
		WebElement drop = driver.findElement(By.xpath("//*[@id='input-status']"));
		Select obj = new Select(drop);
		obj.selectByVisibleText("Enabled");
		
		WebElement drop1 = driver.findElement(By.xpath("//*[@id='input-approved']"));
		Select obj1 = new Select(drop1);
		obj1.selectByVisibleText("No");
	}

}
