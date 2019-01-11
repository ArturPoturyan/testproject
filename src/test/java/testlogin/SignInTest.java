package testlogin;

import org.testng.annotations.Test;
import teststeps.LoginSteps;
import utils.DesiredCapsManager;
import org.testng.annotations.BeforeMethod;

public class SignInTest extends DesiredCapsManager {

    LoginSteps loginSteps;
    @BeforeMethod
    public void setup(){
        loginSteps = new LoginSteps();
    }



    @Test
    public void verifyFunctionalityOfSignIn() throws InterruptedException {
        loginSteps.signIn();
    }
}
