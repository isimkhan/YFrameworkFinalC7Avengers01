package ui_automation.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui_automation.pages.ApApplicationHomePage;
import ui_automation.utilities.ConfigurationReader;
import ui_automation.utilities.Driver;

public class ApApplicationStep {

    WebDriver driver = Driver.getInstance().getDriver();
    ApApplicationHomePage apApplicationHomePage = new ApApplicationHomePage();
    Actions act = new Actions(driver);

    @Given("user navigates to AP application")
    public void user_navigates_to_AP_application() {
        driver.get(ConfigurationReader.getProperty("ui-config.properties", "automationpractice.url"));
        String title = driver.getTitle();
        Assert.assertEquals("Title verification failed for AP applicatin!", "My Store", title);
    }

    @Then("I hover over womens tab")
    public void i_hover_over_womens_tab() throws InterruptedException {


        act.moveToElement(apApplicationHomePage.womensTab).perform();
        Thread.sleep(3000);
    }

    @Then("I click on casual dresses link")
    public void i_click_on_casual_dresses_link() {
        apApplicationHomePage.casualDressesLink.click();
    }

    @Then("I am navigated to casual dresses page")
    public void i_am_navigated_to_casual_dresses_page() {
        String headerOfAPCasualDressesPage = apApplicationHomePage.casualDressesPageHeader.getText().trim();
        Assert.assertEquals("Header verification failed in Casual Dresses Page", "CASUAL DRESSES", headerOfAPCasualDressesPage);
    }
    @Then("user interacts with keyboard actions")
    public void user_interacts_with_keyboard_actions() throws InterruptedException {

        /**
         * #  Locate search box
         * #  Hover over the search box
         * #  Click on the search box
         * #  Write ‘jeans’ with upper case letters using Keys.SHIFT in the search box
         * #  Double click in the search box
         * #  Build and perform
         * #  Click search button
         */

        act.moveToElement(apApplicationHomePage.searchBox)   // hover over element
                .click()                                    // click to the same element
                .keyDown(Keys.SHIFT)                       // pres and Hold SHIFT key
                .sendKeys("jeans")                        // type jeans into search box
                .keyUp(Keys.SHIFT)                        // release SHIFT key
                .doubleClick(apApplicationHomePage.searchBox)  // double click and select all of the text
                .build().perform();

        apApplicationHomePage.magnifierButton.click();

        Thread.sleep(5000);
    }
}
