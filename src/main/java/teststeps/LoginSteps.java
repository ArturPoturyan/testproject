package teststeps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import screens.Login;

public class LoginSteps {

    AndroidDriver driver;
    Login loginScreen;

    public LoginSteps(AndroidDriver androidDriver){
        this.driver = androidDriver;
        loginScreen = new Login(driver);
    }


    public void signIn() throws InterruptedException {
        loginScreen.clickRegister();
        if (driver.findElements(By.id("com.google.android.gms:id/credential_picker_layout")).size() > 0) {

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
