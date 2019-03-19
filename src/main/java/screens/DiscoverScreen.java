package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

import static org.testng.Assert.assertTrue;

public class DiscoverScreen implements CommonValues {

    private AppiumDriver driver;
    private Utils utils;


    public DiscoverScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);
    }


    //Buttons
    private By DISCOVER_ARTISTS_TITLE = By.className("android.widget.TextView");
    //    private By FOLLOW_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_follow");
    private By PICS_ART_BUTTON_TEXT = By.id(APP_PACKAGE_NAME + ":id/picsart_button_text");
    private By SUGGESTED_FRIENDS_CONTAINER = By.id(APP_PACKAGE_NAME + ":id/coordinator_layout");


    //Views


    public boolean isDiscoverArtistsPresent() {
        return utils.findElementByText(DISCOVER_ARTISTS_TITLE, "Discover Artists");
    }

//    public void clickFollowButton(int index) {
//        utils.clickByIndex(FOLLOW_BUTTON, index);
//    }

    public boolean isFollowButtonTextPresent() {
        return utils.getText(PICS_ART_BUTTON_TEXT).equals("  FOLLOW");
    }

    public void verticalScrollToUpDiscoverArtistsScreen() {
        utils.scrollVerticalFromCenterToUp(SUGGESTED_FRIENDS_CONTAINER);

    }

    public boolean isFollowingButtonTextPresent() {
        return utils.getText(PICS_ART_BUTTON_TEXT).equals("  FOLLOWING");
    }

    public void clickFollowButton() {

        for (int i = 0; i < 4; i++) {
            if (isFollowButtonTextPresent()) {
                utils.clickElementByText(PICS_ART_BUTTON_TEXT, "  FOLLOW");
                assertTrue(isFollowingButtonTextPresent(), "Following button is not present");

            }
            verticalScrollToUpDiscoverArtistsScreen();
        }
    }
}
