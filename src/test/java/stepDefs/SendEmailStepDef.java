package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SendEmailStepDef {
	WebDriver driver;
	
	@Given("User must launch application")
	public void user_must_launch_application() {
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.manage().window().maximize();
	//	String strTitl = driver.getTitle();
	//	Assert.assertEquals(strTitl, "Global");
	}
	@When("User should send email to register")
	public void user_should_send_email_to_register(String docString) {
		driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys(docString);
		
	    
	}

}
