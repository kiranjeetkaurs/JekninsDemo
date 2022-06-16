package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class) 
	@CucumberOptions(features ="C:\\Users\\kiran_9zu7s3k\\eclipse-workspace\\JekninsDemo\\src\\test\\resources\\com\\features",
	glue= {"C:\\Users\\kiran_9zu7s3k\\eclipse-workspace\\JekninsDemo\\src\\test\\java\\stepdefinitions",
			"C:\\Users\\kiran_9zu7s3k\\eclipse-workspace\\JekninsDemo\\src\\test\\java\\AppHooks"},
//	plugin={"pretty","html:target/HtmlReports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    monochrome = true,
	dryRun = false,
		//	  strict = true
			  publish = true
			 	 )
	public class MyTestRunner {

	}