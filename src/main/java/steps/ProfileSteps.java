package steps;

import io.appium.java_client.AppiumDriver;
import screens.ProfileScreen;

public class ProfileSteps {
    private ProfileScreen profileScreen;

    public ProfileSteps(AppiumDriver driver) {
        profileScreen = new ProfileScreen(driver);
    }

}
