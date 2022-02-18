package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.DemoqaDrogDropPage;
import pages.DemoqaTablePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class DemoqaDrogDropSteps {
    DemoqaDrogDropPage demoqaDrogDropPage = new DemoqaDrogDropPage();

    @Then("User clicks the Interactions")
    public void user_clicks_the_interactions() {
        demoqaDrogDropPage.interraction.click();
    }

    @Then("User clicks Droppables")
    public void user_clicks_droppables() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        demoqaDrogDropPage.droppable.click();
    }

    @When("User moves the box of {string} to box of {string}")
    public void user_moves_the_box_of_to_box_of(String drag_me, String drop_here) {
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(demoqaDrogDropPage.dragMe, demoqaDrogDropPage.dropHere).perform();

    }

    @Then("Verify that {string} changed to {string}")
    public void verify_that_changed_to(String drop_here, String dropped_message) {
        String expectedMessage = ConfigReader.getProperty(drop_here);
        String actualMessage = demoqaDrogDropPage.droppedMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


}
