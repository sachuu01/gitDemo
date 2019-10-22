package runner;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;




@CucumberOptions(features="D:\\QaTestProject\\CsCartBdd\\src\\main\\java\\features",
                 glue={"stepdefination"},
                 plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		                  "junit:target/cucumber-reports/Cucumber.xml",
		                  "html:target/cucumber-reports/Cucumber.html"},
                monochrome=true// display console output in readable format
               ,dryRun=true
              , strict=true )

public class testrunner {
	
private TestNGCucumberRunner testngcucumberRunner;



 @BeforeClass(alwaysRun=true)
 public void setup() {
	 
	 testngcucumberRunner= new TestNGCucumberRunner(this.getClass());
 }
 
 
 @Test(groups="cucumber",description="Runs Cucumber Features",dataProvider="features")
 public void feature(CucumberFeatureWrapper cucumberfeaturewrapper) 
 {
	 testngcucumberRunner.runCucumber(cucumberfeaturewrapper.getCucumberFeature());
	 
 }
 
 @DataProvider
 public Object[][] features()
 {
	 return testngcucumberRunner.provideFeatures();
 }
 
 
 
 
 
 
 
 
 
@AfterClass(alwaysRun=true)
public void teardown()
{
	testngcucumberRunner.finish();
}
}
