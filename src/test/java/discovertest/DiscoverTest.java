package discovertest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.DiscoverScreen;
import screens.OnBoardingScreen;
import screens.ProfileScreen;
import steps.OnBoardingSteps;
import utils.AppiumServerStartSession;

import static org.testng.Assert.assertTrue;


public class DiscoverTest extends AppiumServerStartSession {
    private OnBoardingSteps onboardingSteps;
    private DiscoverScreen discoverScreen;
    private ProfileScreen profileScreen;
    private OnBoardingScreen onBoardingScreen;


    @BeforeClass
    public void setup() {
        onboardingSteps = new OnBoardingSteps(driver);
        discoverScreen = new DiscoverScreen(driver);
        profileScreen = new ProfileScreen(driver);
        onBoardingScreen = new OnBoardingScreen(driver);
        if (onBoardingScreen.isSignInButtonPresent()) {
            onboardingSteps.signIn();
        }
    }


    // Verify the functionality of following artists on Discover artists page
    @Test
    public void verifyFunctionalityOfFollowingArtistsOnDiscoverPage() {
        profileScreen.clickProfileTab();
        assertTrue(profileScreen.isProfileMoreButtonPresent(), "Profile tab is not open");
        profileScreen.clickProfileMoreButton();
        profileScreen.clickDiscoverArtistsButton();
        assertTrue(discoverScreen.isDiscoverArtistsPresent(), "Discover Artists title is not present on the discover screen");
        discoverScreen.clickFollowButton();
    }

}
