package stepDefs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDef {
	WebDriver driver ;
	
	@Given("User is on Google Page")
	public void user_is_on_google_page() {			
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");   
	}
	
	@When("I search Java Tutorial")
	public void i_search_java_tutorial() {
		WebElement srcBox= driver.findElement(By.name("q"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.submit();
	}
	
	@Then("Should display Java result page")
	public void should_display_java_result_page() {
		String strTitle = driver.getTitle(); 
		Assert.assertEquals(strTitle, "Java Tutorial - Google Search");
	}
	
	@When("I search Selenium Tutorial")
	public void i_search_Selenium_tutorial() {
		WebElement srcBox= driver.findElement(By.name("q"));
		srcBox.sendKeys("Selenium Tutorial");
		srcBox.submit();
	}
	
	@Then("Should display Selenium result page")
	  public void should_display_Selenium_result_page() {
		String strTitle = driver.getTitle(); 
		Assert.assertEquals(strTitle, "Selenium Tutorial - Google Search");
	} 
}
