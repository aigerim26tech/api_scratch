package api.qa.cashwise.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "api/qa/cashwise/stepdefinitions",
        dryRun = true,
        tags = "@regression",
        plugin = {"pretty", "html:target/apiReport.html", "json:target/cucumber-reports/cucumber.json"}
//        "rerun:target/apiFailedTests.txt"}
)
public class Runner {
}
