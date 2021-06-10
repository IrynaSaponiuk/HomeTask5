package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{

    private static final String WRONG_SEARCH_WORD = "ABraCadaBra";
    private static final String RIGHT_SEARCH_WORD = "Standard";
    private static final String WRONG_TEXT_MESSAGE = "Товаров, соответствующих вашему запросу, не обнаружено.";
    private static final int TIME_TO_WAIT = 60;
    private static final int EXPECTED_COUNT_OF_PRODUCTS = 2;

    @Test
    public void checkIfSearchTheWrongWordGivesProperText() {
        getHomePage().waitForPageLoadComplete(TIME_TO_WAIT);
        getHomePage().clickOnSearchButton(WRONG_SEARCH_WORD);
        getHomePage().waitForAjaxToComplete(120);
        Assert.assertTrue(getSearchPage().getWrongTextInSearchBox().contains(WRONG_TEXT_MESSAGE));
        getSearchPage().clickOnSearchButton(RIGHT_SEARCH_WORD);
        getSearchPage().waitForPageLoadComplete(TIME_TO_WAIT);
        Assert.assertEquals(getSearchPage().getSizeOfListOfProductsOnSearchPage(),EXPECTED_COUNT_OF_PRODUCTS);

    }
}
