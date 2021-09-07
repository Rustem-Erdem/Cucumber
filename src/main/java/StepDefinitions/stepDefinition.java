package StepDefinitions;

import PageObjectModel.contactUsPage;
import Utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
public class stepDefinition {
    contactUsPage contactUsPage = new contactUsPage();
    private WebDriver driver;


    @Given("^Navigate to website$")
    public void navigate_to_website() throws Throwable {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @When("^Click on send button$")
    public void click_on_send_button() throws Throwable {
        contactUsPage.setClickSendButton();
        Thread.sleep(2000);
    }

    @Then("^Verify success message$")
    public void verify_success_message() throws Throwable {
      contactUsPage.setGetTitleSuccess();
        Thread.sleep(2000);
    }

    @And("^Click on contact us button$")
    public void click_on_contact_us_button() throws Throwable {
        contactUsPage.clickContactUsButton();
        Thread.sleep(2000);
    }

    @And("^Select subject heading$")
    public void select_subject_heading() throws Throwable {
        contactUsPage.SelectSubjectDropdown();
        Thread.sleep(2000);
    }

    @And("^Type email$")
    public void type_email() throws Throwable {
        contactUsPage.setEmail();
        Thread.sleep(2000);
    }

    @And("^Type order reference$")
    public void type_order_reference() throws Throwable {
        contactUsPage.setOrder();
        Thread.sleep(2000);
    }

    @And("^Type a message$")
    public void type_a_message() throws Throwable {
        contactUsPage.setWriteMessage();
        Thread.sleep(2000);
    }


}