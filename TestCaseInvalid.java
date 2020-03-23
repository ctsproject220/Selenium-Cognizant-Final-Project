package Verification_file;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import POM_file.POM_file;


public class TestCaseInvalid {
	

	public void process1(WebDriver d1) throws Exception
	{
		POM_file pomobject = new POM_file(d1);
		
		FileInputStream file=new FileInputStream("C:\\Users\\Ranjan_Kumar_mandal\\eclipse-workspace\\SeleniumCognizantFinalProject\\src\\DataReport_file\\Data.xlsx");
	    String fn="C:\\Users\\Ranjan_Kumar_mandal\\eclipse-workspace\\SeleniumCognizantFinalProject\\src\\DataReport_file\\Data.xlsx";
	    System.out.println("Welcome");

	    String fe=fn.substring(fn.indexOf("."));
	    System.out.println(fe);
	    try
	    {
	         if(fe.equals(".xlsx"))
	       {
	           System.out.println("Your file extension is xlsx");
	           @SuppressWarnings("resource")
	           XSSFWorkbook w = new XSSFWorkbook(file);
	           XSSFSheet sheet = w.getSheet("s");  
	           int a = sheet.getPhysicalNumberOfRows();
	           int b = sheet.getRow(0).getPhysicalNumberOfCells();
	   		   System.out.println("Total number of Rows: "+a);
	   		   System.out.println("Total number of Columns: "+b);
	   		   String Username=null;
	       	   	String Password=null;	
	   			for(int j=0;j<b;j++)
	   			{
	   					if(j==0)
		            	{
	   						System.out.println(sheet.getRow(0).getCell(j).getStringCellValue());
		                 	Username=sheet.getRow(0).getCell(j).getStringCellValue();

		            	}
		            	if(j==1)
		            	{
		            		System.out.println(sheet.getRow(0).getCell(j).getStringCellValue());
		            		Password=sheet.getRow(0).getCell(j).getStringCellValue();
		            	}
	   			}
	   			pomobject.enterUserName(Username);
	   			Thread.sleep(2000);
	   			pomobject.enterPassword(Password);
	   			Thread.sleep(2000);
	   			pomobject.enterConfirmPassword(Password);
	   			Thread.sleep(2000);
				pomobject.selectQuestion();
				Thread.sleep(2000);
				pomobject.enterAnswer("Dog");
				Thread.sleep(2000);
				pomobject.selectLang();
				Thread.sleep(2000);
				pomobject.enterFirstName("Ranjan");
				Thread.sleep(2000);
				pomobject.enterMiddleName("Kumar");
				Thread.sleep(2000);
				pomobject.enterLastName("Mandal");
				Thread.sleep(2000);
				pomobject.selectGender();
				Thread.sleep(2000);
				pomobject.selectDateOfBirth();
				Thread.sleep(2000);
				pomobject.selectOccupation();
				Thread.sleep(2000);
				pomobject.selectmaritalStatus();
				Thread.sleep(2000);
				pomobject.selectCountry();
				Thread.sleep(2000);
				pomobject.enterEmail("134");             //WRONG Email data has been passed
				Thread.sleep(2000);
				pomobject.enterMobile("9110173166");
				Thread.sleep(2000);
				pomobject.selectNationality();
				Thread.sleep(2000);
				pomobject.enterFlatNo("191/B");
				Thread.sleep(2000);
				pomobject.enterStreet("Near Indiranagar Metro Station");
				Thread.sleep(2000);
				pomobject.enterLocality("Indiranagar");
				Thread.sleep(2000);
				pomobject.enterPincode("560038"); 	    	
				Thread.sleep(2000);
				pomobject.enterState();
				Thread.sleep(2000);
				pomobject.selectCity();
				Thread.sleep(2000);
				pomobject.selectPost();
				Thread.sleep(2000);
				pomobject.enterPhone("9110173166");
				Thread.sleep(2000);
				pomobject.selectCopyAddress();
				Thread.sleep(120000);
				pomobject.selectTermscheckbox();
				
				Thread.sleep(2000);
				File defectfile = ((TakesScreenshot)d1).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(defectfile, new File("C:\\Users\\Ranjan_Kumar_mandal\\eclipse-workspace\\SeleniumCognizantFinalProject\\src\\DataReport_file\\picture.gif"));
	       }
	    }
		catch (Exception e)
	    {
			throw (e);
	    }
	    
	    //-----------------------------
	    
	    try
	    {
	         if(fe.equals(".xls"))
	       {
	           System.out.println("Your file extension is xlsx");
	           @SuppressWarnings("resource")
	           HSSFWorkbook w = new HSSFWorkbook(file);
	           HSSFSheet sheet = w.getSheet("s");  
	           int a = sheet.getPhysicalNumberOfRows();
	           int b = sheet.getRow(0).getPhysicalNumberOfCells();
	   		   System.out.println("Total number of Rows: "+a);
	   		   System.out.println("Total number of Columns: "+b);
	   		   String Username=null;
	       	   	String Password=null;	
	   			for(int j=0;j<b;j++)
	   			{
	   					if(j==0)
		            	{
	   						System.out.println(sheet.getRow(1).getCell(j).getStringCellValue());
		                 	Username=sheet.getRow(1).getCell(j).getStringCellValue();

		            	}
		            	if(j==1)
		            	{
		            		System.out.println(sheet.getRow(1).getCell(j).getStringCellValue());
		            		Password=sheet.getRow(1).getCell(j).getStringCellValue();
		            	}
	   			}
	   			pomobject.enterUserName(Username);
	   			Thread.sleep(2000);
	   			pomobject.enterPassword(Password);
	   			Thread.sleep(2000);
	   			pomobject.enterConfirmPassword(Password);
	   			Thread.sleep(2000);
				pomobject.selectQuestion();
				Thread.sleep(2000);
				pomobject.enterAnswer("Dog");
				Thread.sleep(2000);
				pomobject.selectLang();
				Thread.sleep(2000);
				pomobject.enterFirstName("Ranjan");
				Thread.sleep(2000);
				pomobject.enterMiddleName("Kumar");
				Thread.sleep(2000);
				pomobject.enterLastName("Mandal");
				Thread.sleep(2000);
				pomobject.selectGender();
				Thread.sleep(2000);
				pomobject.selectDateOfBirth();
				Thread.sleep(2000);
				pomobject.selectOccupation();
				Thread.sleep(2000);
				pomobject.selectmaritalStatus();
				Thread.sleep(2000);
				pomobject.selectCountry();
				Thread.sleep(2000);
				pomobject.enterEmail("ctstest155@gmail.com");
				Thread.sleep(2000);
				pomobject.enterMobile("9110173166");
				Thread.sleep(2000);
				pomobject.selectNationality();
				Thread.sleep(2000);
				pomobject.enterFlatNo("27/A");
				Thread.sleep(2000);
				pomobject.enterStreet("Near Indiranagar Metro Station");
				Thread.sleep(2000);
				pomobject.enterLocality("Indiranagar Metro");
				Thread.sleep(2000);
				pomobject.enterPincode("560038");
				Thread.sleep(2000);
				pomobject.enterState();
				Thread.sleep(2000);
				pomobject.selectCity();
				Thread.sleep(2000);
				pomobject.selectPost();
				Thread.sleep(2000);
				pomobject.enterPhone("9110173166");
				Thread.sleep(2000);
				pomobject.selectCopyAddress();
				Thread.sleep(120000);
				pomobject.selectTermscheckbox();

				Thread.sleep(2000);
				File defectfile = ((TakesScreenshot)d1).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(defectfile, new File("C:\\Users\\Ranjan_Kumar_mandal\\eclipse-workspace\\SeleniumCognizantFinalProject\\src\\DataReport_file\\picturefor_valid.gif"));
	       }
	    }
		catch (Exception e)
	    {
			throw (e);
	    }
	    
	    
	}

}
