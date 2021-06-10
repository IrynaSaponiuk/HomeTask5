package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.lang.String.valueOf;

public class SideRadiatorsPage extends BasePage{
    public SideRadiatorsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//select[contains(@name,'orderby')]")
    private WebElement orderByBox;

    @FindBy(xpath = "//select[contains(@name,'orderby')]//option[contains(text(),'Цены: по возрастанию')]")
    private WebElement increasingOrderOfPriceButton;

    @FindBy(xpath = "//span[contains(@class,'price')]//bdi")
    private List<WebElement> listOfPricesOnSideRadiatorsPage;


    public void clickOnOrderByBox(){
        orderByBox.click();
    }

    public void clickOnIncreasingOrderButton(){
        increasingOrderOfPriceButton.click();
    }

    public int getFirstPriceOnSideRadiatorPage(){
       return Integer.parseInt(listOfPricesOnSideRadiatorsPage.get(0).getText().replace(" ₴", ""));
    }

    public int getFifthPriceOnSideRadiatorPage(){
      return Integer.parseInt(listOfPricesOnSideRadiatorsPage.get(4).getText().replace(" ₴",""));
    }





}
