package Gluecode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	private static final String TestURL = null;
	WebDriver Driver;

	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() 
	{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver. manage().window().maximize() ;	
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// Implicit wait 
	    
	}
	@When("User enters Url {string}")
	public void user_enters_url(String string) 
	{
		//System.out.println("User opens URL...."+TestURL);
				Driver.get(TestURL);  
	}
	@When("user enters username as {UserName} and Password as {string}")
	public void user_enters_username_as_and_password_as(String UserName, String Password) 
	{
		//System.out.println("UserName...."+UserName);
				//System.out.println("Password...."+Password);
		Driver.findElement(By.name("username")).sendKeys(UserName);
		Driver.findElement(By.name("password")).sendKeys(Password);
		Driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	@Then("Go to skills page")
	public void go_to_skills_page() 
	{
	
		//System.out.println("Go to Skill Page....");
		Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
		Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")).click();
	}
	@Then("Enter Skill name as {string} and skill desc as {string}")
	public void enter_skill_name_as_and_skill_desc_as(String SkillName, String SkillDescr) 
	{
		Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName);
		Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDescr);
		Driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	}
	@Then("click on logout")
	public void click_on_logout() 
	{
		//System.out.println("Click on Welcome>logout button....");
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
				Driver.findElement(By.linkText("Logout"));
			 
	}
	@Then("close the browser")
	public void close_the_browser() 
	{
		//System.out.println("Clse Browser....");
			
				Driver.close();
			
			}
	}
	


