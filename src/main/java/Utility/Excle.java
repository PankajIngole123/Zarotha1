package Utility;

import java.io.FileInputStream;

import java.io.IOException;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excle {

	public static Sheet Excle () throws BiffException, IOException{
        FileInputStream file=new FileInputStream("D:\\practicals\\Zarotha\\src\\test\\resources\\Zarotha.xls");
		Workbook workbook=Workbook.getWorkbook(file);
		Sheet number=workbook.getSheet("Zarotha");
		return number;
		
	}
}
