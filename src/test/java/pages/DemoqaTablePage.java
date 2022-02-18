package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaTablePage {
    public DemoqaTablePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[6]")
    public WebElement bookStoreApplication;

    @FindBy(id = "searchBox")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='rt-td'])[3]")
    public WebElement nameOfAuthor;
}
