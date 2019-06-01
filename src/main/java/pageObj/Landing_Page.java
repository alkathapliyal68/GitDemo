package pageObj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landing_Page {
	
	public WebDriver driver;
	By signIn=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By navbar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By popup=By.xpath("//button[text()='NO THANKS']");


	public Landing_Page(WebDriver driver) {
		this.driver=driver;
	}

	public List<WebElement> getPopupSize()
	{
		return driver.findElements(popup);
	}
	public WebElement getPopup()
	{
		return driver.findElement(popup);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(signIn);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getNavBar()
	{
		return driver.findElement(navbar);
	}

	
	

}
