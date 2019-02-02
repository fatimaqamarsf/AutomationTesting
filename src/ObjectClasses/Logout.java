package ObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);				
	}
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	public WebElement myaccout;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
	public WebElement logout;
	
	public void logout() {
		
	myaccout.click();
	logout.click();
	System.out.println("Logout Successfully");
	}
}
