package Academy;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObj.Landing_Page;
import pageObj.Loginpage;
import resources.Base_Class;

import java.io.IOException;

//adding logs
//Generating HTML Reports
//ScreenShots on failure
//jenkins integration

public class ValidateNavigation extends Base_Class {

	@Test
	public void basePageNavigation() throws IOException {
		driver = intializerDriver();
		driver.get(prop.getProperty("url"));
		Landing_Page l = new Landing_Page(driver);
		Assert.assertTrue(l.getNavBar().isDisplayed());
		//Assert.assertFalse(false);

	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
