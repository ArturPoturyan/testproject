package testlogin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import teststeps.LoginSteps;
import utils.DesiredCapsManager;

public class SignInTest {

    private LoginSteps loginSteps;

    @BeforeClass
    public void setup() {
        DesiredCapsManager.setUp();
    }


    @Test
    public void verifyFunctionalityOfSignIn() throws InterruptedException {
        loginSteps = new LoginSteps();
        loginSteps.signIn();
//        Reporter.log("Login with valid credentials is successful", true);
        DesiredCapsManager.driver.resetApp();

    }
}
