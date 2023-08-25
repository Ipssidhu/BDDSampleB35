package stepDefs;

import static org.testng.Assert.assertTrue;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {
	WebDriver driver ;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}
	
//	@When("Unser enter credentials")
//	public void unser_enter_credentials() {
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();	    
//	}
// parameter nd scenrio outline	
//	@When("Unser enter {string} and {string}")
//	public void unser_enter_and(String strUsr, String strPwd) {
//		driver.findElement(By.id("username")).sendKeys(strUsr);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
//	}
	// using data-table as a list
//	@When("Unser enter credentials")
//	public void unser_enter_credentials(DataTable dataTable) {
//		List <List<String>> data = dataTable.asLists();
//		String strUsr = data.get(0).get(0);
//		String strPwd = data.get(0).get(1);
//		driver.findElement(By.id("username")).sendKeys(strUsr);
//		driver.findElement(By.id("password")).sendKeys(strPwd);
//		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();   
//	}
	
	// using data-table as Map
	@When("Unser enter credentials")
	public void unser_enter_credentials(DataTable dataTable) {
		List<Map<String, String>>data =dataTable.asMaps();
		System.out.println("List size is.."+data.size());
		String strUsr = data.get(0).get("username");
		String strPwd = data.get(0).get("password");
		driver.findElement(By.id("username")).sendKeys(strUsr);
		driver.findElement(By.id("password")).sendKeys(strPwd);
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click(); 
		
	}
	
	@Then("User should be navigated to HomePage")
	public void user_should_be_navigated_to_home_page() {
		boolean isvalid= driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		assertTrue(isvalid);   
	}


}
