package LocatingElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

/**
 * Exercise for writing test with several steps.
 */
public class LocatingElementsTest {

    @Test
    public void elementsLocation() {
        //1.initializing the driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2. opening the page
        driver.get("https://www.saucedemo.com/");

        //3. finding element - 4. checking the state
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("user-name")));

        //5. taking action - 6. recording result
        assertTrue(element.isDisplayed());

        //6. killing the driver
        driver.quit();
    }


}
