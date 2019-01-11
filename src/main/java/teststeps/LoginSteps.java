package teststeps;

import org.openqa.selenium.By;
import screens.Login;
import utils.DesiredCapsManager;

public class LoginSteps extends DesiredCapsManager {



    Login login = new Login();

    public  void signIn() throws InterruptedException {
        login.clickRegister();
        if (driver.findElements(By.id("com.google.android.gms:id/credential_picker_layout")).size() > 0) {

            login.popUpCancelButton();
        }
        login.userNameField();
        login.signInUsername();
        login.passwordField();
        login.signInPassword();
        login.finalSignInButton();
        Thread.sleep(5000);
    }
}
