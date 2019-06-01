package Academy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObj.Landing_Page;
import pageObj.Loginpage;
import resources.Base_Class;

import java.io.IOException;


public class HomePage extends  Base_Class{
	
	@BeforeTest
	public void intializer() throws IOException {
		
		driver = intializerDriver();
	
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password, String text) throws IOException
	{
		
		driver.get(prop.getProperty("url"));
		Landing_Page l = new Landing_Page(driver);
		l.getLogin().click();
		Loginpage lp = new Loginpage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		System.out.println(text);
		lp.getNext().click();
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data=new Object [2][3];
		
		data[0][0]="xyz@gmail.com";
		data[0][1]="789456";
		data[0][2]="Restricted user";
		
		data[1][0]="iop@gmail.com";
		data[1][1]="789456";
		data[1][2]="Non Restricted user";
		
		return data;
		
	}
	

	}
