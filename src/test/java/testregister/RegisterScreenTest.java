package testregister;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.RegisterScreen;
import steps.RegisterSteps;
import utils.DesiredCapsManager;

import static org.testng.AssertJUnit.assertTrue;


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
        registerScreen.clickNextButton();
        registerScreen.typeUserInfoEmailText();
        assertTrue("User info email next button in not enable "
                , registerScreen.isNextButtonEnabled());
        registerScreen.clickNextButton();
        registerScreen.typePassword();
        assertTrue("password next button is not enable "
                , registerScreen.isNextButtonEnabled());
        registerScreen.clickNextButton();
        Thread.sleep(2000);
        registerScreen.clickNextButton();

        if (registerScreen.isForgotToAddProfilePhotoPopupPresent()) {
            registerScreen.clickMaybeLaterButton();
        }
        assertTrue("payment button offer screen is not present on the screen"
                , registerScreen.isSubscriptionBannerPresent());
        registerScreen.clickSubscriptionOfferCloseButton();
    }
}
