import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

import java.util.ArrayList;

public class BaseClass {

    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String RESOURCES_DRIVER_CHROMEDRIVER = "resources/driver/chromedriver";
    private static final Boolean isHeadless = true;
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

    public void closeWebdriver() {
        for (WebDriver driver:  webDriverList) {
            driver.close();
        }
    }


}
