package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class SearchScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;

    public SearchScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);

    }


    //Buttons

    private By SUGGESTION_NAME = By.id(APP_PACKAGE_NAME + ":id/suggestion_name_txt");
    private By SEARCH_SRC_TEXT = By.id(APP_PACKAGE_NAME + ":id/search_src_text");
    private By SEARCH_CLOSE_BTN = By.id(APP_PACKAGE_NAME + ":id/search_close_btn");
    private By SWIPE_REFRESH = By.id(APP_PACKAGE_NAME + ":id/swipe_refresh");
    private By ZOOMABLE_ITEM = By.id(APP_PACKAGE_NAME + ":id/zoomable_item_id");
    private By IMAGE_DESCRIPTION = By.id(APP_PACKAGE_NAME + ":id/image_description_txt");
    private By IMAGE_BROWSER = By.id(APP_PACKAGE_NAME + ":id/image_browser_main_image");
    private By ACTION_BAR_TAB = By.className("android.support.v7.app.ActionBar$Tab");
    private By AVATAR = By.id(APP_PACKAGE_NAME + ":id/avatar");
    private By USERNAME = By.id(APP_PACKAGE_NAME + ":id/username");
    private By STICKER_BOOKMARK_BUTTON = By.id(APP_PACKAGE_NAME + ":id/sticker_bookmark_btn");
    private By IMAGE_BUTTON = By.className("android.widget.ImageButton");
    private By CLEAR_SEARCH_HISTORY_BUTTON = By.id(APP_PACKAGE_NAME + ":id/clear_history_txt");
    private By SEARCH_HISTORY_BUTTON1 = By.id("android:id/button1");


    //Views


    //    public boolean isFollowButtonPresentInArtistsTab() {
//        return utils.isElementPresent(BTN_FOLLOW);
//    }
    public boolean isClearSearchHistoryPopupPresent() {
        return utils.isElementPresent(SEARCH_HISTORY_BUTTON1);
    }

    public void clickYesButton() {
        utils.clickById(SEARCH_HISTORY_BUTTON1);
    }

    public void clickClearButton() {
        utils.clickById(CLEAR_SEARCH_HISTORY_BUTTON);
    }

    public boolean isClearSearchHistoryButtonPresent() {
        return utils.isElementPresent(CLEAR_SEARCH_HISTORY_BUTTON);
    }

    public void clickSearchHomeBackButton() {
        utils.clickById(IMAGE_BUTTON);
    }

    public boolean isStickerBookmarkButtonPresent() {
        return utils.isElementPresent(STICKER_BOOKMARK_BUTTON);
    }

    public void clickOnArtistsTab() {
        utils.clickByIndex(ACTION_BAR_TAB, 2);
    }

    public void clickOnImagesTab() {
        utils.clickByIndex(ACTION_BAR_TAB, 0);
    }

    public void clickUsernameInArtistsTab() {
        utils.clickByIndex(USERNAME, 0);
    }

    public void clickOnStickersTab() {
        utils.clickByIndex(ACTION_BAR_TAB, 1);
    }

    public boolean isStickersTabEnabled() {
        return utils.isElementSelectedByIndex(ACTION_BAR_TAB, 1);
    }

    public boolean isAvatarPresent() {
        return utils.isElementPresent(AVATAR);
    }


    public boolean isTagPresent() {

        String tag = "#freetoedit";
        return utils.getText(IMAGE_DESCRIPTION).contains(tag);
    }


    public void scrollToUpImageBrowser() {
        utils.scrollVerticalFromCenterToUp(IMAGE_BROWSER);
    }


    public void clickOnTag() {
        String tag = "#freetoedit";
        utils.clickElementByText(IMAGE_DESCRIPTION, tag);
    }


    public boolean isSearchScreenPresent() {
        return utils.isElementPresent(SEARCH_SRC_TEXT);
    }

    public void hidKeyboard() {
        utils.hideKeyboard();
    }

    public void scrollToUp() {
        utils.scrollVerticalFromCenterToUp(SWIPE_REFRESH);
    }

    public void clickImage() {
        utils.clickByIndex(ZOOMABLE_ITEM, 8);
    }

    public void typeTextToSearchField(String text) {
        utils.typeText(SEARCH_SRC_TEXT, text);
    }

    public String getSuggestionNameText() {
        return utils.getText(SUGGESTION_NAME);
    }

    public boolean isInSearchFiledXButtonPresent() {
        return utils.isElementPresent(SEARCH_CLOSE_BTN);

    }

    public void clickOnSuggestionsSticker() {
        utils.clickByIndex(ZOOMABLE_ITEM, 3);
    }


    public void clickItemFromSuggested() {
        utils.clickByIndex(SUGGESTION_NAME, 2);
    }
}
