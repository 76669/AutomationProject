package resuableFunctions;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResuableClass {
	FileInputStream fis=FileInputStream("C:\\Users\\ryk96\\eclipse-workspace\\All_in_one\\src\\main\\java\\MyData\\Data.Properties");
			Properties p = new Properties();
			System.setProperty("webdriver.chrome.driver", "C:/Users/ryk96/eclipse-workspace/All_in_one/Driver/chromedriver.exe"); 
			WebDriver driver = new ChromeDriver();
			
	
		public void launchApp() {
			Reporter.log("=====Browser Session Started=====", true);
			WebDriverManager.edgedriver().setup();
			driver.get(readDataFromExcel(1, 1, filePath, sheetName));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(70));
			Reporter.log("=====Application Started=====", true);
		}
		
		
			driver.close();
			Reporter.log("=====Browser Session End=====", true);
		}
	   
	  
		public void titleEquals(String expectedTitle) {
			String actualTitle = driver.getTitle();
			assertEquals(actualTitle, expectedTitle,"Actual Title is equal to the expected Title(" + expectedTitle + ")");
			System.out.println(actual_title);
		}

		
		public void innerTextEquals(WebElement element, String expectedText) {
			String actualText = element.getText();
			assertEquals(actualText, expectedText);
			System.out.println(actual_text);
		}
		
		
		public void multipleInnerTextEquals(List<WebElement> element, String expectedText) {
			for(WebElement data: element) {
				String actualText = data.getText();
				assertEquals(actualText, expectedText);	
			}
				
		}

		
			boolean actualValue = element.isDisplayed();
			assertEquals(actualValue, expectedValue);
			System.out.println(actaul_value);
		}

		
		public void elementEnabled(WebElement element, boolean expectedValue) {
			boolean actualValue = element.isEnabled();
			assertEquals(actualValue, expectedValue);
		}


		public void elementSelected(WebElement element, boolean expectedValue) {
			boolean actualValue = element.isEnabled();
			assertEquals(actualValue, expectedValue);
		}
		
		
		public String readDataFromExcel(int rowcount,int columncount,String filepath,String Sheetname)
	    {
	        String data = null;
	        try
	        {
	            FileInputStream input= new FileInputStream(filepath);
	            @SuppressWarnings("resource")
				XSSFWorkbook wb=new XSSFWorkbook(input);
	            XSSFSheet sh=wb.getSheet(Sheetname);
	            XSSFRow row=sh.getRow(rowcount);
	            DataFormatter df = new DataFormatter();
	            data = df.formatCellValue(row.getCell(columncount));
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	        return data;
	     }
}
