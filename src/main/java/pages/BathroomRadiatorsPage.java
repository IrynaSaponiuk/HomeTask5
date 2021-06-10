package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

import javax.swing.*;
import java.util.List;

public class BathroomRadiatorsPage extends BasePage{
    public BathroomRadiatorsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'product-block grid')]")
    private List<WebElement> listOfProductsOnBathroomRadiatorsPage;

    @FindBy(xpath = "//button[contains(text(),' Купить')]")
    private WebElement buttonToBuy;

    @FindBy(xpath = "//a[contains(text(),'Продолжить покупки')]")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//div[contains(@class,'header-right clearfix')]//a[contains(@title,'Просмотреть корзину')]//span[contains(@class,'count')]")
    private WebElement countOfProductsInCart;

    @FindBy(xpath = "//div[@class=\"pull-right\"]//a[contains(text(),'В корзину')]")
    private WebElement goToCartButton;

    public void clickOnFirstProductOnBathroomRadiatorsPage(){
        listOfProductsOnBathroomRadiatorsPage.get(0).click();
    }

    public void clickOnButtonToBuy(){
        buttonToBuy.click();
    }

    public void clickOnContinueShoppingButton(){
        continueShoppingButton.click();
    }

    public void findCountOfCartOnSite(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", countOfProductsInCart);
    }

    public String getCountOfProductsInCart(){
        return countOfProductsInCart.getText();
    }

    public WebElement getContinueShoppingButton(){
        return continueShoppingButton;
    }

    public void clickOnCart(){
        countOfProductsInCart.click();
    }

    public void clickGoToCart(){
        goToCartButton.click();
    }

    public WebElement getGoToCartButton(){
        return goToCartButton;
    }

    public void GoToCartButton(){
        Actions action = new Actions(driver);
        action.moveToElement(countOfProductsInCart).click().perform();
        action.release().perform();
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

}
