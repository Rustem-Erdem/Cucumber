package StepDefinitions;

import PageObjectModel.registerClass;
import Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
@RunWith(Cucumber.class)
public class stepDefinition1 {
    registerClass registerClass = new registerClass();
    private WebDriver driver;

    @Given("^Navigate to Website$")
    public void navigate_to_website() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^Click on sign button$")
    public void click_on_sign_button() throws Throwable {
        registerClass.setSignbutton();
        Thread.sleep(2000);

    }

    @And("^type email \"([^\"]*)\"$")
    public void type_email_something(String email) throws Throwable {
        registerClass.setEmail(email);
        Thread.sleep(2000);

    }

    @And("^Click on Create Account Button$")
    public void click_on_create_account_button() throws Throwable {
        registerClass.setClickCreateButton();
        Thread.sleep(2000);
    }




    @And("^Type Firstname\"([^\"]*)\" and Lastname \"([^\"]*)\"$")
    public void type_firstnamesomething_and_lastname_something(String firstname, String lastname) throws Throwable {
        registerClass.setName(firstname, lastname);
        Thread.sleep(2000);
    }

    @And("^Type Password \"([^\"]*)\"$")
    public void type_password_something(String password) throws Throwable {
        registerClass.setPassword(password);
        Thread.sleep(2000);
    }

    @And("^Type Address \"([^\"]*)\"$")
    public void type_address_something(String address) throws Throwable {
        registerClass.setAddress(address);
        Thread.sleep(2000);
    }

    @And("^Type Company \"([^\"]*)\"$")
    public void type_company_something(String company) throws Throwable {
        registerClass.setCompany(company);
        Thread.sleep(2000);
    }
    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }


}

