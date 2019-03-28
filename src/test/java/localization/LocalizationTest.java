package localization;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import screens.*;
import steps.*;
import utils.AppiumServerStartSession;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class LocalizationTest extends AppiumServerStartSession {
    private EditorScreen editorScreen;
    private OnBoardingScreen onboardingScreen;
    private OnBoardingSteps onboardingSteps;
    private CreateFlowSteps createFlowSteps;
    private CreateFlowScreen createFlowScreen;
    private PhotoChooserScreen photoChooserScreen;
    private PhotoChooserSteps photoChooserSteps;
    private MyNetworkScreen myNetworkScreen;
    private ShareScreen shareScreen;
    private DiscoverScreen discoverScreen;
    private ProfileScreen profileScreen;
    private ExploreScreen exploreScreen;
    private ShopScreen shopScreen;
    private ShopSteps shopSteps;
    private SearchScreen searchScreen;
    private SearchSteps searchSteps;
    private NotificationScreen notificationScreen;
    private MessagingScreen messagingScreen;

    @BeforeClass
    public void setup() {
        editorScreen = new EditorScreen(driver);
        onboardingScreen = new OnBoardingScreen(driver);
        onboardingSteps = new OnBoardingSteps(driver);
        createFlowSteps = new CreateFlowSteps(driver);
        createFlowScreen = new CreateFlowScreen(driver);
        photoChooserScreen = new PhotoChooserScreen(driver);
        photoChooserSteps = new PhotoChooserSteps(driver);
        myNetworkScreen = new MyNetworkScreen(driver);
        discoverScreen = new DiscoverScreen(driver);
        profileScreen = new ProfileScreen(driver);
        exploreScreen = new ExploreScreen(driver);
        shareScreen = new ShareScreen(driver);
        shopScreen = new ShopScreen(driver);
        shopSteps = new ShopSteps(driver);
        searchScreen = new SearchScreen(driver);
        searchSteps = new SearchSteps(driver);
        notificationScreen = new NotificationScreen(driver);
        messagingScreen = new MessagingScreen(driver);

//        if (onboardingScreen.isSignInButtonPresent()) {
//            onboardingSteps.signIn();
//        }
    }

    // Verify the functionality of following artists on Discover artists page
    @Test
    public void step_1_verifyFunctionalityOfFollowingArtistsOnDiscoverPage() {
        profileScreen.clickProfileTab();
        assertTrue(profileScreen.isUserAvatarPresent(), "Profile tab is not open");
        profileScreen.clickProfileMoreButton();
        profileScreen.clickDiscoverArtistsButton();
        assertTrue(discoverScreen.isDiscoverArtistsScreenPresent(), "Discover Artists screen is not present");
        discoverScreen.verticalScrollToUpDiscoverArtistsScreen();
        for (int i = 0; i < 2; i++) {
            discoverScreen.clickFollowButtonByIndex(i);
            assertTrue(discoverScreen.isFollowingButtonTextPresent(i), "FOllOWING TEXT is not present");
            discoverScreen.clickFollowButtonByIndex(i);
        }
    }

    @Test
    //Editor Share flow
    public void step_2_verifyFunctionalityEditorShareFlow_part_1() {
        exploreScreen.clickFubButton(); //todo harcnel vor stepic karanq gren miangamic gna editor bayc test case um sax steper@ assert a uzum
        createFlowSteps.accessPhotoPermission();
        createFlowScreen.clickAllPhotoButton();
        assertTrue(photoChooserScreen.isPhotoChooserImageListPresent(), "Photo chooser is not present on the screen");
        photoChooserScreen.clickOnPhoto();
        photoChooserSteps.skipChooseImageSize();
        shopSteps.skipGoldOfferScreen();
        shopSteps.skipGoldPopup();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        int repeat = 5;
        while (!editorScreen.isEffectsButtonPresent() && repeat > 0) {
            editorScreen.swipeEditorPanelToLeft();
            repeat--;
        }
        editorScreen.clickEffectsButton();
        editorScreen.chooseMagicCategoryByName();
        editorScreen.clickApplyDoneButton();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
    }

    //Editor Share flow
    @Test
    public void step_2_verifyFunctionalityEditorShareFlow_part_2() {
        exploreScreen.clickFubButton();
        createFlowSteps.accessPhotoPermission();
        createFlowScreen.clickAllPhotoButton();
        assertTrue(photoChooserScreen.isPhotoChooserImageListPresent(), "Photo chooser is not present on the screen");
        photoChooserScreen.clickOnPhoto();
        photoChooserSteps.skipChooseImageSize();
        shopSteps.skipGoldPopup();
        shopSteps.skipGoldOfferScreen();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        int repeat = 5;
        while (!editorScreen.isDrawButtonPresent() && repeat > 0) {
            editorScreen.swipeEditorPanelToLeft();
            repeat--;
        }
        editorScreen.clickDrawButton();
        editorScreen.clickPicsArtDrawingButton();
        editorScreen.clickAddPhotoButton();
        editorScreen.clickDrawingAddPhotoButton();
        photoChooserScreen.clickOnPhoto();
        shareScreen.clickButtonDone();
        editorScreen.clickButtonActionDone();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
    }
    //Editor Share flow

    @Test
    public void step_2_verifyFunctionalityEditorShareFlow_part_3() {
        exploreScreen.clickFubButton();
        createFlowSteps.accessPhotoPermission();
        createFlowScreen.clickAllPhotoButton();
        assertTrue(photoChooserScreen.isPhotoChooserImageListPresent(), "Photo chooser is not present on the screen");
        photoChooserScreen.clickOnPhoto();
        photoChooserSteps.skipChooseImageSize();
        shopSteps.skipGoldPopup();
        shopSteps.skipGoldOfferScreen();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        int repeat = 5;

        while (!editorScreen.isStickerButtonPresent() && repeat > 0) {
            editorScreen.swipeEditorPanelToRight();
            repeat--;
        }
        editorScreen.clickStickerButton();
        editorScreen.clickOnStickerInEditor();
        shareScreen.clickButtonDone();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        int againSwipe = 5;
        while (!editorScreen.isShopButtonPresent() && againSwipe > 0) {
            editorScreen.swipeEditorPanelToRight();
            againSwipe--;
        }
        editorScreen.clickShopButton();
        assertTrue(shopScreen.isSubscriptionOfferScreenPresent(), "Offer screen is not present");
        shopScreen.clickXButtonInOfferScreen();
        shopSteps.skipContactUsScreen();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");

    }
    //Editor Share flow

    @Test
    public void step_2_verifyFunctionalityEditorShareFlow_part_4() {
        exploreScreen.clickFubButton();
        createFlowSteps.accessPhotoPermission();
        createFlowScreen.clickAllPhotoButton();
        assertTrue(photoChooserScreen.isPhotoChooserImageListPresent(), "Photo chooser is not present on the screen");
        photoChooserScreen.clickOnPhoto();
        photoChooserSteps.skipChooseImageSize();
        shopSteps.skipGoldPopup();
        shopSteps.skipGoldOfferScreen();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        editorScreen.clickEditorNextButton();
        assertTrue(shareScreen.isUploadShareButtonPresent(), "Share screen is not present");
        shareScreen.clickUploadShareButton();
        shareScreen.clickButtonDone();
        profileScreen.clickProfileTab();
        assertTrue(profileScreen.isUserAvatarPresent(), "Profile page is not open");
        profileScreen.clickProfileImage();
        myNetworkScreen.clickMoreButtonInImageBrowser();
        assertTrue(myNetworkScreen.isImageSettingsPresent(), "image settings is not present");
        myNetworkScreen.clickEditButton();
        String typedText = "#football";
        //karam clear anem ete petqa nor type anem bayc sencela ashxatum
        shareScreen.typeTextToTagField(typedText);
        shareScreen.clickNextButton();
        assertTrue(myNetworkScreen.getDescriptionText().contains(typedText), "#football tag is not updated");


    }


    //Verify search functionality of search
    @Test
    public void step_3_verifyFunctionalityOfSearch_part_1() {//todo not run
        searchSteps.goToSearchScreen();
        searchScreen.clickOnImagesTab();
        String typedText = "cr7";
        searchScreen.typeTextToSearchField(typedText);
        assertTrue(searchScreen.isXButtonPresentInSearchField(), "X button is not present in search field");
        assertTrue(searchScreen.getSuggestionNameText().contains(typedText), "the result of search keyword is not correspond");

        searchScreen.clickSuggestionName();
        searchScreen.verticalScrollToUpSearchScreen();
        searchScreen.clickImage();
        assertTrue(exploreScreen.isGalleryCommentButtonPresent(), "An image is not opened in photo browser");
        while (!searchScreen.isTagPresent()) {
            searchScreen.verticalScrollToUpImageBrowser();
        }
        searchScreen.clickOnTag();//todo im uzac tag@ chem karum click anem
        assertTrue(exploreScreen.isActionableFollowButtonPresent(), "the tag screen is not opened");
        exploreScreen.clickBackButtonInHashtagScreen();
        exploreScreen.clickBackButtonInImageBrowser();
        assertTrue(searchScreen.isSearchScreenPresent(), "Search screen is not present");
        //assertTrue if keyboard is opened
//        searchScreen.hidKeyboard();
    }

    //Verify search functionality of search
    @Test
    public void step_3_verifyFunctionalityOfSearch_part_2() {
        searchSteps.goToSearchScreen();
        searchScreen.clickOnArtistsTab();
        assertTrue(searchScreen.isAvatarPresent(), "Artists tab is not present");
        searchScreen.clickUsernameInArtistsTab();
        assertTrue(profileScreen.isUserAvatarPresent(), " User profile page is not opened");
        profileScreen.clickProfileBackButton();
        assertTrue(searchScreen.isSearchScreenPresent(), "Search screen is not present");
    }
    //Verify search functionality of search

    @Test
    public void step_3_verifyFunctionalityOfSearch_part_3() {
        searchSteps.goToSearchScreen();
        searchScreen.clickOnStickersTab();
        assertTrue(searchScreen.isStickersTabEnabled(), "Stickers tab is not opened");
        searchScreen.clickSuggestionName();
        searchScreen.clickOnSuggestionsSticker();
        assertTrue(searchScreen.isStickerBookmarkButtonPresent(), "sticker is not opened");
        exploreScreen.clickBackButtonInImageBrowser();
        searchScreen.clickSearchHomeBackButton();
        assertTrue(searchScreen.isSearchScreenPresent(), "Search screen is not present");
        searchScreen.clickClearButton();
        assertTrue(searchScreen.isClearSearchHistoryPopupPresent(), "search activity log screen is not present");
        searchScreen.clickYesButton();
        assertFalse(searchScreen.isClearSearchHistoryButtonPresent(), "clear button present");

    }


    //Explore: social navigations
    @Test
    public void step_4_verifyFunctionalityOfExploreSocialNavigation() {//todo not run
        myNetworkScreen.clickMyNetworkButton();
        myNetworkScreen.verticalScrollToUpMyNetworkScreen();
        int repeat = 10;
        while (!myNetworkScreen.isZoomableItemPresent() && repeat > 0) {
            myNetworkScreen.verticalScrollToUpMyNetworkScreen();
            repeat--;
        }
        myNetworkScreen.clickImageByIndexMyNetworkTab();
        myNetworkScreen.swipeImageHorizontalCenterToLeft();
        int again = 3;
        while (!myNetworkScreen.isLikeButtonPresent() && again > 0) {
            myNetworkScreen.scrollToUpImageBrowser();
            again--;
        }
        myNetworkScreen.clickLikeButton();//todo like button click a anum taki screen i like@

        int repeatScroll = 2;
        while (!myNetworkScreen.isImageBorwserMoreButtonPresent() && repeatScroll > 0) {
            myNetworkScreen.scrollToDownImageBrowser();
            repeatScroll--;
        }
        myNetworkScreen.clickMoreButtonInImageBrowser();
        myNetworkScreen.clickRepostButtonInMoreMenu();
        myNetworkScreen.clickCommentButton();
        myNetworkScreen.typeCommentText(); //todo send chem anum qez harcnem nor
        myNetworkScreen.clickBackButtonInCommentActivity();

    }


    //Social navigation 2

    @Test
    public void step_5_verifyFunctionalityOfSocialNavigation2() {
        myNetworkScreen.clickMyNetworkButton();
        int repeat = 10;
        while (!myNetworkScreen.isZoomableItemPresent() && repeat > 0) {
            myNetworkScreen.verticalScrollToUpMyNetworkScreen();
            repeat--;
        }
        myNetworkScreen.clickImageByIndexMyNetworkTab();
        for (int i = 0; i < 2; i++) {
            myNetworkScreen.clickLikeButton();//todo chi linum like i vra sxmel
            myNetworkScreen.swipeImageHorizontalCenterToLeft();
        }
        myNetworkScreen.clickMoreButtonInImageBrowser();
        myNetworkScreen.clickRepostButtonInMoreMenu();
        myNetworkScreen.clickCommentButton();
        myNetworkScreen.clickRepostTab();
        assertTrue(myNetworkScreen.isRepostButtonPresent(), "Repost button is not present");
        myNetworkScreen.clickRepostButton();
        assertTrue(myNetworkScreen.isRepostedButtonPresent(), "Reposted button is not present");
        myNetworkScreen.clickRepostButton();
    }

    //Verify the functionality of messaging
    @Test
    public void step_6_verifyFunctionalityOfMessaging_part_1() throws InterruptedException {
        notificationScreen.clickNotificationButton();//todo sranq krkvnumen es uzumem messging steps pahem bayc assert ner@ menak test um petqa grem
        assertTrue(notificationScreen.isNotificationScreenPresent(), "Notification tab is not present");
        notificationScreen.clickOnRemixChatTab();
        assertTrue(messagingScreen.isMessagingTabPresent(), "Messaging tab is not present");
        messagingScreen.clickOnPencilButton();
        assertTrue(photoChooserScreen.isPhotoChooserImageListPresent(), "Photo chooser is not present");
        photoChooserScreen.clickOnPhoto();
        editorScreen.clickEditorNextButton();
        assertTrue(messagingScreen.isStartConversationScreenPresent(), "Start conversation screen is not present");
        messagingScreen.typeUsernameInSearchField("kakao30");
        int repeat = 5;
        while (!messagingScreen.isMessagingUsernamePresent("@kakao30") && repeat > 0) {
            messagingScreen.verticalScrollToUpStartConversationScreen();
            repeat--;
        }
        messagingScreen.clickCheckBox();
        messagingScreen.clickStartConversationNextButton();
        assertTrue(messagingScreen.isConversationScreenPresent(), "Conversation screen is not present");
        messagingScreen.typeTextInSaySomethingField("PicsArt");
        assertFalse(messagingScreen.isSaySomethingTextPresent(), "Say something replaced by the text correctly");
        messagingScreen.clickOnSendButton();
        messagingScreen.clickChatBackButton();
        assertTrue(messagingScreen.isRemixChatUsernamePresent("kakao30"), "kakao30 is nit peresent in remix chat");
        assertTrue(messagingScreen.isMyLastTextPresent("You: PicsArt"), "My last text is not present");

    }

    //Verify the functionality of messaging
    @Test(dependsOnMethods = "step_6_verifyFunctionalityOfMessaging_part_1")
    public void step_6_verifyFunctionalityOfMessaging_part_2() throws InterruptedException { //todo sleep em drem miqich usha send linum vor het last stugem
        notificationScreen.clickNotificationButton();
        assertTrue(notificationScreen.isNotificationScreenPresent(), "Notification tab is not present");
        notificationScreen.clickOnRemixChatTab();
        int repeat = 5;
        while (!messagingScreen.isRemixChatUsernamePresent("kakao30") && repeat > 0) {
            messagingScreen.verticalScrollToUpRemixChatScreen();
            repeat--;
        }
        messagingScreen.clickChannelNameByText("kakao30");
        messagingScreen.typeTextInSaySomethingField("Artur");
        messagingScreen.clickOnSendButton();
        messagingScreen.clickChatBackButton();
        assertTrue(messagingScreen.isMyLastTextPresent("You: Artur"), "My last text is not present");
        messagingScreen.clickChannelNameByText("kakao30");
        messagingScreen.clickAddFriendsButton();
        assertTrue(messagingScreen.isAddFriendsScreenPresent(), "Add friends screen is not present");
        messagingScreen.clickCheckBox();
        assertTrue(messagingScreen.isInviteButtonPresent(), "Invite friends button arrow is not present");
        messagingScreen.clickStartConversationNextButton();
        assertTrue(messagingScreen.isGroupConversationPresent(), "Group conversation screen is not present");
    }

    //Verify the functionality of messaging
    @Test(dependsOnMethods = "step_6_verifyFunctionalityOfMessaging_part_1")
    public void step_6_verifyFunctionalityOfMessaging_part_3() {
        notificationScreen.clickNotificationButton();
        assertTrue(notificationScreen.isNotificationScreenPresent(), "Notification tab is not present");
        notificationScreen.clickOnRemixChatTab();
        int repeat = 5;
        while (!messagingScreen.isRemixChatUsernamePresent("kakao30") && repeat > 0) {
            messagingScreen.verticalScrollToUpRemixChatScreen();
            repeat--;
        }
        messagingScreen.clickChannelNameByText("kakao30");
        messagingScreen.clickStickerChooseButton();
        assertTrue(editorScreen.isStickerCategoryListPresent(), "Stickers category list is not present");
        editorScreen.clickStickerCategoryByIndex(); //todo sticker category chem karum list i mejic im uzac@ sxmem
        messagingScreen.clickStickerByIndex(2);
        //assert verify sticker sent
        messagingScreen.clickAddFriendsButton();
        messagingScreen.typeUsernameInSearchField("kakao90");
        int again = 5;
        while (!messagingScreen.isMessagingUsernamePresent("@kakao90") && again > 0) {
            messagingScreen.verticalScrollToUpStartConversationScreen();
            again--;
        }
        messagingScreen.clickCheckBox();
        messagingScreen.clickStartConversationNextButton();
        messagingScreen.clickGroupButton();
        assertTrue(messagingScreen.isConversationDetailsScreenPresent(), "Conversation details screen is not present");
        messagingScreen.clearGroupTextField();
        messagingScreen.typeNewGrouptext("axpernerov");
        messagingScreen.clickChatConfigDoneButton();
        assertTrue(messagingScreen.isGroupRenamedTextPresent("axpernerov"), "Group renamed text is not match");
    }


    //Remixes
    @Test
    public void step_7_verifyRemixFunctionality() {
        exploreScreen.clickExploreTab();
        exploreScreen.clickImageByIndexExploreTab();
        int repeat = 20;
        while (!exploreScreen.isRemixButtonPresent() && repeat > 0) {
            exploreScreen.swipeExploreImageToLeft();
            repeat--;
        }
        int scrollAgain = 5;
        while (!exploreScreen.isSimilarTitlePresent() && scrollAgain > 0) {
            exploreScreen.scrollToUpImageBrowser();
            scrollAgain--;
        }
        while (!exploreScreen.isRemixButtonPresent() && repeat > 0) {
            exploreScreen.scrollToDownImageBrowser();
            repeat--;
        }
        exploreScreen.clickRemixButton();
        photoChooserSteps.skipChooseImageSize();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        int repeatAgain = 5;
        while (!editorScreen.isStickerButtonPresent() && repeatAgain > 0) {
            editorScreen.swipeEditorPanelToRight();
            repeatAgain--;
        }
        editorScreen.clickStickerButton();
        editorScreen.clickOnStickerInEditor();
        editorScreen.clickStickerApplyButton();
        editorScreen.clickEditorNextButton();
        assertTrue(shareScreen.isUploadShareButtonPresent(), "Upload share button is not present ");
        shareScreen.clickSaveButton();
        shareScreen.clickByIndexOnUploadPrivatelyButton();
        shareScreen.clickButtonDone();
        //assert stugi private share exela te che


    }


    //Verify  functionality of Camera

    @Test
    public void verifyFunctionalityOfCamera() {

        exploreScreen.clickFubButton();
        int repeat = 4;
        while (!createFlowScreen.isCameraButtonPresent() && repeat > 0) {
            createFlowScreen.scrollVerticalCreateFLowScreen();
            repeat--;
        }
        createFlowScreen.clickCameraButton();
    }
}