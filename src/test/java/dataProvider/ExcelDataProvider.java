
package dataProvider;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;


public class ExcelDataProvider {

	
	
	
	XSSFWorkbook wb;
	XSSFSheet newsheet;
	
	public ExcelDataProvider()
	{
		try{
			
		
		File fb = new File("D:\\Selenium\\Maven_NewFramework\\AppData.xlsx");
		FileInputStream fs = new FileInputStream(fb);
		wb = new XSSFWorkbook(fs);
		newsheet = wb.getSheetAt(0);
		
			}
	catch (Exception e)
		{
		System.out.println(e.getMessage());
	}
	}
	
	public String getData(int row, int col){
		
		String data = newsheet.getRow(row).getCell(col).getStringCellValue();
		return data ;
	}

	}

	

