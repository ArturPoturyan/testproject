package steps;

import io.appium.java_client.AppiumDriver;
import screens.ChallengesScreen;

public class ChallengesSteps {
    private AppiumDriver driver;
    private ChallengesScreen challengesScreen;

    public ChallengesSteps(AppiumDriver driver) {
        this.driver = driver;
        challengesScreen = new ChallengesScreen(driver);
    }


    public void skipShareToInstagramPopup() {
        if (challengesScreen.isShareToInstagramPopupPresent()) {
            challengesScreen.clickSkipButton();
        }
    }
}
