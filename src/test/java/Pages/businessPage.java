package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class businessPage {

    AndroidDriver driver;

    //constructor

    public businessPage(AndroidDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, Duration.ofSeconds(20)), this);
    }

    //locators


}
