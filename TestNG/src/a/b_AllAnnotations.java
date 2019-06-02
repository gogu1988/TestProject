package a;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class b_AllAnnotations {
	
	 @BeforeSuite
	    public void beforeSuite1() {
	        System.out.println("TestA: beforeSuite1");
	    }
	     
	    @BeforeSuite
	    public void beforeSuite2() {
	        System.out.println("TestA: beforeSuite2");
	    }
	     
	    @BeforeTest
	    public void beforeTest(ITestContext testContext) {
	        System.out.println("TestA: beforeTest Test<" + testContext.getName() + ">");
	    }
	     
	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("TestA: beforeClass");
	    }    
	     
	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("TestA: beforeMethod");
	    }
	     
	    @Test
	    public void unitTest1A() {
	        System.out.println("TestA: unitTest1A");
	    }
	     
	    @Test(groups="feature1")
	    public void unitTest2A() {
	        System.out.println("TestA: unitTest2A, feature1 test");
	    }    
	     
	    @Test
	    public void unitTest3A() {
	        System.out.println("TestA: unitTest3A");
	    }
	     
	    @Test(groups="feature2")
	    public void unitTest4A() {
	        System.out.println("TestA: unitTest4A, feature2 test");
	    }    
	     
	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("TestA: afterMethod");
	    }
	     
	    @AfterClass
	    public void afterClass() {
	        System.out.println("TestA: afterClass");
	    }
	     
	    @AfterTest
	    public void afterTest(ITestContext testContext) {
	        System.out.println("TestA: afterTest Test<" + testContext.getName() + ">");
	    }
	     
	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("TestA: afterSuite");
	    }
	

}
