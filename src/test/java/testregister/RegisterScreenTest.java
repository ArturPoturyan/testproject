package testregister;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.RegisterScreen;
import steps.RegisterSteps;
import utils.DesiredCapsManager;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertFalse;


public class RegisterScreenTest extends DesiredCapsManager {


    private RegisterSteps registerSteps;
    private RegisterScreen registerScreen;

    @BeforeClass
    public void setup() {
        registerSteps = new RegisterSteps(driver);
        registerScreen = new RegisterScreen(driver);

    }

    @Test
    public void verifyFunctionalityOfRegister() throws InterruptedException {
        registerScreen.clickCreateAccountButton();
        registerScreen.typeUserInfoEmailText();
        Thread.sleep(2000);
        registerScreen.clickNextButton();
        registerScreen.typeUserInfoFullNameText();
        registerScreen.clickNextButton();
        registerScreen.typeUserInfoUsernameText();
        Thread.sleep(2000);
        registerScreen.clickNextButton();
        registerScreen.clickNextButton();
        Thread.sleep(2000);
        if (registerScreen.isForgotToAddProfilePhotoPopupPresent()) {
            registerScreen.clickMaybeLaterButton();
        }
        registerScreen.clickBirthdaySkipButton();
        assertTrue("offer screen is not present on the screen", registerScreen.isPaymentButton1Present());
    }
}
