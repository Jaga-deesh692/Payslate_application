package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import io.appium.java_client.android.AndroidDriver;

public class SignUpSteps {

    //constructor

    public SignUpSteps(AndroidDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, Duration.ofSeconds(20)), this);
    }

    @Given("User launches the payslate app")
    public void user_Launches_the_paySlate_app()
    {

    }
}
