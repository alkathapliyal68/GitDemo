package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Protal_HomePage {
	public WebDriver driver;
	
	By searchbox=By.id("search-courses");
	
	public Protal_HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement searchbox()
	{
		return driver.findElement(searchbox);
	}
}
