package a;

import org.testng.ITestContext;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class b1_AllAnnotations {
	
	@BeforeSuite
    public void beforeSuite() {
        System.out.println("TestB: beforeSuite");
    }
     
    @BeforeTest
    public void beforeTest(ITestContext testContext) {
        System.out.println("TestB: beforeTest Test<" + testContext.getName() + ">");
    }
     
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("TestB: beforeMethod");
    }
     
    @Test
    public void scenario1B() {
        System.out.println("TestB: Scenario1B");
    }
     
    @Test(groups="feature1")
    public void scenario2B() {
        System.out.println("TestB: Scenario2B, feature1 test");
    }    
     
    @AfterMethod
    public void afterMethod() {
        System.out.println("TestB: afterMethod");
    }
     
    @AfterTest
    public void afterTest(ITestContext testContext) {
        System.out.println("TestB: afterTest Test<" + testContext.getName() + ">");
    }
     
    @AfterSuite
    public void afterSuite() {
        System.out.println("TestB: afterSuite");
    }
     
    @BeforeGroups(groups="feature1")
    public void beforeGroup() {
        System.out.println("TestB: beforeGroup for feature1");
    }
     
    @AfterGroups(groups="feature1")
    public void afterGroup() {
        System.out.println("TestB: afterGroup for feature1");
    }

}
