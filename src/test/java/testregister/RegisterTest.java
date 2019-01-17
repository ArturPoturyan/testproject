package testregister;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import teststeps.RegisterSteps;
import utils.DesiredCapsManager;


public class RegisterTest {


    AndroidDriver driver;
    private RegisterSteps registerSteps;

    @BeforeClass
    public void setup() {
        driver = DesiredCapsManager.setUp();
        registerSteps = new RegisterSteps(driver);

    }

    @Test
    public void verifyFunctionalityOfRegister() throws InterruptedException {
        registerSteps.register();
        driver.resetApp();

    }
}
