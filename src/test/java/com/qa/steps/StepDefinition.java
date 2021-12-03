package com.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
WebDriver driver;
	
	@Given ("As a user we launch particular url {string}")
	public void As_a_user_we_launch_particular_url(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	
	@When ("as  user we send the username {string} and password {string}")
	public void as_user_we_send_the_username(String username, String Password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		
	}
	
	
	@And ("as a user we click the login button")
	public void as_a_user_we_click_the_login_button()
	{
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then ("as a user we verifies title and url of the orange HRM")
	public void as_a_user_we_verifiestitle_and_url_of_the_orange_HRM( )
	{
		String url = driver.getCurrentUrl();
		String Title = driver.getTitle();
		if(url.equals("OrangeHRM") && Title.equals("https://opensource-demo.orangehrmlive.com/"))
		{
			System.out.println("Test Pass");
		}
	}

}
