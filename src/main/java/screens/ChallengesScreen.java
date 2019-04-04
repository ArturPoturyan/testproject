package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class ChallengesScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;

    public ChallengesScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);

    }


    //Buttons

    private By CHALLENGES_TAB = By.id(APP_PACKAGE_NAME + ":id/tab_challenge_id");
    private By CHALLENGE_DESCRIPTION = By.id(APP_PACKAGE_NAME + ":id/challenge_description");
    private By FRAGMENT_CHALLENGES_RECYCLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/fragment_challenges_recyclerView");
    private By CHALLENGE_NAME = By.id(APP_PACKAGE_NAME + ":id/challenge_name");
    private By PARTICIPATE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/participate_button");
    private By SUBMIT_BTN = By.id(APP_PACKAGE_NAME + ":id/btn_submit");
    private By PICSART_BUTTON_TEXT = By.id(APP_PACKAGE_NAME + ":id/picsart_button_text");
    private By POSITIVE_BTN = By.id(APP_PACKAGE_NAME + ":id/btn_positive");
    private By NEGATIVE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/btn_negative");
    private By SUBMITTED_TV = By.id(APP_PACKAGE_NAME + ":id/submitted_tv");
    private By LINER_LAYOUT = By.className("android.widget.LinearLayout");
    private By VIEW_GROUP = By.className("android.view.ViewGroup");
    private By CHALLENGE_VOTE = By.id(APP_PACKAGE_NAME + ":id/challenge_vote");
    private By IMAGE_BUTTON = By.className("android.widget.ImageButton");
    private By ACTION_LEADER_BOARD = By.id(APP_PACKAGE_NAME + ":id/action_leader_board");


    //Views
    private By VOTING_RECYCLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/voting_recycler_view");
    private By RECYCLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/recyclerView");
    private By ACTION_BAR_TAB = By.className("android.support.v7.app.ActionBar$Tab");
    private By TEXT_VIEW = By.className("android.widget.TextView");


    public void clickChallengesTab() {
        utils.clickById(CHALLENGES_TAB);
    }

    public void clickGlobalTab() {
        utils.clickByIndex(ACTION_BAR_TAB, 1);
    }

    public boolean isNetworkTabPresent() {
        return utils.isElementSelected(TEXT_VIEW, "Network");
    }

    public void clickLeaderBoardButton() {
        utils.clickById(ACTION_LEADER_BOARD);
    }

    public void clickFromVotingScreenBackButton() {
        utils.clickById(IMAGE_BUTTON);
    }

    public void clickBackArrowButton() {
        utils.clickById(IMAGE_BUTTON);
    }


    public void clickChallengeVoteButton() {
        utils.clickById(CHALLENGE_VOTE);
    }

    public boolean isVotedButtonPresent() {
        return utils.isElementByTextPresent(PICSART_BUTTON_TEXT, "VOTED");
    }

    public void horizontalSwipeFromCenterToLeftVotingScreen() {
        utils.horizontalSwipeFromCenterToLeft(RECYCLER_VIEW);
    }

    public void horizontalSwipeFromCenterToRightVotingScreen() {
        utils.horizontalSwipeFromCenterToRight(RECYCLER_VIEW);
    }


    public void clickVotingContest() {
        utils.clickElementOfListIndex(VOTING_RECYCLER_VIEW, VIEW_GROUP, 1);
    }

    public boolean isSubmittedChallengeButtonPresent() {
        return utils.isElementByTextPresent(SUBMITTED_TV, "Submitted");
    }

    public boolean isPhotographyChallengePresent() {
        return utils.isElementByTextPresent(CHALLENGE_DESCRIPTION, "Photography Challenge");

    }

    public boolean isShareToInstagramPopupPresent() {
        return utils.isElementPresent(POSITIVE_BTN);
    }

    public void clickStartVotingPhoto() {
        utils.clickElementOfListIndex(RECYCLER_VIEW, LINER_LAYOUT, 0);
    }

    public void clickSkipButton() {

        utils.clickById(NEGATIVE_BUTTON);
    }

    public void scrollToUp() {
        utils.scrollVerticalFromCenterToUp(FRAGMENT_CHALLENGES_RECYCLER_VIEW);
    }


    public void clickChallengeNameByText() {
        utils.clickElementByText(CHALLENGE_NAME, "Fishing");
    }

    public boolean isFishingChallengeNamePresent() {
        return utils.isElementByTextPresent(CHALLENGE_NAME, "Fishing");
    }

    public void clickParticipateButton() {
        utils.clickById(PARTICIPATE_BUTTON);
    }

    public void clickSubmitButton() {
        utils.clickById(SUBMIT_BTN);
    }

    public void clickSubmitToChallengeButton() {
        utils.clickById(PICSART_BUTTON_TEXT);
    }
}
