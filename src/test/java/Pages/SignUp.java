package Pages;

import BaseTest.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Random;

public class SignUp extends BaseClass {

    AndroidDriver driver;

    //constructor

    public SignUp(AndroidDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(
                new AppiumFieldDecorator(driver,Duration.ofSeconds(20)), this);
    }

    //Elements

    @AndroidFindBy(xpath="//android.widget.Button[@content-desc='Get Started']") private WebElement continueBtn;

    @AndroidFindBy(id ="com.android.permissioncontroller:id/permission_allow_button") private WebElement allowNotification1;
    @AndroidFindBy(id ="com.android.permissioncontroller:id/permission_allow_button") private WebElement allow2;
    @AndroidFindBy(id ="com.android.permissioncontroller:id/permission_allow_button") private WebElement whileUsingTheApp;

    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Staging settings\"]") private WebElement ngrokSettingBtn;
    @AndroidFindBy(xpath="//android.widget.EditText") private WebElement ngrok;
    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Save & apply\"]") private WebElement saveAndApplyBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Back\"]") private WebElement backBtn;

    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"SignUp\"]") private WebElement singUpBtn;

    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"1\n" + "SignUp\n" + "Welcome\n" + "View all your bank accounts, cards, and cash in one dashboard. Simple, powerful.\n" + "Already have an account? \n" + "I agree to the \n" + " and \"]/android.widget.EditText[1]") private WebElement fullName;
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"1\n" + "SignUp\n" + "Welcome\n" + "View all your bank accounts, cards, and cash in one dashboard. Simple, powerful.\n" + "Already have an account? \n" + "I agree to the \n" + " and \"]/android.widget.EditText[2]") private WebElement email;
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"1\n" + "SignUp\n" + "Welcome\n" + "View all your bank accounts, cards, and cash in one dashboard. Simple, powerful.\n" + "Already have an account? \n" + "I agree to the \n" + " and \"]/android.widget.EditText[3]") private WebElement phoneNumber;
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"1\n" + "SignUp\n" + "Welcome\n" + "View all your bank accounts, cards, and cash in one dashboard. Simple, powerful.\n" + "Already have an account? \n" + "I agree to the \n" + " and \"]/android.widget.EditText[4]") private WebElement password;
    @AndroidFindBy(xpath="//android.widget.CheckBox") private WebElement checkbox;
    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Create Account\"]") private WebElement continueBtn1;

    @AndroidFindBy(xpath="//android.widget.EditText") private WebElement otp;
    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Verify & Continue\"]") private WebElement verifyAndContinue;

    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"2\n" + "Create  PIN\n" + "View all your bank accounts, cards, and cash in one dashboard. Simple, powerful.\n" + "Create  PIN\n" + "Confirm  PIN\"]/android.widget.EditText[1]") private WebElement createPin;
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"2\n" + "Create  PIN\n" + "View all your bank accounts, cards, and cash in one dashboard. Simple, powerful.\n" + "Create  PIN\n" + "Confirm  PIN\"]/android.widget.EditText[2]") private WebElement confirmPin;
    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Next\"]") private WebElement nextBtn;
    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Skip\"]") private WebElement skipBtn;

    @AndroidFindBy(xpath="//android.widget.EditText") private WebElement businessName;
    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Save\"]") private WebElement businessSaveBtn;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Skip\"]") private WebElement businessSkipBtn;


    //Actions

    public void clickContinueButton()
    {
        continueBtn.click();
        System.out.println("continueBtn is clicked successfully");
    }

//    public void allowNotification1()
//    {
//        allowNotification1.click();
//    }
//
//    public void allowNotification2()
//    {
//        allow2.click();
//    }
//
//    public void allowNotification3()
//    {
//        whileUsingTheApp.click();
//    }

//    public void allowPermissions() {
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//        for(int i = 0; i < 3; i++) {
//            try {
//                wait.until(ExpectedConditions.elementToBeClickable(
//                        By.id("com.android.permissioncontroller:id/permission_allow_button")
//                )).click();
//            }
//            catch (Exception e) {
//                break;
//            }
//        }
//    }

    public void clickNgrokSettingBtn()
    {
        ngrokSettingBtn.click();
        System.out.println("ngrokSettingBtn is Clicked successfully");
    }

    public void applyNgrokLink()
    {
        ngrok.sendKeys("https://jumble-mooing-stew.ngrok-free.dev");
        System.out.println("ngrok is applied successfully");
    }

    public void clickSaveAndApplyBtn()
    {
        saveAndApplyBtn.click();
        System.out.println("clicked saveAndApplyBtn successfully");
    }

    public void clickBackBtn()
    {
        backBtn.click();
    }

    public void clickSingUpBtn()
    {
        singUpBtn.click();
        System.out.println("Clicked singUpBtn successfully");
    }

    public String enterFullName()
    {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        String randomName = sb.substring(0, 1).toUpperCase() + sb.substring(1);

        fullName.sendKeys(randomName);
        System.out.println("Full Name entered successfully: " + randomName);

        return randomName;
//        fullName.sendKeys("testbj");
//        String name=fullName.getAttribute("text");
//        System.out.println("Full name entered into field is="+name);
//        System.out.println("fullname is enter Successfully");
    }

    public String enterEmail()
    {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        String randomEmail = sb.toString() + "@gmail.com";

        email.sendKeys(randomEmail);
        System.out.println("Email entered successfully: " + randomEmail);

        return randomEmail;
        //System.out.println("email enter successfully");
    }

    public String enterPhoneNumber()
    {
        Random random = new Random();

        String pNumber = "9";

        for (int i = 0; i < 9; i++) {
            pNumber += random.nextInt(10);
        }

        phoneNumber.sendKeys(pNumber);

        System.out.println("Phone Number entered successfully: " + pNumber);

        return pNumber;
//        phoneNumber.sendKeys("9654875858");
//        System.out.println("phone number enter successfully");
    }

    public void enterPassword()
    {
        password.sendKeys("Aaaa111&");
        System.out.println("password enter successfully");
    }

    public void clickCheckbox() throws InterruptedException {
        checkbox.click();
        System.out.println("checkbox is clicked successfully");
        Thread.sleep(2000);
    }

    public void clickContinueBtn1()
    {
        continueBtn1.click();
        System.out.println("continueBtn1 is clicked successfully");
    }

    public void enterOtp()
    {
        otp.sendKeys("");
        System.out.println("Otp is entered successfully ");
    }

    public void ClickVerifyAndContinue()
    {
        verifyAndContinue.click();
        System.out.println("user clicked verifyAndContinue btn successfully");
    }

    public void createPin()
    {
        createPin.sendKeys("1234");
        System.out.println("User createPin successfully");
    }

    public void confirmPin()
    {
        confirmPin.sendKeys("1234");
        System.out.println("User confirmPin successfully");
    }

   public void clickNextBtn()
   {
       nextBtn.click();
       System.out.println("User clicked the nextBtn successfully");
   }

   public void businessSkipBtn()
   {
       businessSkipBtn.click();
       System.out.println("user Clicked businessSkipBtn successfully");

   }










}
