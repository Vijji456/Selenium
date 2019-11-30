package com.mavenproject.SampleMavenProj;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataByIndex {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\VIJAYALAKSHMINAKKA\\Desktop\\Selenium\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("login");
		System.out.println("SheetLoaded");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(1);
		
		System.out.println(cell.getStringCellValue());
		
		workbook.close();
		fis.close();
	}

}
