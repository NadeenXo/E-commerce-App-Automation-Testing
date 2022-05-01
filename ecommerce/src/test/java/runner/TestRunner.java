package runner;

//import io.cucumber.junit.Cucumber;
//import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src\\main\\resources\\features",
//        glue = "stepDefinition",
//
//        monochrome = true,
//        plugin = {"pretty",
//                "html:target/cucumber.html",
//                "json:target/cucumber.json",
//                "junit:target/cukes.xml",
//                "rerun:target/rerun.txt"},
//        dryRun = false,
//        tags = "@regression"
//)

/**
 *
 */
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features = {"src\\main\\resources\\features"},
        glue = {"stepDefinition"},
        tags = "@regression"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
