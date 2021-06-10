package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SideRadiatorsTest extends BaseTest{

    private static final int TIME_TO_WAIT = 30;

    @Test
    public void checkThatOrderBoxReorderAllTheProductsByIncreasingPrice(){
        getHomePage().clickOnSideRadiatorsButton();
        getSideRadiatorsPage().waitForPageLoadComplete(TIME_TO_WAIT);
        getSideRadiatorsPage().clickOnOrderByBox();
        getSideRadiatorsPage().clickOnIncreasingOrderButton();
        getSideRadiatorsPage().waitForPageLoadComplete(TIME_TO_WAIT);
        Assert.assertTrue(getSideRadiatorsPage().getFirstPriceOnSideRadiatorPage()
                < getSideRadiatorsPage().getFifthPriceOnSideRadiatorPage());
    }
}
