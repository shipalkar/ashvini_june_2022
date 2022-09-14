package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_login {
	@FindBy(xpath="//input[@name=\"login\"]") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//input[@name='commit']") private WebElement LogIn_btn;
	
	public GitHub_login(WebDriver driver) {
		PageFactory.initElements(driver, this); //variable initialization
	}
	public void GitHub_login_userName() {
		UN.sendKeys("kakadeashvini@gmail.com");
	}
	public void GitHub_login_password() {
		PWD.sendKeys("9975447009");
		
	}
	public void GitHub_login_LogIn_btn() {
		LogIn_btn.click();
	}

}
