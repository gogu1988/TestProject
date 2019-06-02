package a;

import org.testng.Assert;
import org.testng.annotations.Test;

public class e_DependentMethods {
		
	@Test(priority=1,dataProviderClass=d_DataProvider.class,dataProvider="loginTestDataProvider")
	public void testLogin(String username,String psw){		
		System.out.println("Login Test");		
	}
	
	@Test(priority=2,dependsOnMethods={"testLogin"})
	public void testChangePassword(){
		System.out.println("Password change Test");		
	}
	
	@Test(priority=3,dependsOnMethods={"testLogin","testChangePassword"}, dataProviderClass=d_DataProvider.class,dataProvider="loginTestDataProvider")
	public void logout(){
		System.out.println("Logout test");		
	}
	
}
