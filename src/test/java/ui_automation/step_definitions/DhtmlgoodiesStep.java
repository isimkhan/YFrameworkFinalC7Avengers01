package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ui_automation.pages.DhtmlgoodiesPage;
import ui_automation.utilities.ConfigurationReader;
import ui_automation.utilities.Driver;

public class DhtmlgoodiesStep {
    WebDriver driver = Driver.getInstance().getDriver();
    Actions act = new Actions(driver);
    DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();

    @Given("User navigates to dhtmlgoodies application")
    public void user_navigates_to_dhtmlgoodies_application() {

        driver.get(ConfigurationReader.getProperty("ui-config.properties", "dhtmlgoodies.url"));

    }

    @Then("Drag and drop cities {string} to the corresponding countries {string}")
    public void drag_and_drop_cities_to_the_corresponding_countries(String city, String country) {

        WebElement cityElement = null;
        WebElement countryElement = null;

        switch (city){
            case "Oslo" : {
                cityElement = dhtmlgoodiesPage.Oslo;
                countryElement = dhtmlgoodiesPage.Norway;
                break;
            }
            case "Stockholm" : {
                cityElement = dhtmlgoodiesPage.Stockholm;
                countryElement = dhtmlgoodiesPage.Sweden;
                break;
            }
            case "Copenhagen" : {
                cityElement = dhtmlgoodiesPage.Copenhagen;
                countryElement = dhtmlgoodiesPage.Denmark;
                break;
            }
            case "Seoul" : {
                cityElement = dhtmlgoodiesPage.Seoul;
                countryElement = dhtmlgoodiesPage.SK;
                break;
            }
            case "Rome" : {
                cityElement = dhtmlgoodiesPage.Rome;
                countryElement = dhtmlgoodiesPage.Italy;
                break;
            }
            case "Madrid" : {
                cityElement = dhtmlgoodiesPage.Madrid;
                countryElement = dhtmlgoodiesPage.Spain;
                break;
            }
            case "Washington" : {
                cityElement = dhtmlgoodiesPage.Washington;
                countryElement = dhtmlgoodiesPage.US;
                break;
            }
        }

        act.dragAndDrop(cityElement, countryElement).perform();


    }
}