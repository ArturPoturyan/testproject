package testlogin;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import teststeps.LoginSteps;
import utils.DesiredCapsManager;

public class SignInTest {


    private LoginSteps loginSteps;
    AndroidDriver driver;


    @BeforeClass
    public void setup() {

        driver = DesiredCapsManager.setUp();
        loginSteps = new LoginSteps(driver);
    }


    @Test
    public void verifyFunctionalityOfSignIn() throws InterruptedException {
        loginSteps.signIn();
        driver.resetApp();
    }
}
