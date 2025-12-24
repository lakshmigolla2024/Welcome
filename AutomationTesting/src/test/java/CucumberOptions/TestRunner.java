package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "resources",   // folder containing .feature files
    glue = "StepDefinitions",                  // Java package of your step defs (case-sensitive)
    monochrome = true,
    plugin = {"pretty", "html:target/cucumber-html-report.html"}
   
    
)
public class TestRunner extends AbstractTestNGCucumberTests {
}