package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DemoqaFormPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;

public class DemoqaFormStepDefinitions {
    DemoqaFormPage demoqaPage = new DemoqaFormPage();

    @Given("User goes to {string}.")
    public void user_goes_to(String demoqa_url) {

        Driver.getDriver().get(ConfigReader.getProperty(demoqa_url));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Then("User clicks the forms")
    public void user_clicks_the_forms() throws InterruptedException {
        demoqaPage.forms.click();
        Thread.sleep(2000);
    }

    @Then("User clicks the practise form")
    public void user_clicks_the_practise_form() {
        demoqaPage.practiceForm.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @Then("User fills the Student Registration Form and submits")
    public void user_fills_the_student_registration_form_and_submits() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(demoqaPage.firstName).
                sendKeys(ConfigReader.getProperty("first_name")).
                sendKeys(Keys.TAB).
                pause(1).
                sendKeys(ConfigReader.getProperty("last_name")).
                sendKeys(Keys.TAB).
                pause(1).
                sendKeys(ConfigReader.getProperty("email")).
                perform();

        if (!demoqaPage.radioButtonMale.isSelected()) {
            demoqaPage.radioButtonMale.click();
        }

        demoqaPage.mobilNumer.sendKeys(ConfigReader.getProperty("mobil_number") + Keys.TAB);
        Select month = new Select(demoqaPage.month);
        month.selectByIndex(9);
        Select years = new Select(demoqaPage.years);
        years.selectByVisibleText("1975");
        demoqaPage.day.click();

        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].click();", demoqaPage.subjects);
        actions.sendKeys(ConfigReader.getProperty("subject")).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                perform();
        jsexecutor.executeScript("arguments[0].click();", demoqaPage.hobbiesCheckbox3);
    }

    @And("User upload the picture from resouches")
    public void userUploadThePictureFromResouches() throws InterruptedException {

        File file = new File("src/test/resources/48-uur-in-Zaandam.jpg");
        String filePath = file.getAbsolutePath();

        demoqaPage.uploadPicture.sendKeys(filePath);
        Thread.sleep(2000);
        demoqaPage.currentAddress.sendKeys(ConfigReader.getProperty("current_adress") + Keys.TAB);
        Actions actions = new Actions(Driver.getDriver());
        actions.click(demoqaPage.selectState).
                sendKeys(ConfigReader.getProperty("select_state")).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("select_city")).
                sendKeys(Keys.TAB).
                perform();
        demoqaPage.submit.click();
    }

    @Then("Verify that {string} is displayed")
    public void verify_that_is_displayed(String submitThanksMessage) {
        String expectedMessage = ConfigReader.getProperty(submitThanksMessage);
        String actualMessage = demoqaPage.submitThankMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
}

