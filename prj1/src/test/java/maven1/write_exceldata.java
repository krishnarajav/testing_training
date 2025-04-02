package maven1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_exceldata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filename = "data.xlsx";
		String sheetname = "Sheet1";
		
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetname);
		
		XSSFRow r = sh.getRow(0);
//		XSSFCell cell = r.getCell(2);
//		cell.setCellValue("new value");
		XSSFCell cell = r.createCell(3); 
		cell.setCellValue("ghi");
		FileOutputStream fos = new FileOutputStream(filename);
		wb.write(fos);
		fos.close();
		wb.close();
	}

}
