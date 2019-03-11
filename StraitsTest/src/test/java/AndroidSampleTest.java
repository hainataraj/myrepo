import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidSampleTest {
    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        String appiumServerURL = "http://0.0.0.0:4723/wd/hub";
        //String appiumServerURL = "https://cloud.seetest.io/wd/hub";

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("avd", "Pixel");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appPackage", "com.buuuk.st");
        desiredCapabilities.setCapability("appActivity", "com.sph.straitstimes.views.activities.SplashActivity");
        //desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.CHROME);
        desiredCapabilities.setCapability("newCommandTimeout", "20");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
        driver = new AndroidDriver(new URL(appiumServerURL), desiredCapabilities);


//        desiredCapabilities.setCapability("accessKey", "eyJ4cC51Ijo1MTU3NDk5LCJ4cC5wIjo1MTU3NDk4LCJ4cC5tIjoiTVRVMU1qSXpPRFkwTnpNek1nIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4Njc1OTg2NDgsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.itwmGue_hCOaJ-N0FFrCeXGEGdAo5Gk6p88gMzomf2k");
//        desiredCapabilities.setCapability("udid", "9886674e5258475a46");
//        desiredCapabilities.setCapability("platformName", "Android");
//        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.buuuk.st");
//        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.sph.straitstimes.views.activities.SplashActivity");
//        desiredCapabilities.setCapability("newCommandTimeout", "20");
//        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
//        driver = new AndroidDriver(new URL("https://cloud.seetest.io/wd/hub/"), desiredCapabilities);
        //


    }

    @Test
    public void firstTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();

        //driver.findElement(By.xpath(""));

    }
}
