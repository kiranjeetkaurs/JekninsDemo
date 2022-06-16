package MyTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//public class testrunner extends AbstractTestNGCucumberTests {
@RunWith(Cucumber.class) 
@CucumberOptions(features ="./src/test/resources/features",glue= {"StepDefinitions","AppHooks"},
		
          plugin={"pretty","html:target/HtmlReports"},
		  monochrome = true,
		  dryRun = false,
		  strict = true

)
public class TestRunner {

}
