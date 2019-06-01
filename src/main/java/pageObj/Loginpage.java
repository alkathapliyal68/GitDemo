package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	public WebDriver driver;
	
	By email=By.xpath("//input[@id='user_email']");
	By pass=By.xpath("//input[@id='user_password']");
	By value=By.cssSelector("[value='Log In']");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(pass);
	}
	public WebElement getNext() {
		return driver.findElement(value);
	}

}
