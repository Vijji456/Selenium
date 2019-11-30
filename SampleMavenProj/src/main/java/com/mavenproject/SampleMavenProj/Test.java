package com.mavenproject.SampleMavenProj;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\VIJAYALAKSHMINAKKA\\Desktop\\Selenium\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("login");
		System.out.println("SheetLoaded");
		XSSFRow row=sheet.getRow(4);
		XSSFCell cell=row.getCell(4);
		cell.setCellValue("Stop");
		//System.out.println(cell.getStringCellValue());
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\VIJAYALAKSHMINAKKA\\Desktop\\Selenium\\TestData.xlsx");
		workbook.write(fos);
		
		workbook.close();
		fis.close();
		fos.close();
	}

}
