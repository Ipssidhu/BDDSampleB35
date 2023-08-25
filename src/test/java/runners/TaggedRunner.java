package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
	    features = "src//test//resources//taggedFeature//",
	    glue= {"stepDefs"},
	    dryRun = false,
	    monochrome = true,
	  //  tags ="@SmokeTest"
	  //  tags = "@RegressionTest"
     //	  tags= "@SmokeTest or @RegressionTest"
	 //     tags= "@SmokeTest and @RegressionTest"
      //      tags = "not @RegressionTest"
	  //  tags="@PhaseTwo"
//	    tags="@PhaseOne and @SmokeTest"
	 //   tags="@PhaseOne and not @SmokeTest"
//	    tags ="@PhaseOne and  @SmokeTest or @PhaseTwo and @RegressionTest"
	    tags ="@PhaseOne and  not  @SmokeTest and not @RegressionTest"
	    
		)

public class TaggedRunner extends AbstractTestNGCucumberTests {

}
