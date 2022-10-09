package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class DhtmlgoodiesPage {
    WebDriver driver;

    public DhtmlgoodiesPage(){
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "box1")
    public WebElement Oslo;

    @FindBy(id = "box2")
    public WebElement Stockholm;

    @FindBy(id = "box4")
    public WebElement Copenhagen;

    @FindBy(id = "box5")
    public WebElement Seoul;

    @FindBy(id = "box6")
    public WebElement Rome;

    @FindBy(id = "box7")
    public WebElement Madrid;

    @FindBy(id = "box3")
    public WebElement Washington;

    @FindBy(id = "box101")
    public WebElement Norway;

    @FindBy(id = "box102")
    public WebElement Sweden;

    @FindBy(id = "box105")
    public WebElement SK;

    @FindBy(id = "box106")
    public WebElement Italy;

    @FindBy(id = "box107")
    public WebElement Spain;

    @FindBy(id = "box103")
    public WebElement US;

    @FindBy(id = "box104")
    public WebElement Denmark;
}