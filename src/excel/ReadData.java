package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {
	
	@Test
	
	public void readData() throws IOException
	
	{
		FileInputStream fis = new FileInputStream("./testdata/SampleData.xlsx"); //file name where the file is 
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		System.out.println(wb.getSheet("Data").getRow(2).getCell(3).getStringCellValue());
		//System.out.println(wb.getSheet("Data").getRow(1).getCell(1).toString());
		
		/*Sheet s = wb.getSheet("theo");
		Row r = s.getRow(12);
		Cell c = r.getCell(10);
		System.out.println(c.getStringCellValue());*/
		
	
	}

}
