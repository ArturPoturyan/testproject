package screens;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.CommonValues;
import utils.Utils;

public class MessagingScreen implements CommonValues {
    private AppiumDriver driver;
    private Utils utils;

    public MessagingScreen(AppiumDriver driver) {
        this.driver = driver;
        utils = new Utils(this.driver);

    }


    //Buttons

    private By ACTION_MESSAGES = By.id(APP_PACKAGE_NAME + ":id/action_messages");
    private By TITLE_BAR = By.id(APP_PACKAGE_NAME + ":id/titlte_bar");
    private By SEARCH_EDIT_TEXT = By.id(APP_PACKAGE_NAME + ":id/search_edit_text");
    private By MESSAGING_FOLLOWING_CHECKBOX = By.id(APP_PACKAGE_NAME + ":id/messaging_following_checkbox");
    private By MESSAGING_FOLLOWING_USERNAME = By.id(APP_PACKAGE_NAME + ":id/messaging_following_username");
    private By START_CONVERSATION_NEXT_BUTTON = By.id(APP_PACKAGE_NAME + ":id/start_conversation_next");
    private By ADD_FRIENDS_BTN = By.id(APP_PACKAGE_NAME + ":id/add_friends_btn");
    private By MESSAGE_EDIT_TEXT = By.id(APP_PACKAGE_NAME + ":id/message_edit_text");
    private By SEND_BTN = By.id(APP_PACKAGE_NAME + ":id/send_btn");
    private By MESSAGE_TEXT_VIEW = By.id(APP_PACKAGE_NAME + ":id/message_text_view");
    private By LAST_MESSAGE_TEXT = By.id(APP_PACKAGE_NAME + ":id/last_message_text");
    private By CHANNEL_NAME = By.id(APP_PACKAGE_NAME + ":id/channel_name");
    private By CHAT_BACK_BTN = By.id(APP_PACKAGE_NAME + ":id/chat_back_btn");
    private By ACTIVITY_CHAT_TITLE = By.id(APP_PACKAGE_NAME + ":id/activity_chat_title");
    private By STICKER_CHOOSE_BTN = By.id(APP_PACKAGE_NAME + ":id/btn_choose_sticker");
    private By ITEM_IMAGE = By.id(APP_PACKAGE_NAME + ":id/item_image");
    private By TITLES_LAYOUT = By.id(APP_PACKAGE_NAME + ":id/titles_layout");
    private By CHAT_CONFIG_DONE_BUTTON = By.id(APP_PACKAGE_NAME + ":id/chat_config_done_button");


    //Views
    private By PAGING_RECYLER_VIEW = By.id(APP_PACKAGE_NAME + ":id/paging_recycler_view_id");
    private By CONFIG_RENAME_EDIT_TEXT = By.id(APP_PACKAGE_NAME + ":id/config_rename_edit_text");
    private By CHAT_SYSTEM_NOT = By.id(APP_PACKAGE_NAME + ":id/chat_system_not");



    public void clickChatConfigDoneButton() {
        utils.clickById(CHAT_CONFIG_DONE_BUTTON);
    }


    public boolean isGroupRenamedTextPresent(String text) {
        return utils.getText(CHAT_SYSTEM_NOT).contains(text);
    }

    public void typeNewGrouptext(String text) {
        utils.typeText(CONFIG_RENAME_EDIT_TEXT, text);
    }

    public void clearGroupTextField() {
        utils.clearTextField(CONFIG_RENAME_EDIT_TEXT);
    }

    public boolean isConversationDetailsScreenPresent() {
        return utils.isElementPresent(CONFIG_RENAME_EDIT_TEXT);
    }

    public void clickStickerByIndex(int index) {
        utils.clickByIndex(ITEM_IMAGE, index);
    }

    public void clickStickerChooseButton() {
        utils.clickById(STICKER_CHOOSE_BTN);

    }



    public boolean isGroupConversationPresent() {
        return utils.getText(ACTIVITY_CHAT_TITLE).contains("Group");
    }

    public void clickGroupButton() {
        utils.clickById(TITLES_LAYOUT);
    }

    public boolean isMyLastTextPresent(String text) {
        return utils.getText(LAST_MESSAGE_TEXT).contains(text);//todo harcnel vorna chisht
//        return  utils.isElementByTextPresent(LAST_MESSAGE_TEXT,text);
    }

    public boolean isAddFriendsScreenPresent() {
        return utils.isElementByTextPresent(TITLE_BAR, "Add Friends");
    }

    public void clickAddFriendsButton() {
        utils.clickById(ADD_FRIENDS_BTN);
    }

    public void clickChatBackButton() {
        utils.clickById(CHAT_BACK_BTN);
    }

    public boolean isRemixChatUsernamePresent(String username) {
        return utils.getText(CHANNEL_NAME).contains(username);

    }

    public void clickChannelNameByText(String text) {
        utils.clickElementByText(CHANNEL_NAME, text);
    }

    public void clickOnPencilButton() {
        utils.clickById(ACTION_MESSAGES);
    }

    public boolean isMyMessagetextPresent() {
        return utils.getText(MESSAGE_TEXT_VIEW).contains("PicsArt");
    }

    public void clickOnSendButton() {
        utils.clickById(SEND_BTN);
    }

    public void typeTextInSaySomethingField(String text) throws InterruptedException {
        Thread.sleep(3000);
        utils.typeText(MESSAGE_EDIT_TEXT, text);

    }

    public boolean isSaySomethingTextPresent() {
        return utils.getText(MESSAGE_EDIT_TEXT).contains("Say something…");
    }

    public boolean isConversationScreenPresent() {
        return utils.isElementPresent(ADD_FRIENDS_BTN);
    }

    public void clickStartConversationNextButton() {
        utils.clickById(START_CONVERSATION_NEXT_BUTTON);
    }

    public boolean isInviteButtonPresent() {
        return utils.isElementPresent(START_CONVERSATION_NEXT_BUTTON);
    }


    public void clickCheckBox() {
        utils.clickById(MESSAGING_FOLLOWING_CHECKBOX);

    }

    public void verticalScrollToUpStartConversationScreen() {
        utils.scrollVerticalFromCenterToUp(PAGING_RECYLER_VIEW);
    }

    public void verticalScrollToUpRemixChatScreen() {
        utils.scrollVerticalFromCenterToUp(PAGING_RECYLER_VIEW);
    }

    public boolean isMessagingUsernamePresent(String username) {
        return utils.getText(MESSAGING_FOLLOWING_USERNAME).contains(username);
    }

    public boolean isMessagingTabPresent() {
        return utils.isElementPresent(ACTION_MESSAGES);
    }

    public boolean isStartConversationScreenPresent() {
        return utils.isElementByTextPresent(TITLE_BAR, "Send To");
    }

    public void typeUsernameInSearchField(String text) {
        utils.typeText(SEARCH_EDIT_TEXT, text);


    }
}
