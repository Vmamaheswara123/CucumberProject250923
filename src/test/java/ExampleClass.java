import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class ExampleClass {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * TakesScreenshot scrShot = ((TakesScreenshot)driver);
		 * File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		 * 
		 * TakeScreenshot scrShot = ((TakeScreenshot) WebDriver);
		 * File scrFile = scrShot.getScreensot(OutputType.File);
		 */
		
		
		
		
		/*//find odd number
		int a = 31;
		if(a/2 != 0 ) {
			System.out.println("odd number : "+a);
		}*/
		
		/*
		//by using the get window handle method navigate the child or parent window
		String paranet_window = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i_window = windows.iterator();
		while(i_window.hasNext()) {
			String window = i_window.next();
			
			if(winow.equals("paranet_window")) {
				driver.switchTo().window(paranet_window);
			}
		}*/
		
		
		
		/*
		 * How write code for action class
		 * Actions action = new Actions(driver);
		   action.moveToElement(element).click().perform();
		 */
//		String file_path = "C:\\Users\\Home\\Desktop\\SampleData.xlsx";
//		FileInputStream file = new FileInputStream(file_path);
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		XSSFSheet sheet = workbook.getSheet("SalesOrders");
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(0);
//		System.out.println(cell);
//		System.out.println("Get Valve : "+ sheet.getRow(2).getCell(0));
//		
//		dataProviders();
		remveDublicates();
	}
	
	
	public static void remveDublicates() {
		//int[] a = {1,2,2,3,4,5,6,2,3,4,3};
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6,2,3,4,3));
		System.out.println("Array List : "+ al);
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>(al);
		ArrayList<Integer> listWithoutDublicates = new ArrayList<>(hashSet);
		System.out.println("List Without dublicates : "+ listWithoutDublicates);
	}
	
	@DataProvider (name = "data-provider")
	public static Object[][] dataProviders() {
		return new Object[][] {
			{"1","India"},
			{"2","USA"}
		};
	}

}
