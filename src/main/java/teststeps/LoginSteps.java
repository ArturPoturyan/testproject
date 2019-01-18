package teststeps;

import org.openqa.selenium.By;
import screens.Login;
import utils.DesiredCapsManager;

public class LoginSteps {

    private Login loginScreen;


    public void signIn() throws InterruptedException {
        loginScreen = new Login();
        loginScreen.clickRegister();
        if (DesiredCapsManager.driver.findElements(By.id("com.google.android.gms:id/credential_picker_layout")).size() > 0) {

            loginScreen.popUpCancelButton();
        }
        loginScreen.userNameField();
        loginScreen.signInUsername();
        loginScreen.passwordField();
        loginScreen.signInPassword();
        loginScreen.finalSignInButton();
        Thread.sleep(5000);
    }

}
