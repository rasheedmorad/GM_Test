package Tests;

import org.testng.annotations.Test;
import pages.MapsPage;

public class Alltests extends BaseTest{

    @Test
    public void TestForRome() throws Exception {
        _MapsPage.SearchLocation("Rome");
        _MapsPage.SelectOptionFromListByIndex(0);
        _MapsPage.TakeScreenShot("First_Screen_Shot");
        _MapsPage.Zoom(MapsPage.ZOOM.in);
        _MapsPage.TakeScreenShot("Second_Screen_Shot");
        _MapsPage.Zoom(MapsPage.ZOOM.in);
        _MapsPage.TakeScreenShot("Third_Screen_Shot");
    }


}
