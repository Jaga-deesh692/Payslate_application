package BaseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {


    public static AndroidDriver driver;

    public static void setUp() throws InterruptedException, MalformedURLException {


        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setDeviceName("Pixel_5");
        options.setAutomationName("UiAutomator2");
        options.setApp("C:\\Users\\supre\\Appium\\PayslateApplication\\src\\test\\resources\\app-staging-release (1).apk");
        options.setAutoGrantPermissions(true);


         driver =
                new AndroidDriver(
                        new URL("http://127.0.0.1:4723"),
                        options);

        System.out.println("Application launched successfully");

        Thread.sleep(5000);
    }

    public static void tearDown()
    {
        if(driver != null)
        {
            driver.quit();
        }
    }

}
