/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author root
 */
public class EXCEL {
    
    /*
    public String READ()
    {
        
        File f = new File("");

        try {
            FileInputStream fin = new FileInputStream(f);
            XSSFWorkbook workbook = new XSSFWorkbook(fin);
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFRow row = sheet.getRow(0);
            XSSFCell cell = row.getCell(0);
            String cellValue = cell.getStringCellValue();
            System.out.println(cellValue);
            
            
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
     
        
        public void setValue(String Val)
        {
            
            
        }
        
        
    }
  */
    private Object Val;
    public void setValue(Object Val)
    {
        
        this.Val = Val;
    }
    
    public Object getValue()
    {
        
        return this.Val;
    }
}
