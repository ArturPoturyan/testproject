package testlogin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import teststeps.LoginSteps;
import utils.DesiredCapsManager;

public class SignInTest extends DesiredCapsManager {

    private LoginSteps loginSteps;
    @BeforeClass
    public void setup(){
        loginSteps = new LoginSteps(driver);
    }



    @Test
    public void verifyFunctionalityOfSignIn() throws InterruptedException {
        loginSteps.signIn();
    }
}
