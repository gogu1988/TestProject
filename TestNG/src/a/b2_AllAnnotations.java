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

public class b2_AllAnnotations {
	
	@BeforeSuite
    public void beforeSuite() {
        System.out.println("TestC: beforeSuite");
    }
     
    @BeforeTest(alwaysRun=true)
    public void beforeTest(ITestContext testContext) {
        System.out.println("TestC: beforeTest Test<" + testContext.getName() + ">");
    }
     
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("TestC: beforeMethod");
    }
     
    @Test
    public void uiSceario1C() {
        System.out.println("TestC: uiSceario1C");
    }    
     
    @Test(groups="feature1")
    public void uiScenario2C() {
        System.out.println("TestC: uiScenario2C, feature1 test");
    }
     
    @Test(groups="feature2")
    public void uiScenario3C() {
        System.out.println("TestC: uiScenario3C, feature2 test");
    }
     
    @AfterMethod(groups="feature1")
    public void afterMethod() {
        System.out.println("TestC: afterMethod");
    }
     
    @AfterTest(alwaysRun=true)
    public void afterTest(ITestContext testContext) {
        System.out.println("TestC: afterTest Test<" + testContext.getName() + ">");
    }
     
    @AfterSuite
    public void afterSuite() {
        System.out.println("TestC: afterSuite");
    }
     
    @BeforeGroups(groups="feature2")
    public void beforeGroup() {
        System.out.println("TestC: beforeGroup for feature2");
    }
     
    @AfterGroups(groups="feature2")
    public void afterGroup() {
        System.out.println("TestC: afterGroup for feature2");
    }

}
