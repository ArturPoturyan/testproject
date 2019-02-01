package testlogin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.LoginScreen;
import steps.LoginSteps;
import utils.DesiredCapsManager;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class SignInScreenTest extends DesiredCapsManager {

    private LoginSteps loginSteps;
    private LoginScreen loginScreen;

    @BeforeClass
    public void setup() {

        loginSteps = new LoginSteps(driver);
        loginScreen = new LoginScreen(driver);

    }

    //todo priorityner@ harcnel
    @Test
    public void verifyFunctionalityOfSignIn() throws InterruptedException {
        loginSteps.signIn();
    }
}
