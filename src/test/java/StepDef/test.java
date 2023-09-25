package StepDef;

import org.openqa.selenium.By;


import BaseObjects.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class test extends BaseClass {
	
	@Before public void openBrowser() {
		baseMethod();
	}
	
	@After public void closeBroser() {
		driver.quit();
	}
  
    @Given("Google is open in the browser")
    public void google_is_open_in_the_browser() {
        driver.manage().window().maximize();
        
    }
    @When("User searches for Lambda Test")
    public void user_searches_for_lambda_test() {
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Lambda Test");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
        
    }
    
    @When("User searches for Selenium cross browser testing")
    public void user_searches_for_Selenium_cross_browser_testing(){
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium Cross Browser Testing");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
    }
    
    @When("User enters more than two keywords")
    public void user_enters_more_than_two_keywords(){
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("LambdaTest, Regression");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
 
    }
 
 
    @When("User clicks on I am Feeling Lucky button")
    public void user_clicks_on_I_am_Feeling_Lucky_button(){
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']")).click();
 
    }
    
    @Then("Results are displayed")
    public void results_are_displayed() {
       System.out.println("The page title is - " +driver.getTitle());
      driver.quit();
    }
 
 
 
}
