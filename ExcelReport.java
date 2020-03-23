package Verification_file;

import org.automationtesting.excelreport.Xl;
public class ExcelReport
{
    public static void main(String[]args) throws Exception
   {
       Xl.generateReport("C:\\Users\\Ranjan_Kumar_mandal\\eclipse-workspace\\SeleniumCognizantFinalProject\\src\\DataReport_file","MyExcelReport1.xlsx");
   }
}