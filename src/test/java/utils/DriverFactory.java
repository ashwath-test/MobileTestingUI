package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static AppiumDriver driver;
    public  static AppiumDriver getDriver() throws InterruptedException, MalformedURLException {
        String platform = "Android";
        if (driver == null) {
            DesiredCapabilities caps = new DesiredCapabilities();
            if (platform.equalsIgnoreCase("Android")) {
                caps.setCapability("appium:autoGrantPermissions", true);
                caps.setCapability("appium:deviceName", "sdk_gphone64_x86_64");
                caps.setCapability("appium:udid", "emulator-5554");
                caps.setCapability("appium:platformName", "ANDROID");
                caps.setCapability("appium:platformVersion", "12");
                caps.setCapability("appium:automationName", "UiAutomator2");
                caps.setCapability("appium:appPackage", "org.simple.clinic.staging");
                caps.setCapability("appium:appActivity", "org.simple.clinic.setup.SetupActivity");
            } else {
                caps.setCapability("appium:platformName", "iOS");
                caps.setCapability("appium:platformVersion", "17.5");
                caps.setCapability("appium:deviceName", "iPhone 15 Pro");
                caps.setCapability("appium:udid", "34534-434-343-343-34-34");
                caps.setCapability("appium:automationName", "XCUITest");
                caps.setCapability("appium:bundleId", "org.simple.clinic.staging");
                caps.setCapability("appium:fullReset", "false");
                caps.setCapability("appium:noReset", "true");

            }
            URL url = new URL("http://127.0.0.17:4723/");
            driver = new AppiumDriver(url, caps);
            Thread.sleep(10000);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
