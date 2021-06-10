package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[contains(@id,'menu-vertical-menu')]//a[contains(text(),'Для радиаторов с боковым подключением')]")
    private WebElement sideRadiatorsButtonInMenu;

    @FindBy(xpath = "//ul[contains(@id,'menu-vertical-menu')]//a[contains(text(),'Для полотенцесушителей')]")
    private WebElement bathroomRadiatorsButtonInMenu;

    @FindBy(xpath = "//div[contains(@class,'main')]//div[contains(@class,'twitter-typeahead')]//input[@placeholder='Введите поисковый запрос']")
    private WebElement searchButton;

    @FindBy(xpath = "//ul[contains(@id,'menu-vertical-menu')]//a[contains(text(),'Термостатические головки')]")
    public WebElement termoValveButtonInMenu;


    public void clickOnSideRadiatorsButton(){
        sideRadiatorsButtonInMenu.click();
    }

    public void clickOnBathroomRadiatorsButton(){
        bathroomRadiatorsButtonInMenu.click();
    }

    public void clickOnSearchButton(String keyword){
    searchButton.sendKeys(keyword,Keys.ENTER);
    }

    public WebElement getSearchButton(){
        return searchButton;
    }

    public void clickOntermoValvesButton(){
        termoValveButtonInMenu.click();
    }



}
