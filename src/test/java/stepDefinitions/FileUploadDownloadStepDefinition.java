package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadDownloadStepDefinition {
    WebDriver driver=Hooks.driver;

    @Given("launch file upload dummy url")
    public void launchFileUploadDummyUrl(){
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

       // WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
        WebElement uploadElement = driver.findElement(By.id("uploadFile"));
        uploadElement.sendKeys("C:\\Users\\NAJINI ZAHIRHUSSAIN\\Documents\\smp\\path.png");
        driver.findElement(By.id("downloadButton")).click();
        //driver.findElement(By.id("file-submit")).click();
    }

}
