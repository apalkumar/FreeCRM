import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excelone {

	public static void main(String[] args) {
		// Create an object of File Class to open the excel.
		File file = new File("E:\\DataSets\\seleniumdata\\EmployeeRecord.xlsx");

		try {
			// Create an object for FileInputStream to read the excel file
			FileInputStream inputstream = new FileInputStream(file);

			//		Create an workobject that refers to .xlsx file
			XSSFWorkbook wb = new XSSFWorkbook(inputstream);
			XSSFSheet sheet = wb.getSheet("Employee Details");

			//		Iterator<Row> iterator = sheet.iterator();
			//		while (iterator.hasNext()) {

			//		}
			XSSFRow row;
			//		row = sheet.getRow(1);
			//		Cell cell = row.getCell(0);

			int rownumber = sheet.getLastRowNum();


			//		String address = cell.getStringCellValue();
			System.out.println("The row number Value is-->"+rownumber);

			for(int i=0;i<=rownumber;i++) {
				for(int j=0;j<=6;j++) {
					row = sheet.getRow(i);
					System.out.println(row.getCell(j));
					System.out.println("\n");	
				}

			}

			//		System.out.println("The Cell Value is-->"+cell);
			//		System.out.println("The Address is-->"+address);

			//		XSSFCell cell = sheet.cell
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}




	}

}
