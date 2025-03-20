package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MouseActionsPage {
    WebDriver driver;

    public MouseActionsPage(WebDriver driver) {
        this.driver = driver;
        System.out.println("Driver in MouseActionsPage: " + driver);
    }

    WebElement selfPacedVideoCoursePath = driver.findElement(By.xpath(
            "//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/a"));
   WebElement seleniumCourseCurriculumPath = driver.findElement(By.xpath(
            "//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li[1]/a"));


    /*public void performMouseActions(){
      Actions actions = new Actions(driver);
      actions.moveToElement(selfPacedVideoCoursePath)
              .moveToElement(seleniumCourseCurriculumPath)
              .click().perform();
    }

     */


}
