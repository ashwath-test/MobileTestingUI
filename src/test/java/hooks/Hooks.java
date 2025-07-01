package hooks;

import io.appium.java_client.AppiumDriver;
import org.junit.After;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.DriverFactory;

import java.net.MalformedURLException;

public class Hooks {
    protected AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException, InterruptedException {
        driver= DriverFactory.getDriver();
    }

    @AfterClass
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
