package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class ApApplicationHomePage {

    WebDriver driver;
    public ApApplicationHomePage(){
        driver =Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@title='Women']")
    public WebElement womensTab;

    @FindBy(xpath = "//*[@title='Casual Dresses']")
    public WebElement casualDressesLink;

    @FindBy(xpath = "//*[@class='cat-name']")
    public WebElement casualDressesPageHeader;

    @FindBy(id = "search_query_top")
    public WebElement searchBox;

    @FindBy(name = "submit_search")
    public WebElement magnifierButton;


}
