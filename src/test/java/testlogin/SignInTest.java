package testlogin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.LoginSteps;
import utils.DesiredCapsManager;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertFalse;
public class SignInTest extends DesiredCapsManager {

    private LoginSteps loginSteps;

    @BeforeClass
    public void setup() {

        loginSteps = new LoginSteps(driver);

    }

    //todo priorityner@ harcnel
    @Test
    public void verifyFunctionalityOfSignIn() throws InterruptedException {
        loginSteps.signIn();
        driver.resetApp();
        //assertTrue("offer screen is not present on the screen",isOfferPresent());

    }
}
