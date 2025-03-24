package stepDefinitions;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.Collections;

public class ReportGenerator {
    public static void main(String[] args) {
        System.out.println("Report");
        File reportOutputDirectory = new File("build/reports/tests/test");
        Configuration config = new Configuration(reportOutputDirectory, "selenium_automation");
        ReportBuilder reportBuilder = new ReportBuilder(Collections.singletonList("build/reports/tests/test/cucumber.html"), config);
        reportBuilder.generateReports();
    }
}
