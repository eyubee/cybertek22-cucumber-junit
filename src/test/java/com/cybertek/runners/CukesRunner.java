package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ="html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions",

     //   tags= "@wip"    tags= "@librarian"  tags= "@regression or @smoke" tags= "@student"  tags= "@admin"  tags= "@all"
        dryRun = true,
        tags= ""


)
public class CukesRunner {

}
