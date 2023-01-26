package test;

import static org.testng.Assert.assertEquals;

import java.awt.Dimension;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.initial;
import dev.failsafe.internal.util.Assert;
import page.initialpage;

public class initialtest extends initial{

	initialpage loginnew = new initialpage();
	@Test
	public void mainn() throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		PageFactory.initElements(driver, loginnew);
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\hrm\\src\\test\\java\\excel\\gobi.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("login");
		
		
		int rowcount = sheet.getLastRowNum();
		for(int i=0; i<=rowcount; i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			String uName = (String)row.getCell(0).getStringCellValue();
			String pWord = (String)row.getCell(1).getStringCellValue();
			
			//Character uName = (Character)row.getCell(0)
			Thread.sleep(1500);
			initialpage.username.sendKeys(Keys.CONTROL,"a");
			initialpage.username.sendKeys(Keys.DELETE); 
			initialpage.username.sendKeys(uName);
			
			Thread.sleep(1500);
			initialpage.password.sendKeys(Keys.CONTROL,"a");
			initialpage.password.sendKeys(Keys.DELETE); 
			initialpage.password.sendKeys(pWord);
			
			Thread.sleep(1500);
			initialpage.submit.click();
			
					
	}
		Thread.sleep(2500);
		initialpage.master.click();
		
		WebElement home = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/a[2]"));
		org.openqa.selenium.Dimension homelogo = home.getSize();
		
		WebElement image = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/section/header/a[2]/div")); 
		
		String imageurl ="http://192.168.1.36:3000/static/media/homebtn.4acad38d.png";
		String actualUrl = driver.getCurrentUrl();
		
		
		org.openqa.selenium.Point actualresult = initialpage.home.getLocation();
		
	        int x = actualresult.getX();
			int y = actualresult.getY();
			SoftAssert sa = new SoftAssert();
								
			    sa.assertEquals(220,x);
				sa.assertEquals(0,y);
		
				
			int height = homelogo.getHeight();
			int width = homelogo.getWidth();
				
		       sa.assertEquals(55,height);
			   sa.assertEquals(55,width);
		
//org.openqa.selenium.Point text= initialpage.mastertext.getLocation();
 
// String fontfamily = initialtest.text.getCssValue("font-family");
  
//		if( homelogo.getHeight()== 55 && homelogo.getWidth()== 55 )
//		{
//			System.out.println("logo width & hight are correct");
//		}
//		else
//		{
//			System.out.println("logo width & hight are not correct ");
//		}
		
  sa.assertAll();		
}	
}

