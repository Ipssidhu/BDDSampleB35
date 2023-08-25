package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
	    features = "src//test//resources//taggedFeature//",
	    glue= {"stepDefs"},
	    dryRun = false,
	    monochrome = true,
	  //  tags ="@SmokeTest"
	    tags = "@RegressionTest"
)

public class TaggedRunner extends AbstractTestNGCucumberTests {

}
