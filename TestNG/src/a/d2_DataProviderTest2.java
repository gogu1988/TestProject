package a;

import org.testng.annotations.Test;

public class d2_DataProviderTest2 {
	// multiple tests -same data - same dataprovider
	// multiple tests - different data - same dataprovider

	@Test(priority=1,dataProviderClass=d_DataProvider.class,dataProvider="sampleProvider")
	public void testA(String u,String p){
		
	}
	
	@Test(priority=2,dataProviderClass=d_DataProvider.class,dataProvider="sampleProvider")
	public void testB(String u,String p,String email){
		
	}
	

}
