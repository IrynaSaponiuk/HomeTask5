package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BathroomRadiatorsTest extends BaseTest{

    private static final int TIME_TO_WAIT = 30;
    private static final int TIME_TO_WAIT_FOR_VISIBILITY = 60;
    private static final String EXPECTED_COUNT = "1";
    private static final String EXPECTED_NULL_COUNT = "0";

@Test
    public void checkIfThereIsNullInCartAfterDeletingProducts(){
    getHomePage().clickOnBathroomRadiatorsButton();
    getBathroomRadiatorsPage().waitForPageLoadComplete(TIME_TO_WAIT);
    getBathroomRadiatorsPage().clickOnFirstProductOnBathroomRadiatorsPage();
    getBathroomRadiatorsPage().waitForPageLoadComplete(TIME_TO_WAIT);
    getBathroomRadiatorsPage().clickOnButtonToBuy();
    getBathroomRadiatorsPage().waitVisibilityOfElement(TIME_TO_WAIT,getBathroomRadiatorsPage().getContinueShoppingButton());
    getBathroomRadiatorsPage().clickOnContinueShoppingButton();
    getBathroomRadiatorsPage().waitForPageLoadComplete(TIME_TO_WAIT);
    getBathroomRadiatorsPage().findCountOfCartOnSite();
    Assert.assertEquals(getBathroomRadiatorsPage().getCountOfProductsInCart(),EXPECTED_COUNT);
    getBathroomRadiatorsPage().waitForAjaxToComplete(TIME_TO_WAIT);
    getBathroomRadiatorsPage().GoToCartButton();
    getBathroomRadiatorsPage().waitVisibilityOfElement(TIME_TO_WAIT_FOR_VISIBILITY,getBathroomRadiatorsPage().getGoToCartButton());
    getBathroomRadiatorsPage().clickGoToCart();
    getBathroomRadiatorsPage().waitForPageLoadComplete(TIME_TO_WAIT);
    getCartPage().moveToDeleteButtonAndClick();
    getBathroomRadiatorsPage().waitForPageLoadComplete(TIME_TO_WAIT);
    getBathroomRadiatorsPage().refreshPage();
    getBathroomRadiatorsPage().GoToCartButton();
    getBathroomRadiatorsPage().waitForPageLoadComplete(TIME_TO_WAIT);
    getBathroomRadiatorsPage().getCountOfProductsInCart();
    getBathroomRadiatorsPage().waitForPageLoadComplete(TIME_TO_WAIT);
    Assert.assertEquals(getBathroomRadiatorsPage().getCountOfProductsInCart(),EXPECTED_NULL_COUNT);







}



}
