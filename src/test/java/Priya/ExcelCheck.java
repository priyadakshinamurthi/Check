package Priya;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelCheck {

	public void checkExcel() throws IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Dakshinamurthi\\Documents\\Test.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int count = workbook.getNumberOfSheets();
		for(int i=0;i<count;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sample"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> row = sheet.iterator();
				Row firstRow = row.next();
				Iterator<Cell> cell = firstRow.cellIterator();
				int a=0,k=0;
				while(cell.hasNext())
				{
					if(cell.next().getStringCellValue().equalsIgnoreCase("Testcases"))
					{
						a=k;
					}
					k++;
				}
				while(row.hasNext())
				{
					Row r = row.next();
					if(r.getCell(a).getStringCellValue().equalsIgnoreCase("B"))
					{
					Iterator<Cell> c = r.cellIterator();
					while(c.hasNext())
					{
						System.out.println(c.next().getStringCellValue());
					}
					}
				}
			}
		}
		
	}
}
