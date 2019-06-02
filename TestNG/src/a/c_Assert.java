package a;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class c_Assert {

/*
 * Assert will stop the execution of next steps after a failure step
 * softAssert will continue the execution of next steps even after failure step
 */
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void Assert(){
		String expected = "xxxx";
		String actual = "yyyy";
		Assert.assertEquals(actual, expected);
		Assert.assertTrue(2>3, "2 is not greater");		
	}
	
	@Test
	public void softAssert(){
		String expected = "xxxx";
		String actual = "yyyy";
		softAssert.assertEquals(actual, expected);
		softAssert.assertTrue(2>3, "2 is not greater");	
		softAssert.assertAll();
	}
}
