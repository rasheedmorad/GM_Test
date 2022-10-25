package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class TopBar extends ElementBase{
    @FindBy(xpath = "//input[@class='tactile-searchbox-input']")
    private WebElement _searchInput;
    @FindBy(xpath = "//div[@class='w6VYqd']")
    private WebElement _rightPopup;
    @FindBy(xpath = "//div[@role='row']")
    private List<WebElement> _resultsList;

    public TopBar(WebDriver driver){
        super(driver);
    }

    public void Search(String location) throws Exception {
        SendKeys(_searchInput,location);
        wait.until(ExpectedConditions.visibilityOfAllElements(_resultsList));
    }
    public void SelectOption(int index) throws Exception {
        Click(_resultsList.get(index));
        wait.until(ExpectedConditions.visibilityOf(_rightPopup));
    }
}
