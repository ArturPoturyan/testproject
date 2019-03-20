package pageobjectfactorylogin;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.LoginScreenPageObjectFactory;
import utils.AppiumServerStartSession;

public class LoginTestPageObjectFactory extends AppiumServerStartSession {
    private LoginScreenPageObjectFactory login;


    @BeforeClass
    public void setup() {

        login = new LoginScreenPageObjectFactory(driver);
    }


    @Test
    public void verifyFunctionalityLogin() {
        login.signInPicsArt("kakao60", "qwertya");

    }
}
