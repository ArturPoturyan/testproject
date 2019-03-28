package testngexample;

import org.testng.annotations.*;


public class Test {

    //-----------------------------------Suite Suite-----------------------------------
    //You can set suite level setup such as test environment, Database connection string etc.
    @BeforeSuite
    public void setupSuite() {
        System.out.println("@BeforeSuite started.");
    }

    //-----------------------------------All Tests Setup-----------------------------------
    //All Tests setup
    @BeforeTest
    public void setupTests() {
        System.out.println("@BeforeTest started.");
    }

    //-----------------------------------Class Setup-----------------------------------
    //All Tests setup
    @BeforeClass
    public void setupClass() {
        System.out.println("@BeforeClass started.");
    }

    //-----------------------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        //Print console that code is in @BeforeMethod!
        System.out.println("@BeforeMethod has started.");

    }


    //-----------------------------------Tests-----------------------------------
    @org.testng.annotations.Test
    public void firstTest() {
        System.out.println("First Test is Started.");

    }

    @org.testng.annotations.Test
    public void secondTest() {
        System.out.println("Second Test is Started.");

    }

    //-----------------------------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest() {
        System.out.println("@AfterMethod has started.");
        //Close browser and end the session
    }

    //-----------------------------------Class TearDown-----------------------------------
    @AfterClass
    public void teardownClass() {
        System.out.println("@AfterClass has started.");
    }

    //-----------------------------------All Tests TearDown-----------------------------------
    @AfterTest
    public void teardownTests() {
        System.out.println("@AfterTest has started.");
    }

    //-----------------------------------Suite TearDown-----------------------------------
    @AfterSuite
    public void teardownSuite() {
        System.out.println("@AfterSuite has started.");
    }
}
