package test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"}, plugin = {
        "json:target/cucumber-reports/cucumber.json", "html:target/site/cucumber-html-report",
        "junit:target/cucumber.xml",
        "pretty"}, glue = "StepDefinition",
        dryRun = (false), monochrome = (true), snippets = (SnippetType.CAMELCASE),
        tags = "@Cesar.CY01")
public class test {
}
