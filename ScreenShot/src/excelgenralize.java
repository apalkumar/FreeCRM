import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelgenralize {
	public static void main(String[] args) {
		try {
			//creating a new file instance  
			File file = new File("E:\\DataSets\\seleniumdata\\EmployeeRecord.xlsx");
			//obtaining bytes from the file  
			FileInputStream fis = new FileInputStream(file);
			//creating Workbook instance that refers to .xlsx file 
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			//creating a Sheet object to retrieve object 
			XSSFSheet sheet = wb.getSheet("Employee Details");
			//iterating over excel file  
			Iterator<Row> itr = sheet.iterator();
			while(itr.hasNext()) {
				Row row = itr.next();
				//iterating over each column
				Iterator<Cell> cellIterator = row.cellIterator();
				while(cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					//field that represents number cell type  
					case NUMERIC:
						double i = cell.getNumericCellValue();
						BigDecimal bd = new BigDecimal(i);
						System.out.print(bd+"\t");  
						//System.out.println(cell.getStringCellValue());
						break;
						//field that represents string cell type
					case STRING:
						System.out.print(cell.getStringCellValue() + "\t\t");
						//System.out.println(cell.getStringCellValue());
						break;
					default:
						break;
					}
				}
				System.out.println("");  
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
