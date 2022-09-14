package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_SignIn {

	@FindBy(xpath="(//a[contains(text(),'Sign')])[2]") private WebElement SignIn; //variable declaration
	
	public GitHub_SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this); //variable initialization
	}
	
	public void GitHub_SignIn_btn() {
		SignIn.click();
		
	}
}
