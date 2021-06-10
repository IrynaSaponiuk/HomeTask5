package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='bapf_no_products']//p[contains(@class,'woocommerce-info')]")
    private WebElement wrongTextInSearchBox;

    @FindBy(xpath = "//div[contains(@class,'main')]//div[contains(@class,'twitter-typeahead')]//input[@placeholder='Введите поисковый запрос']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class='block-title']//h3[@class='name']")
    private List<WebElement> listOfProductsOnSearchPage;

    public String getWrongTextInSearchBox(){
        return wrongTextInSearchBox.getText();
    }

    public void clickOnSearchButton(String keyword){
        searchButton.clear();
        searchButton.sendKeys(keyword, Keys.ENTER);
    }

    public void findTextBox(){
        Actions action = new Actions(driver);
        action.moveToElement(wrongTextInSearchBox);
        action.release().perform();
    }

    public int getSizeOfListOfProductsOnSearchPage(){
        return listOfProductsOnSearchPage
                .size();
    }

}
