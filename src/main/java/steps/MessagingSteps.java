package steps;

import io.appium.java_client.AppiumDriver;
import screens.MessagingScreen;

public class MessagingSteps {
    private MessagingScreen messagingScreen;

    public MessagingSteps(AppiumDriver driver) {
        messagingScreen = new MessagingScreen(driver);
    }
}
