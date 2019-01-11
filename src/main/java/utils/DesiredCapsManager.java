package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DesiredCapsManager {
    protected  AndroidDriver<MobileElement> driver;

//    public DesiredCapsManager() {
//        setUp();
//    }

    @BeforeClass
    public void setUp() {
//        File filePath = new File(System.getProperty("user.dir"));
//        File appDir = new File(filePath, "/app");
//        File app = new File(appDir, "/Users/arturpoturyan/Downloads/picsart-10.8-unsigned-117-signed.apk");
//        capabilities.setCapability("app", app.getAbsolutePath());
//        capabilities.setCapability("automationName", AutomationName.APPIUM);
        String apk = "/Users/arturpoturyan/Downloads/11.3_ON.apk";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.UDID, "a8e4926b");
        capabilities.setCapability("deviceName", "S4");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "5.0.1");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability("app", apk);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
                "com.picsart.studio");
      //  capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
                "com.socialin.android.photo.picsinphoto.MainPagerActivity");

        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

//        try {
//            Capabilities caps = driver.getCapabilities();
//
//            assertEquals(AutomationName.APPIUM, caps.getCapability(MobileCapabilityType.AUTOMATION_NAME));
//            assertEquals(MobilePlatform.ANDROID, caps.getCapability(MobileCapabilityType.PLATFORM_NAME));
//            assertNotEquals(null, caps.getCapability(MobileCapabilityType.DEVICE_NAME));
//            assertEquals(apk, caps.getCapability(MobileCapabilityType.APP));
//        } finally {
//            driver.quit();
//        }
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        //if (driver != null) {
        driver.quit();
        // }

    }
}