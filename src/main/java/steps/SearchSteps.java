package steps;

import io.appium.java_client.AppiumDriver;
import screens.ExploreScreen;

public class SearchSteps {
    private ExploreScreen exploreScreen;

    public SearchSteps(AppiumDriver driver) {
        exploreScreen = new ExploreScreen(driver);
    }


    public void goToSearch() {
        exploreScreen.clickExploreTab();
        exploreScreen.clickSearchBar();
    }
}
