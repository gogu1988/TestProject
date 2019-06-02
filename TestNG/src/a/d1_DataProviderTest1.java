package a;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class d1_DataProviderTest1 {
	
	@Test(dataProviderClass=d_DataProvider.class,dataProvider="regTestDataProvider")
	public void doRegister(String username,	String password,String email){
		
		System.out.println(username + " " + password + " " + email);
		
	}
	
	

}
