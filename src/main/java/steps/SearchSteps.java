package steps;

import io.appium.java_client.AppiumDriver;
import screens.ExploreScreen;
import screens.SearchScreen;

import static org.testng.Assert.assertTrue;

public class SearchSteps {
    private AppiumDriver driver;
    private SearchScreen searchScreen;
    private ExploreScreen exploreScreen;

    public SearchSteps(AppiumDriver driver) {
        exploreScreen = new ExploreScreen(driver);
        searchScreen = new SearchScreen(driver);
        this.driver = driver;
    }


    public void goToSearchScreen() {
        exploreScreen.clickExploreTab();
        exploreScreen.clickSearchBar();
        assertTrue(searchScreen.isSearchScreenPresent(), "Search screen is not present");
    }
}
