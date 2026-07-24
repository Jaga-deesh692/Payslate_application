package stepDefinitions;

import BaseTest.BaseClass;
import Pages.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginSteps {

    LoginPage lp=new LoginPage(BaseClass.driver);

    @Given("User launches the PaySlate app")
    public void user_launches_the_pay_slate_app() {
        System.out.println("App launched Successfully");
    }
    @And("User click on ngrok settings Button")
    public void user_click_on_ngrok_settings_button() {
        lp.clickOnNgrokSettingButton();
    }
    @And("User enter http method into the field successfully")
    public void user_enter_http_method_into_the_field_successfully() {
        lp.enterHttpLinkIntoNgrokUrlTextField();
    }
    @And("User clicks on saveAndApplyBtn Successfully")
    public void user_clicks_on_save_and_apply_btn_successfully() {
        lp.clickSaveAndApplyButton();
    }
    @And("User will click on Email Link")
    public void user_will_click_on_email_link() {
        lp.clickBackBtn();
        lp.clickBackBtn();
    }
    @And("User Enters the valid <email> address and <Password>")
    public void user_enters_the_valid_email_address_and_password(String email,String Password) {

    }
    @And("User Clicks on Login with email Button")
    public void user_clicks_on_login_with_email_button() {

    }
    @Then("User will successfully login and navigate to business Page")
    public void user_will_successfully_login_and_navigate_to_business_page() {

    }

    @And("User Enters the valid <email> address and <Password>")
    public void userEntersTheValidEmailAddressAndPassword() {

    }
}
