package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaDrogDropPage {
    public DemoqaDrogDropPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[5]")
    public WebElement interraction;

    @FindBy(xpath = "(//li[@id='item-3'])[4]")
    public WebElement droppable;

    @FindBy(id = "draggable")
    public WebElement dragMe;

    @FindBy(xpath = "(//div[@class='drop-box ui-droppable'])[1]")
    public WebElement dropHere;

    @FindBy(xpath = "//div[@class='drop-box ui-droppable ui-state-highlight']")
    public WebElement droppedMessage;
}
