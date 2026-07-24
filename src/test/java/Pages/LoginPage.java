package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    AndroidDriver driver;

    public LoginPage(AndroidDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    //Locators

    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Staging settings\"]") private WebElement ngrokSettingButton;
    @AndroidFindBy(xpath="//android.widget.EditText") private WebElement NgrokUrlTextField;
    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Save & apply\"]") private WebElement saveAndApplyButton;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Back\"]") private WebElement backBtn;
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"Email\"]") private WebElement email;
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"Login\n" + "View all your bank accounts, cards, and cash in one dashboard. Simple, powerful.\n" + "Email Address\n" + "Password\n" + "Not registered yet? \"]/android.widget.EditText[1]") private WebElement EnterEmailField;
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"Login\n" + "View all your bank accounts, cards, and cash in one dashboard. Simple, powerful.\n" + "Email Address\n" + "Password\n" + "Not registered yet? \"]/android.widget.EditText[2]") private WebElement EnterPasswordField;
    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Login with Email\"]") private WebElement LoginWithEmailButton;

    //Actions

    public void clickOnNgrokSettingButton()
    {
        ngrokSettingButton.click();
        System.out.println("successfully clicked on ngrok setting button");
    }

    public void enterHttpLinkIntoNgrokUrlTextField()
    {
        NgrokUrlTextField.sendKeys("https://jumble-mooing-stew.ngrok-free.dev");
        System.out.println("successfully enter the Http link into NgrokUrlTextField ");
    }

    public void clickSaveAndApplyButton()
    {
        saveAndApplyButton.click();
        System.out.println("Successfully clicked the saveAndApplyButton");
    }

    public void clickBackBtn()
    {
        backBtn.click();
        System.out.println("successfully clicked the backBtn");
    }

    public void clickEmail()
    {
        email.click();
        System.out.println("successfully clicked the email");
    }

    public void EnterTextIntoEnterEmailField()
    {
        EnterEmailField.sendKeys("bjagadeesg87902@gmail.com");
        System.out.println("Successfully user enter the data into EnterEmailField");
    }

    public void EnterPasswordIntoEnterPasswordField()
    {
        EnterPasswordField.sendKeys("Aaaa111&");
        System.out.println("Successfully user enters the Password into EnterPasswordField");
    }

    public void clickTheLoginWithEmailButton()
    {
        LoginWithEmailButton.click();
        System.out.println("Successfully clicks the LoginWithEmailButton");
    }
















}
