package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/feature", 
glue="steps", 
dryRun=true, 
monochrome=true,
snippets=SnippetType.CAMELCASE)
public class Runner extends AbstractTestNGCucumberTests {
	
	
}
