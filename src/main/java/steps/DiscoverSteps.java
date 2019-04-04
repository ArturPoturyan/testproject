package steps;

import io.appium.java_client.AppiumDriver;
import screens.DiscoverScreen;

public class DiscoverSteps {
    private DiscoverScreen discoverScreen;


    public DiscoverSteps(AppiumDriver driver) {
        discoverScreen = new DiscoverScreen(driver);
    }

}
