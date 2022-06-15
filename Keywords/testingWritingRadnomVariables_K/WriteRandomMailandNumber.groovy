package testingWritingRadnomVariables_K

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
//import MobileBuiltInKeywords as Mobile
//import WSBuiltInKeywords as WS
//import WebUiBuiltInKeywords as WebUI
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteRadnomMailandNumber {

	@Keyword
	public void writeRadnomData(String name, String nameTwo, String nameThird, String nameFourth, String nameFifth) throws IOException{
		String userDir = System.getProperty("user.dir");
		try {
		FileInputStream fis = new FileInputStream(userDir + "\\OrdersExcel\\Orders.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Accounts");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		Row row = sheet.createRow(rowCount+1);

		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(name);

		Cell cellTwo = row.createCell(1);
		cellTwo.setCellType(cell.CELL_TYPE_STRING);
		cellTwo.setCellValue(nameTwo);

		Cell cellThird = row.createCell(2);
		cellThird.setCellType(cell.CELL_TYPE_STRING);
		cellThird.setCellValue(nameThird);

		Cell cellFourth = row.createCell(3);
		cellFourth.setCellType(cell.CELL_TYPE_STRING);
		cellFourth.setCellValue(nameFourth);

		Cell cellFifth = row.createCell(4);
		cellFifth.setCellType(cell.CELL_TYPE_STRING);
		cellFifth.setCellValue(nameFifth);

		FileOutputStream fos = new FileOutputStream(userDir + "\\OrdersExcel\\Orders.xlsx");
		workbook.write(fos);
		fos.close();
		}
		catch (IOException e) {
			FileInputStream fis = new FileInputStream(userDir + "/OrdersExcel/Orders.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
			XSSFSheet sheet = workbook.getSheet("Accounts");
			int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
			Row row = sheet.createRow(rowCount+1);
	
			Cell cell = row.createCell(0);
			cell.setCellType(cell.CELL_TYPE_STRING);
			cell.setCellValue(name);
	
			Cell cellTwo = row.createCell(1);
			cellTwo.setCellType(cell.CELL_TYPE_STRING);
			cellTwo.setCellValue(nameTwo);
	
			Cell cellThird = row.createCell(2);
			cellThird.setCellType(cell.CELL_TYPE_STRING);
			cellThird.setCellValue(nameThird);
	
			Cell cellFourth = row.createCell(3);
			cellFourth.setCellType(cell.CELL_TYPE_STRING);
			cellFourth.setCellValue(nameFourth);
	
			Cell cellFifth = row.createCell(4);
			cellFifth.setCellType(cell.CELL_TYPE_STRING);
			cellFifth.setCellValue(nameFifth);
	
			FileOutputStream fos = new FileOutputStream(userDir + "/OrdersExcel/Orders.xlsx");
			workbook.write(fos);
			fos.close();
		}
	}
}
