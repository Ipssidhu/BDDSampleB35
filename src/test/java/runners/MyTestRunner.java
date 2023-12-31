package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		    features = "src//test//resources//features//",
		    glue= {"stepDefs"},
		    dryRun = false,
		    monochrome = true,
		    plugin = {"pretty",
		    		"html:target//reports//HTMLReports.html",
		    //		"usage:target//reports//UsageReport",
		    //		"json:target//reports//JSONReport.json",
		    //		"junit:target//reports//JUnitReports.xml"
		    //		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		    		"rerun:target/failedScenario.txt"
		    		}
		    
		)
public class MyTestRunner extends AbstractTestNGCucumberTests {
	
  
}
