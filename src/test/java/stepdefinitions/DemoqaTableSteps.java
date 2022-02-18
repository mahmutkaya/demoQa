package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.DemoqaTablePage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DemoqaTableSteps {
    DemoqaTablePage demoqaTablePage = new DemoqaTablePage();

    @Then("User clicks the Book store Application")
    public void user_clicks_the_book_store_application() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(demoqaTablePage.bookStoreApplication).
                click().
                perform();
    }

    @Then("User seaches for {string}")
    public void user_seaches_for(String name_of_the_book) {
        demoqaTablePage.searchBox.sendKeys(ConfigReader.getProperty("name_of_the_book"));
    }

    @Then("User verifies {string} is the author")
    public void user_verifies_is_the_author(String name_of_the_author) {
        String expectedData = ConfigReader.getProperty(name_of_the_author);
        String actualData = demoqaTablePage.nameOfAuthor.getText();
        Assert.assertEquals(expectedData, actualData);
    }

}

