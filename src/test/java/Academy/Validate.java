package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObj.Landing_Page;
import resources.Base_Class;

public class Validate extends Base_Class {

	@Test
	public void basePageTitle() throws IOException {
		driver = intializerDriver();
		driver.get(prop.getProperty("url"));
		Landing_Page l = new Landing_Page(driver);
		Assert.assertEquals(l.getTitle().getText(), "Featured Courses");

	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}

}
