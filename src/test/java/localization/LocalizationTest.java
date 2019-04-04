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
    private CameraSteps cameraSteps;
    private CameraScreen cameraScreen;
    private ChallengesScreen challengesScreen;
    private ChallengesSteps challengesSteps;
    private EditorSteps editorSteps;

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
        cameraSteps = new CameraSteps(driver);
        cameraScreen = new CameraScreen(driver);
        challengesScreen = new ChallengesScreen(driver);
        challengesSteps = new ChallengesSteps(driver);
        editorSteps = new EditorSteps(driver);

        if (onboardingScreen.isSignInButtonPresent()) {
            onboardingSteps.signIn();
            createFlowSteps.clickFromCreateFlowScreenXbutton();
        }
    }

    // Verify the functionality of following artists on Discover artists page
    @Test
    public void step_1_verifyFunctionalityOfFollowingArtistsOnDiscoverPage() {
        profileScreen.clickProfileTab();
        assertTrue(profileScreen.isUserAvatarPresent(), "Profile tab is not open");
        profileScreen.clickProfileMoreButton();
        profileScreen.clickDiscoverArtistsButton();
        assertTrue(discoverScreen.isDiscoverArtistsScreenPresent(), "Discover Artists screen is not present");
        discoverScreen.verticalScrollToUp();
        for (int i = 0; i < 2; i++) {
            discoverScreen.clickFollowButtonByIndex(i);
            assertTrue(discoverScreen.isFollowingButtonTextPresent(i), "FOllOWING TEXT is not present");
            discoverScreen.clickFollowButtonByIndex(i);
        }
    }

    @Test
    //Editor Share flow
    public void step_2_verifyFunctionalityEditorShareFlow_part_1() {
        exploreScreen.clickFubButton();
        createFlowScreen.clickAllPhotoButton();
        assertTrue(photoChooserScreen.isPhotoChooserPresent(), "Photo chooser is not present on the screen");//todo rename poxaca
        photoChooserScreen.clickOnPhoto();
        photoChooserSteps.skipChooseImageSize();
        shopSteps.skipSubscriptionPopup();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        editorScreen.swipeTillItemAppear(editorScreen.EFFECTS_BUTTON, editorScreen.EDITOR_BOTTOM_PANEL, 5);
        editorScreen.clickEffectsButton();
        editorScreen.chooseMagicCategoryByName();
        editorScreen.clickApplyDoneButton();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
    }

    //Editor Share flow
    @Test
    public void step_2_verifyFunctionalityEditorShareFlow_part_2() {
        editorSteps.goToEditorScreenFromRecentImage();
        editorScreen.swipeTillItemAppear(editorScreen.DRAW_BUTTON, editorScreen.EDITOR_BOTTOM_PANEL, 5);
        editorScreen.clickDrawButton();
        editorScreen.clickPicsArtDrawingButton();
        editorScreen.clickAddPhotoButton();
        editorScreen.clickDrawingAddPhotoButton();
        photoChooserScreen.clickOnPhoto();
        shareScreen.clickDoneButton();
        editorScreen.clickButtonActionDone();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
    }
    //Editor Share flow

    @Test
    public void step_2_verifyFunctionalityEditorShareFlow_part_3() {
        editorSteps.goToEditorScreenFromRecentImage();
        editorScreen.swipeTillItemAppear(editorScreen.BUTTON_STICKER, editorScreen.EDITOR_BOTTOM_PANEL, 5);
        editorScreen.clickStickerButton();
        editorScreen.clickLoveCategoryButton();
        editorScreen.clickOnStickerItem();
        shareScreen.clickDoneButton();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        editorScreen.swipeTillItemAppear(editorScreen.SHOP_BUTTON, editorScreen.EDITOR_BOTTOM_PANEL, 5);
        editorScreen.clickShopButton();
        assertTrue(shopScreen.isSubscriptionOfferScreenPresent(), "Offer screen is not present");
        shopScreen.clickOfferScreenXButton();
        shopSteps.skipContactUsScreen();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");

    }
    //Editor Share flow

    @Test
    public void step_2_verifyFunctionalityEditorShareFlow_part_4() {
        editorSteps.goToEditorScreenFromRecentImage();
        editorScreen.clickEditorNextButton();
        assertTrue(shareScreen.isUploadShareButtonPresent(), "Share screen is not present");
        shareScreen.clickUploadShareButton();
        shareScreen.clickDoneButton();
        profileScreen.clickProfileTab();
        assertTrue(profileScreen.isUserAvatarPresent(), "Profile page is not open");
        profileScreen.clickProfileImageButton();
        myNetworkScreen.clickImageBrowserMoreButton();
        assertTrue(myNetworkScreen.isImageSettingsPresent(), "image settings is not present");
        myNetworkScreen.clickEditButton();
        String typedText = "#football";
        //karam clear anem ete petqa nor type anem bayc sencela ashxatum
        shareScreen.typeTextInTagField(typedText);
        shareScreen.clickNextButton();
        String descriptionText = myNetworkScreen.getDescriptionText();
        assertTrue(descriptionText.contains(typedText), "#football tag is not updated");


    }


    //Verify search functionality of search
    @Test
    public void step_3_verifyFunctionalityOfSearch_part_1() {//todo not run
        searchSteps.goToSearch();
        searchScreen.clickOnImagesTab();
        String typedText = "cr7";
        searchScreen.typeTextToSearchField(typedText);
        assertTrue(searchScreen.isInSearchFiledXButtonPresent(), "X button is not present in search field");//todo rename
        String descriptionText = searchScreen.getSuggestionNameText();
        assertTrue(descriptionText.contains(typedText), "the result of search keyword is not correspond");//todo arandznacnel
        searchScreen.clickItemFromSuggested();
        searchScreen.scrollToUp();
        searchScreen.clickImage();
        assertTrue(exploreScreen.isGalleryCommentButtonPresent(), "An image is not opened in photo browser");
        int repeat = 5;
        while (!searchScreen.isTagPresent() && repeat > 0) {
            searchScreen.scrollToUpImageBrowser();//todo repeat (done)
            repeat--;
        }
        searchScreen.clickOnTag();//todo im uzac tag@ chem karum click anem
        assertTrue(exploreScreen.isActionBarFromHashtagPresent(), "the tag screen is not opened");//todo poxel (done)
        exploreScreen.clickOnHashtagScreenBackButton();
        exploreScreen.clickInImageBrowserBackButton();
        assertTrue(searchScreen.isSearchScreenPresent(), "Search screen is not present");
    }


    //Verify search functionality of search
    @Test
    public void step_3_verifyFunctionalityOfSearch_part_2() {
        searchSteps.goToSearch();
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
        searchSteps.goToSearch();
        searchScreen.clickOnStickersTab();
        assertTrue(searchScreen.isStickersTabEnabled(), "Stickers tab is not opened");
        searchScreen.clickItemFromSuggested(); //todo rename (done)
        searchScreen.clickOnSuggestionsSticker();
        assertTrue(searchScreen.isStickerBookmarkButtonPresent(), "sticker is not opened");
        exploreScreen.clickInImageBrowserBackButton();
        searchScreen.clickSearchHomeBackButton();
        assertTrue(searchScreen.isSearchScreenPresent(), "Search screen is not present");
        searchScreen.clickClearButton();
        assertTrue(searchScreen.isClearSearchHistoryPopupPresent(), "search activity log screen is not present");
        searchScreen.clickYesButton();
        assertFalse(searchScreen.isClearSearchHistoryButtonPresent(), "clear button present");

    }


    //Explore: social navigations
    @Test
    public void step_4_verifyFunctionalityOfExploreSocialNavigation() {//todo not run (runned poxeci sax explore screen)
        exploreScreen.clickExploreTab();
        int repeat = 10;
        while (!exploreScreen.isZoomableItemPresent() && repeat > 0) {
            exploreScreen.scrollToUp();
            repeat--;
        }
        exploreScreen.clickImageFromExploreTab();//todo rename (done)
        exploreScreen.swipeImageToLeft();
        repeat = 5;//todo poxel repeat (done)
        while (!exploreScreen.isLikeButtonPresent() && repeat > 0) {
            exploreScreen.scrollToUpImageBrowser();
            repeat--;
        }
        exploreScreen.clickLikeButton();
        repeat = 2;
        while (!exploreScreen.isImageBorwserMoreButtonPresent() && repeat > 0) {
            exploreScreen.scrollToDownImageBrowser();
            repeat--;
        }
        exploreScreen.clickImageBrowserMoreButton();
        exploreScreen.clickFromMoreMenuRepostButton();
        exploreScreen.clickCommentButton();
        exploreScreen.typeCommentText();
        exploreScreen.clickFromActivityBackButton();
    }


    //todo stegich sharunakel
    //Social navigation 2

    @Test
    public void step_5_verifyFunctionalityOfSocialNavigation2() {
        exploreScreen.clickExploreTab();
        int repeat = 10;
        while (!exploreScreen.isZoomableItemPresent() && repeat > 0) {
            exploreScreen.scrollToUp();
            repeat--;
        }
        exploreScreen.clickImageFromExploreTab();
        for (int i = 0; i < 2; i++) {
            exploreScreen.clickLikeButton();//todo chi linum like i vra sxmel (explore em eli poxel)
            exploreScreen.swipeImageToLeft();
        }
        exploreScreen.clickImageBrowserMoreButton();
        exploreScreen.clickFromMoreMenuRepostButton();
        exploreScreen.clickCommentButton();
        exploreScreen.clickActivityTabBarByIndex(2);
        assertTrue(exploreScreen.isRepostedButtonPresent(), "Reposted button is not present");
        exploreScreen.clickRepostButton();
        assertTrue(exploreScreen.isRepostButtonPresent(), "Repost button is not present");
        exploreScreen.clickActivityTabBarByIndex(1);


    }

    //Verify the functionality of messaging
    @Test
    public void step_6_verifyFunctionalityOfMessaging_part_1() throws InterruptedException {
        notificationScreen.clickNotificationButton();//todo sranq krkvnumen es uzumem messging steps pahem bayc assert ner@ menak test um petqa grem
        assertTrue(notificationScreen.isNotificationScreenPresent(), "Notification tab is not present");
        notificationScreen.clickOnRemixChatTab();
        assertTrue(messagingScreen.isMessagingTabPresent(), "Messaging tab is not present");
        messagingScreen.clickOnPencilButton();
        assertTrue(photoChooserScreen.isPhotoChooserPresent(), "Photo chooser is not present");
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
    public void step_6_verifyFunctionalityOfMessaging_part_2() throws InterruptedException { //todo sleep em drem miqich usha send linum vor heto last stugem
        notificationScreen.clickNotificationButton();
        assertTrue(notificationScreen.isNotificationScreenPresent(), "Notification tab is not present");
        notificationScreen.clickOnRemixChatTab();
        int repeat = 5;
        while (!messagingScreen.isRemixChatUsernamePresent("kakao30") && repeat > 0) {
            messagingScreen.scrollToUp();
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
            messagingScreen.scrollToUp();
            repeat--;
        }
        messagingScreen.clickChannelNameByText("kakao30");
        messagingScreen.clickStickerChooseButton();
        assertTrue(messagingScreen.isStickerCategoryItemPresent(), "Stickers category item is not present");
        messagingScreen.clickStickerCategory();//todo poxel category icon ov (done)
        messagingScreen.clickStickerByIndex(2);
        //assert verify sticker sent
        messagingScreen.clickAddFriendsButton();
        messagingScreen.typeUsernameInSearchField("kakao90");
        repeat = 5;
        while (!messagingScreen.isMessagingUsernamePresent("@kakao90") && repeat > 0) {
            messagingScreen.verticalScrollToUpStartConversationScreen();
            repeat--;
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
        exploreScreen.clickImageFromExploreTab();
        int repeat = 20;
        while (!exploreScreen.isRemixButtonPresent() && repeat > 0) {
            exploreScreen.swipeExploreImageToLeft();
            repeat--;
        }
        repeat = 5;
        while (!exploreScreen.isSimilarTitlePresent() && repeat > 0) {
            exploreScreen.scrollToUpImageBrowser();
            repeat--;
        }
        repeat = 5;
        while (!exploreScreen.isRemixButtonPresent() && repeat > 0) {
            exploreScreen.scrollToDownImageBrowser();
            repeat--;
        }
        exploreScreen.clickRemixButton();
        photoChooserSteps.skipChooseImageSize();
        assertTrue(editorScreen.isEditorScreenPresent(), "Editor screen is not present");
        repeat = 5;
        while (!editorScreen.isStickerButtonPresent() && repeat > 0) {
            editorScreen.swipeEditorPanelToRight();
            repeat--;
        }
        editorScreen.clickStickerButton();
        editorScreen.clickDiscoverCategoryButton();
        editorScreen.clickOnStickerItem();
        editorScreen.clickStickerApplyButton();
        editorScreen.clickEditorNextButton();
        assertTrue(shareScreen.isUploadShareButtonPresent(), "Upload share button is not present ");
        shareScreen.clickSaveButton();
        shareScreen.clickByIndexOnUploadPrivatelyButton();
        shareScreen.clickDoneButton();
        //assert stugi private share exela te che


    }


    //Verify  functionality of Camera

    @Test
    public void verifyFunctionalityOfCamera() {
        cameraSteps.goToCameraFromCreateFlow();//todo camera screen ic vochmi button click chi anum
//        cameraSteps.accessCameraPermission();
//        cameraScreen.clickFilterByIndex();

//        cameraScreen.swap();

    }

    //Challenges
    @Test
    public void verifyChallengesFunctionality() {
        challengesScreen.clickChallengesTab();
        int repeat = 10;
        while (!challengesScreen.isPhotographyChallengePresent() && repeat > 0) {
            challengesScreen.scrollToUp();
            repeat--;
        }
        repeat = 10;
        while (!challengesScreen.isFishingChallengeNamePresent() && repeat > 0) {
            challengesScreen.scrollToUp();
            repeat--;
        }
        challengesScreen.clickChallengeNameByText();
        challengesScreen.clickParticipateButton();
        photoChooserScreen.clickOnPhoto();
        challengesScreen.clickSubmitButton();
        challengesScreen.clickSubmitToChallengeButton();
        assertTrue(challengesScreen.isSubmittedChallengeButtonPresent(), "Submitted text is not present");
        challengesSteps.skipShareToInstagramPopup();
        challengesScreen.clickVotingContest();
        challengesScreen.clickStartVotingPhoto();
        for (int i = 0; i < 4; i++) {
            challengesScreen.clickChallengeVoteButton();
            challengesScreen.horizontalSwipeFromCenterToRightVotingScreen();
            assertTrue(challengesScreen.isVotedButtonPresent(), "Voted button is not present ");
            challengesScreen.horizontalSwipeFromCenterToLeftVotingScreen();
            //step 6 anhaskanalia :D
        }
        challengesScreen.clickFromVotingScreenBackButton();
        challengesScreen.clickBackArrowButton();
        challengesScreen.clickLeaderBoardButton();
        challengesScreen.clickGlobalTab();
//        assertTrue(challengesScreen.isNetworkTabPresent(),"not sleected");//todo chi linum stugel tab@ selected kam enabled da urish dzev chem kara stugem taber
        challengesScreen.clickBackArrowButton();
    }
}