package ObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
	WebDriver driver;
	public void registrationdriver (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	
//	public registration () {
		
//	}

}
