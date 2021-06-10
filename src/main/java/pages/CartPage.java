package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@aria-label,'Remove this item')]//i[contains(@class,'fa-times fa')]")
    private WebElement removeThisItemFromCart;

    public void clickOnDeleteThisItemFromCartButton(){
        removeThisItemFromCart.click();
    }

    public void moveToDeleteButtonAndClick(){
        Actions actions = new Actions(driver);
        actions.moveToElement(removeThisItemFromCart);
        actions.click();
        actions.release().perform();
    }
}
