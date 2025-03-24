import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  //Path to your feature files
        glue ={"stepDefinitions"} , // Package containg step definitions
        tags = "@singleTest",
        plugin = {"pretty",
                "html:build/reports/tests/test/cucumber-reports.html",
                "json:build/reports/tests/test/cucumber.json",
                "junit:build/reports/tests/test/cucumber.xml"}, //Report Generation
        monochrome = true // Makes Output Readable

)
public class TestRunner {
    // here is the code implementation of Runner Class


}
