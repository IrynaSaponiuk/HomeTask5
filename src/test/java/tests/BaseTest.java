package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import pages.*;
import utils.CapabilityFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();// ThreadLocal позволяет нам хранить данные, которые будут доступны только конкретным потоком. Каждый поток будет иметь свой собственный экземпляр ThreadLocal
    private CapabilityFactory capabilityFactory = new CapabilityFactory();

    private static final String SCHLOSSER_URL = "https://armatura.in.ua/";

    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setUp(@Optional("firefox") String browser) throws MalformedURLException {
        driver.set(new RemoteWebDriver(new URL("http://192.168.43.133:4444/wd/hub"), capabilityFactory.getCapabilities(browser)));
        getDriver().manage().window().maximize();
        getDriver().get(SCHLOSSER_URL);
    }

    @AfterMethod
    public void tearDown() {
        getDriver().close();
    }

    @AfterClass
    void terminate() {
        driver.remove();
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public BathroomRadiatorsPage getBathroomRadiatorsPage() {
        return new BathroomRadiatorsPage(getDriver());
    }

    public CartPage getCartPage() {
        return new CartPage(getDriver());
    }

    public SearchPage getSearchPage() {
        return new SearchPage(getDriver());
    }

    public SideRadiatorsPage getSideRadiatorsPage() {
        return new SideRadiatorsPage(getDriver());
    }

    public ThermoValvesPage getThermoValvesPage() {
        return new ThermoValvesPage(getDriver());
    }



}
