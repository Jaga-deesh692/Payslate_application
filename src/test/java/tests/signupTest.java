package tests;

import BaseTest.BaseClass;
import Pages.SignUp;
import org.testng.annotations.Test;

public class signupTest extends BaseClass {

    @Test(priority = 1)
    public void signupTests() throws InterruptedException {
        SignUp sp=new SignUp(driver);
        sp.clickContinueButton();
//        sp.allowNotification1();
//        sp.allowNotification2();
//        sp.allowNotification3();
        //sp.allowPermissions();
        sp.clickNgrokSettingBtn();
        sp.applyNgrokLink();
        sp.clickSaveAndApplyBtn();
        sp.clickBackBtn();
        sp.clickSingUpBtn();
        sp.enterFullName();
        sp.enterEmail();
        sp.enterPhoneNumber();
        sp.enterPassword();
        sp.clickCheckbox();
        sp.clickContinueBtn1();
        sp.enterOtp();
        sp.ClickVerifyAndContinue();
        sp.createPin();
        sp.confirmPin();
        sp.clickNextBtn();
        sp.businessSkipBtn();
    }


}
