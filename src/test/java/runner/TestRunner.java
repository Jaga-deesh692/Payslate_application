package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"feature"},
        glue = {"stepDefinitions","Base"},
        plugin = {"html:target/CucumberBdd_html_report.html"},
        tags="@smoke"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
