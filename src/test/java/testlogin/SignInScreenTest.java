package testlogin;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.LoginScreen;
import steps.LoginSteps;
import utils.DesiredCapsManager;

public class SignInScreenTest extends DesiredCapsManager {

    private LoginSteps loginSteps;
    private LoginScreen loginScreen;

    @BeforeClass
    public void setup() {

        loginSteps = new LoginSteps(driver);
        loginScreen = new LoginScreen(driver);

    }

    @Test
    public void verifyFunctionalityOfSignIn() {
        loginScreen.registerStepSignInButton();
        if (loginScreen.isContinueWithEmailPopupPresent()) {
            loginScreen.clickPopUpCancelButton();
        }
        loginScreen.typeSignInUsername();
        loginScreen.typeSignInPassword();
        loginScreen.clickFinalSignInButton();
    }
}
