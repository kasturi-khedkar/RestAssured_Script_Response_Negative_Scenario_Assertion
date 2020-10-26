package StepsDefinition;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Features",glue= {"StepsDefinitions"})
public class TestRunner extends AssertNegative{

}
