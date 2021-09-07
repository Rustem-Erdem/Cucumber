package PageObjectModel;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactUsPage extends BaseClass {
    WebDriver driver;

    public contactUsPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"contact-link\"]/a")
    private WebElement contactUsButton;

    public void clickContactUsButton() {
        clickFunction(contactUsButton);
    }

    @FindBy(name = "id_contact")
    private WebElement selectSubject;

    public void SelectSubjectDropdown() {
        selectElementFromDropDown(selectSubject, "Customer service");
    }

    @FindBy(id = "email")
    private WebElement email;

    public void setEmail() {
        sendkeysFunction(email, "rustemerdem@hotmail.com");
    }

    @FindBy(name = "id_order")
    private WebElement OrderProduct;

    public void setOrder() {
        sendkeysFunction(OrderProduct, "129");
    }

    @FindBy(xpath= "//*[@id=\"message\"]")
    private WebElement writeMessage;

    public void setWriteMessage() {
        sendkeysFunction(writeMessage, "hello admin");
    }

    @FindBy(xpath = "//*[@id=\"submitMessage\"]/span")
    private WebElement clickSendButton;

    public void setClickSendButton() {
        clickFunction(clickSendButton);
    }
    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    private WebElement getTitleSuccess;

    public void setGetTitleSuccess() {
        Asertion(getTitleSuccess,"Your message has been successfully sent to our team");

    }
}
