package runner;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"stepdefinitions","hooks"}
        ,plugin = {"pretty","html:target/cucumber-reports/report.html","json:target/cucumber-report/cucumber.json"}
)

public class TestRunner {

}