package MainPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ObjectClasses.Login;
import ObjectClasses.Logout;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class MainClass {

	public static void main(String[] args) throws BiffException, IOException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Selenium\\Desktop\\Third Session\\Test.xls");		
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet AddressSheet = wb.getSheet("User_Login");
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\Desktop\\Selenium Setup & Libs\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--incognito");
		options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);
		for (int i=1;i<=3;i++)
		{
			driver.get("https://demo.opencart.com/index.php?route=account/login");
			//login for first time		
			//calling login class
			Login loginobject = new Login(driver);
			loginobject.Log(AddressSheet.getCell(0,i).getContents(), AddressSheet.getCell(1, i).getContents());		
			//calling logout class
			Logout logout = new Logout (driver);
			logout.logout();
			//call login page
			
		}
		}
		
		
		
	}
