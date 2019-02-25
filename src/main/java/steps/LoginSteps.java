package steps;

import io.appium.java_client.AppiumDriver;
import screens.LoginScreen;


public class LoginSteps {

    private AppiumDriver driver;
    private LoginScreen loginScreen;

    public LoginSteps(AppiumDriver androidDriver) {
        this.driver = androidDriver;
        loginScreen = new LoginScreen(driver);
    }

    public void signIn(){

        loginScreen.registerStepSignInButton();
        if (loginScreen.isContinueWithEmailPopupPresent()) {
            loginScreen.clickPopUpCancelButton();
        }
        loginScreen.typeSignInUsername();
        loginScreen.typeSignInPassword();
        loginScreen.clickFinalSignInButton();
    }
}
