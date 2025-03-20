package stepDefinitions;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class KeyDrivenFramework {
    static WebDriver driver;

    public static void openBrowser(String browser) {
        driver = BrowserFactory.createDriver(browser);
    }

    public static void navigateTo(String url) {
        System.out.println(" Navigate to url :" +url);
        driver.get(url);
    }

    //execute test based on keyword
    public void executeKeyword(String keyword, String value) {
        switch (keyword) {
            case "OpenBrowser":
                openBrowser(value);
                break;
            case "NavigateTo":
                System.out.println("Navigate to switch case");
                navigateTo(value);
                break;
        }

    }

    //Read Excel data and execute test
    public void readAndExecuteExcelData() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\NAJINI ZAHIRHUSSAIN\\" +
                "Documents\\smp\\selenium_automation\\src\\test\\resources\\testDatas\\KeywordDrivenFramework.xlsx"));
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (int i=1; i<=sheet.getPhysicalNumberOfRows();i++){
            Row row = sheet.getRow(i);
            if(row==null){
                break;
            }
            String keyword = row.getCell(1).getStringCellValue();
            System.out.println("Keyword : "+keyword);
            String value = row.getCell(2).getStringCellValue();
            System.out.println("value : "+ value);
            executeKeyword(keyword,value);
        }
    }

}
