import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestButton extends BaseClass{

    @Test
    void testSomething() {
        WebDriver driver = createWebdriverInstance();
        driver.findElement(By.id(""));
    }
}
