package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaFormPage {
    public DemoqaFormPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][2]")
    public WebElement forms;

    @FindBy(xpath = "//div[@class='element-list collapse show']")
    public WebElement practiceForm;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(xpath = "//*[@class='custom-control-label']")
    public WebElement radioButtonMale;

    @FindBy(id = "userNumber")
    public WebElement mobilNumer;

    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    public WebElement month;

    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    public WebElement years;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--023']")
    public WebElement day;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirth;

    @FindBy(id = "subjectsContainer")
    public WebElement subjects;

    @FindBy(id = "hobbies-checkbox-3")
    public WebElement hobbiesCheckbox3;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPicture;

    @FindBy(xpath = "(//div[@class=' css-1wa3eu0-placeholder'])[1]")
    public WebElement selectState;

    @FindBy(xpath = "(//div[@class=' css-1wa3eu0-placeholder'])[1]")
    public WebElement selectCity;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement submit;

    @FindBy(id = "example-modal-sizes-title-lg")
    public WebElement submitThankMessage;

}