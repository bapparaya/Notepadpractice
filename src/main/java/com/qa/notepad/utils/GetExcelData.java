package com.qa.notepad.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData {

	public static Object[][] getExcelData() throws IOException{

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\notepad\\testdata\\logindata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int lastRownum= sheet.getLastRowNum()+1;
		int lastCellnum=sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[lastRownum][lastCellnum];

		   DataFormatter formatter = new DataFormatter(); // ✅ Formatter to handle numeric values correctly

	        for (int i = 1; i < lastRownum; i++) { // Start from row 1 to skip headers
	            for (int j = 0; j < lastCellnum; j++) {
	                data[i - 1][j] = formatter.formatCellValue(sheet.getRow(i).getCell(j)); // ✅ Formats numbers correctly
	                System.out.println(data[i - 1][j]); // Print for debugging
	            }
	        }

		return data;

		}



}
