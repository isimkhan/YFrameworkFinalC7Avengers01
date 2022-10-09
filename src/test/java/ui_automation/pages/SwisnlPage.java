package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SwisnlPage {
    WebDriver driver;

    public SwisnlPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);}

    @FindBy(css = "[class='context-menu-one btn btn-neutral']")
    public WebElement rightClickMe;

    @FindBy(xpath = "//*[@class='context-menu-list context-menu-root']/li/span")
    public List<WebElement> optios;
}