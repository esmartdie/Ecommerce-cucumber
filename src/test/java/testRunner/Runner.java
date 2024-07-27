package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/resources/features"},
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        glue = {"steps", "hooks"},
        plugin = {"pretty", "html:target/report/cucumber-reports.html", "json:target/report/cucumber.json"},
        tags = "@reg"
)
public class Runner extends AbstractTestNGCucumberTests {

}
