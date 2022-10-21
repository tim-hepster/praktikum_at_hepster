import net.bytebuddy.dynamic.scaffold.TypeInitializer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestButton extends BaseClass {

    @Test
    void testHome() {
        WebDriver driver = createWebdriverInstance();
        driver.get("file://C:\\Users\\LeonieEwald\\repo\\praktikum_at_hepster\\home.html");
        Assert.assertTrue(driver.findElement(By.id("welcome_gif")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("navbarSupportedContent1")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent1\"]/ul/li/a")).isDisplayed());
    }

    @Test
    void testSignUp() {
        WebDriver driver = createWebdriverInstance();
        driver.get("C:\\Users\\LeonieEwald\\repo\\praktikum_at_hepster\\index.html");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent1\"]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent1\"]/ul/li/a")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("emailInput")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("passwordInput")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("sign_Up_button")).isDisplayed());
    }


    @Test
    void testHome2() {
        WebDriver driver = createWebdriverInstance();
        driver.get("C:\\Users\\LeonieEwald\\repo\\praktikum_at_hepster\\home2.html");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent1\"]/ul/li/a")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("hello_gif_1")).isDisplayed());
    }


    @Test
    void testAnotherAction() {
        WebDriver driver = createWebdriverInstance();
        driver.get("C:\\Users\\LeonieEwald\\repo\\praktikum_at_hepster\\another.action.html");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent1\"]/ul/li/a")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("hello_gif_2")).isDisplayed());
    }


    @Test
    void testSomethingelsehere() {
        WebDriver driver = createWebdriverInstance();
        driver.get("C:\\Users\\LeonieEwald\\repo\\praktikum_at_hepster\\something.else.here.html");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent1\"]/ul/li/a")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("hello_gif_3")).isDisplayed());
    }

    @Test
    void testNutzungsbedingungen() {
        WebDriver driver = createWebdriverInstance();
        driver.get("C:\\Users\\LeonieEwald\\repo\\praktikum_at_hepster\\nutzungsbedingungen.html");
        Assert.assertTrue(driver.findElement(By.id("weiter_button")).isDisplayed());
    }


    @Test
    void testMyWorld() {
        WebDriver driver = createWebdriverInstance();
        driver.get("C:\\Users\\LeonieEwald\\repo\\praktikum_at_hepster\\my.world.html");
        Assert.assertTrue(driver.findElement(By.id("earth")).isDisplayed());
    }


    @Test
    void testButton() {
        WebDriver driver = createWebdriverInstance();
        driver.get("C:\\Users\\LeonieEwald\\repo\\praktikum_at_hepster\\home.html");
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent1\"]/ul/li/a")).click();
        WebElement email = driver.findElement(By.id("emailInput"));
        WebElement password = driver.findElement(By.id("passwordInput"));
        email.sendKeys("a@as.de");
        password.sendKeys("asd");
        driver.findElement(By.id("sign_Up_button")).click();
        driver.findElement(By.xpath("//*[@id=\"akzeptierenInput\"]")).click();
        driver.findElement(By.id("weiter_button")).click();
        Assert.assertTrue(driver.findElement(By.id("earth")).isDisplayed());
    }

    @Test
    void testFail() {
        WebDriver driver = createWebdriverInstance();
        driver.get("C:\\Users\\LeonieEwald\\repo\\praktikum_at_hepster\\index.html");
        WebElement email = driver.findElement(By.id("emailInput"));
        email.sendKeys("asd@as.de");
        WebElement password = driver.findElement(By.id("passwordInput"));
        password.sendKeys("asd");

    }
}
