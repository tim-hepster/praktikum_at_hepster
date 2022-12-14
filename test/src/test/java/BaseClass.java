import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

import java.util.ArrayList;

public class BaseClass {

    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String RESOURCES_DRIVER_CHROMEDRIVER = "C:\\Users\\LeonieEwald\\repo\\praktikum_at_hepster\\resources\\driver\\chromedriver.exe";
    private static final boolean isHeadless = false;
    protected ArrayList<WebDriver> webDriverList;

    public BaseClass() {
        this.webDriverList = new ArrayList<>();
    }
    private WebDriver setupChromeBrowser() {
        System.setProperty(WEBDRIVER_CHROME_DRIVER, RESOURCES_DRIVER_CHROMEDRIVER);
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(isHeadless);
        options.addArguments("--window-size=1920,1200");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        return new ChromeDriver(options);
    }

    protected WebDriver createWebdriverInstance() {
        WebDriver result = setupChromeBrowser();
        webDriverList.add(result);
        return result;
    }

    @AfterClass
    public void closeWebdriver() {
        for (WebDriver driver:  webDriverList) {
            driver.close();
        }
    }


}
