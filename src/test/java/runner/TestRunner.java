package runner;

import io.cucumber.testng.*;

@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"stepdefinitions","hooks"}
        ,plugin = {"pretty","html:target/cucumber-reports/report.html","json:target/cucumber-report/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {}