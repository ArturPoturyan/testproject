package steps;

import io.appium.java_client.AppiumDriver;
import screens.ProfileScreen;

public class ProfileSteps {
    private AppiumDriver driver;
    private ProfileScreen profileScreen;

    public ProfileSteps(AppiumDriver driver) {
        this.driver = driver;
    }

}
