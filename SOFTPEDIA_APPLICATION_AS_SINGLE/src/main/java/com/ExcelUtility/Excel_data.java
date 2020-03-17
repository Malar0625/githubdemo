package com.ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_data 
{
	public  String excel_username(int i) throws IOException 
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\TestData\\exceldata.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell =row.getCell(0);
		cell.setCellType(CellType.STRING);
		String uname =cell.getStringCellValue();
		return uname;
	}
	public  String Email(int i) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\TestData\\exceldata.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell1 =row.getCell(1);
		cell1.setCellType(CellType.STRING);
		String Email =cell1.getStringCellValue();
		return Email;
	}
	public  String excel_password(int i) throws IOException 
	{ 
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\TestData\\exceldata.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell2 =row.getCell(2);
		cell2.setCellType(CellType.STRING);
		String pwd =cell2.getStringCellValue();
		return pwd;
		
	}
	public  String excel_repassword(int i) throws IOException 
	{ 
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\TestData\\exceldata.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row =sheet.getRow(i);
		XSSFCell cell3 =row.getCell(3);
		cell3.setCellType(CellType.STRING);
		String re_pwd =cell3.getStringCellValue();
		return re_pwd;
		
	}
}