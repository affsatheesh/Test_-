package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFile/Testcase3_login.feature", glue = {"Steps","Testcase_3"},
monochrome=true,
plugin ="html:Report/Testcase_report")

public class Test_Runner 
{

}