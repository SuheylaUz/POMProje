package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaResortePage {

    public KoalaResortePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy (id = "UserName")
    public WebElement kullanıcıAdi;

    @FindBy (id = "Password")
    public WebElement password;

    @FindBy (id = "btnSubmit")
    public WebElement loginButton;

}
