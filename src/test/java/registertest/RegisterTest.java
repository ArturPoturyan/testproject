package registertest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.RegisterScreen;
import steps.RegisterSteps;
import utils.AppiumServerStartSession;

import static org.testng.Assert.assertTrue;


public class RegisterTest extends AppiumServerStartSession {


    private RegisterSteps registerSteps;
    private RegisterScreen registerScreen;

    @BeforeClass
    public void setup() {
        registerSteps = new RegisterSteps(driver);
        registerScreen = new RegisterScreen(driver);

    }

    @Test
    public void verifyFunctionalityOfRegister() {
        registerScreen.clickNextButton();
        registerScreen.typeUserInfoEmailText();
        assertTrue(registerScreen.isNextButtonEnabled(), "User info email next button in not enable ");
        registerScreen.clickNextButton();
        registerScreen.typePassword();
        assertTrue(registerScreen.isNextButtonEnabled(), "password next button is not enable ");
        registerScreen.clickNextButton();
        registerScreen.clickNextButton();

        if (registerScreen.isForgotToAddProfilePhotoPopupPresent()) {
            registerScreen.clickMaybeLaterButton();
        }
        assertTrue(registerScreen.isSubscriptionBannerPresent(), "payment button offer screen is not present on the screen");
        registerScreen.clickSubscriptionOfferCloseButton();
    }
}
