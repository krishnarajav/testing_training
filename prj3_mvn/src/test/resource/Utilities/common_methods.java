package Utilities;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class common_methods {
	public static WebDriver dr;
	public static void launch_chrome(String url) {
		dr = new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}
	
	public static void launch_edge(String url) {
		System.setProperty("webdriver.edge.driver", "asedgedriver_v133.exe");
		dr = new EdgeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}
	
	public static Object[][] getdata() throws IOException {
		Object[][] data = new Object[2][2];
		String filename = "login.xlsx";
		String sheetname = "Sheet1";
		
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetname);
		
		for(int i = 0; i < 2; i++) {
			XSSFRow r = sh.getRow(i);
			XSSFCell cell = r.getCell(0);
			String uname = cell.getStringCellValue();
			cell = r.getCell(1);
			String pwd = cell.getStringCellValue();
			data[i][0] = uname;
			data[i][1] = pwd;
		}
		wb.close();
		return data;
	}
}
