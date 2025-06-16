package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilities {

	public static String readProperty(String key) {
		File file = new File("src/test/resources/main.properties");
		Properties properties = null;

		try {
			FileInputStream fileinput = new FileInputStream(file);
			properties = new Properties();
			try {
				properties.load(fileinput);

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}

	public static Map<Integer,List<Object>> readExcel(String sheetName) {
		File file = new File("src/test/resources/Registration Details.xlsx");
		HashMap<Integer,List<Object>>userData=new HashMap<Integer,List<Object>>();
		List<Object>rowData=new ArrayList<Object>();
		XSSFWorkbook xssfworkbook = null;
		try {
			FileInputStream fileinputstream = new FileInputStream(file);
			 xssfworkbook = new XSSFWorkbook(fileinputstream);
			XSSFSheet xssfsheet = xssfworkbook.getSheet(sheetName);
			int lastrowNo = xssfsheet.getLastRowNum();

			for (int i = 1; i <= lastrowNo; i++) {
				XSSFRow xssfrow = xssfsheet.getRow(i);
				int lastcellNo = xssfrow.getLastCellNum();
				rowData.clear();
				for (int j = 0; j < lastcellNo; j++) {
					
					XSSFCell xssfcell = xssfrow.getCell(j);
					if (xssfcell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
						rowData.add(xssfcell.getStringCellValue());
					}
					if (xssfcell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
						rowData.add(xssfcell.getNumericCellValue());
					}
					if (xssfcell.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
						rowData.add(xssfcell.getRawValue());
					}
					if (xssfcell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
					   rowData.add(xssfcell.getBooleanCellValue());
					}
				}
				
				userData.put(i, rowData);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				xssfworkbook.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return userData;

	}

}
