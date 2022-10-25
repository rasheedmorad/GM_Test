package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MapsPage extends BasePage{

    @FindBy(xpath = "//button[@id='widget-zoom-in']")
    private WebElement _rightPopup;
    @FindBy(xpath = "//button[@id='widget-zoom-in']")
    private WebElement _zoomIn;
    @FindBy(xpath = "//button[@id='widget-zoom-out']")
    private WebElement _zoomOut;
    TopBar _searchBar;
    public enum ZOOM{
        in,out
    };
    public MapsPage(WebDriver driver){
        super(driver);
        _searchBar=new TopBar(driver);
    }

    public void SearchLocation(String location) throws Exception {
        _searchBar.Search(location);
    }
    public void SelectOptionFromListByIndex(int index) throws Exception {
        _searchBar.SelectOption(index);

    }
    public void Zoom(ZOOM status) throws Exception {
        switch (status){
            case in : {
                Click(_zoomIn);
                break;
            }
            case out: {
                Click(_zoomOut);
                break;
            }
            default:
                throw new Exception("there are no status like"+status);
        }
    }

}
