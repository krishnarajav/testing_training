package maven1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class stud_excel_op {
	static HashMap<Integer, student> s = new HashMap<>();
	static String filename = "student.xlsx";
	static String sheetname1 = "Sheet1";
	static String sheetname2 = "Sheet2";
	
	static void read_cells() throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetname1);
		int i = 1, j = 0;
		while(i <= 3) {
			XSSFRow r = sh.getRow(i);
			student a = new student((int)r.getCell(j).getNumericCellValue(), (int)r.getCell(j+1).getNumericCellValue(), (int)r.getCell(j+2).getNumericCellValue(), 0.0f);
			s.put(a.sid, a);
			i++;
		}
	}
	
	static void write_cells() throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetname2);
		
		int i = 1, sid;
		while(i <= 3) {
			XSSFRow r = sh.getRow(i);
			sid = (int)r.getCell(0).getNumericCellValue();
			for(Entry<Integer, student> x : s.entrySet()) {
				if(x.getKey() == sid) {
					student v = x.getValue();
					XSSFCell cell = r.createCell(3);
					cell.setCellValue(v.avg);
					FileOutputStream fos = new FileOutputStream(filename);
					wb.write(fos);
					fos.close();
					break;
				}
			}
			i++;
		}
		wb.close();
	}
}
