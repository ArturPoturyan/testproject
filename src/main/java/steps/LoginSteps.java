package steps;

import io.appium.java_client.android.AndroidDriver;
import screens.LoginScreen;

public class LoginSteps {

    private AndroidDriver driver;
    private LoginScreen loginScreen;

    public LoginSteps(AndroidDriver androidDriver) {
        this.driver = androidDriver;
        loginScreen = new LoginScreen(driver);
    }

    public void signIn() throws InterruptedException {
        loginScreen.clickRegisterButton();
        if (loginScreen.isContinueWithEmailPopupPresent()) {
            loginScreen.clickPopUpCancelButton();
        }
        loginScreen.clickUserNameField();
        loginScreen.typeSignInUsername();
        loginScreen.clickPasswordField();
        loginScreen.typeSignInPassword();
        loginScreen.clickFinalSignInButton();
        Thread.sleep(5000);
    }
}
