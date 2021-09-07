package PageObjectModel;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerClass extends BaseClass {

    private WebDriver driver;

    public registerClass() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    private WebElement signbutton;


    @FindBy(xpath = "//*[@id=\"email_create\"]")
    private WebElement emailbox;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
    private WebElement clickCreateButton;



    @FindBy(xpath = "//*[@id=\"customer_firstname\"]")
    private WebElement firstname;

    @FindBy(xpath = "//*[@id=\"customer_lastname\"]")
    private WebElement lastname;

    @FindBy(name = "passwd")
    private WebElement password;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(name = "address1")
    private WebElement address;


    public void setEmail(String email) {
        sendkeysFunction(emailbox, email);
    }

    public void setSignbutton() {

        clickFunction(signbutton);
    }


    public void setName(String firstName, String lastName) {
        sendkeysFunction(firstname, firstName);
        sendkeysFunction(lastname, lastName);

    }

    public void setClickCreateButton() {
        clickFunction(clickCreateButton);
    }

    public void setPassword(String Password) {
        sendkeysFunction(password, Password);

    }

    public void setAddress(String Address) {
        sendkeysFunction(address, Address);

    }

    public void setCompany(String Company) {
        sendkeysFunction(company, Company);

    }


}

