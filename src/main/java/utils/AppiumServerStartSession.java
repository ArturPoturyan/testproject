package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class AppiumServerStartSession implements CommonValues {
    public AndroidDriver<MobileElement> driver;
    private AppiumDriverLocalService service;


    @BeforeClass
    public void setUp() {
        initDriver(initService(), initDesiredCapability());
    }

    @BeforeMethod
    public void beforeMethodSetUp() {
        driver.launchApp();
    }

    @AfterMethod
    public void afterMethodSetUp() {
        driver.closeApp();

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        service.stop();

    }

    private void initDriver(String appiumServiceUrl, DesiredCapabilities desiredCapabilities) {
        try {
            URL myURLObject = new URL(appiumServiceUrl);
            driver = new AndroidDriver<>(myURLObject, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    private DesiredCapabilities initDesiredCapability() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource("picsart.apk")).getFile());
        capabilities.setCapability(MobileCapabilityType.APP, file);
        capabilities.setCapability(MobileCapabilityType.UDID, "410042ad44709101");
        capabilities.setCapability("deviceName", "Galaxy Note4");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
//        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);
        return capabilities;
    }

    private String initService() {
        service = AppiumDriverLocalService.buildDefaultService();
        if (service == null) {
            throw new AppiumServerHasNotBeenStartedLocallyException("An appium server node is not started!");
        }
        service.start();

        return service.getUrl().toString();
    }

}