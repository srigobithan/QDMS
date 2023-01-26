package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class initialpage {

	// TODO Auto-generated method stub
			@FindBy(id  = "usernameOrEmail")
			public static WebElement username;
			
			@FindBy(id  = "password")
			public static WebElement password;
			
			@FindBy(xpath  = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button")
			public static WebElement submit;
			
			@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div/div")
			public static WebElement master;
			
			@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/a[2]")
			public static WebElement home ;
			
			@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/header/div[1]")
			public static WebElement mastertext ;
			
			
			

}
