package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		    features = "src//test//resources//features//GooglePageSearch.feature",
		    glue= {"stepDefs"},
		    dryRun = false,
		    monochrome = true,
		    plugin = {"pretty"}
		    
		)
public class MyTestRunner extends AbstractTestNGCucumberTests {
	
  
}
