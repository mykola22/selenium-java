import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Word *Test should be in the end of the name of the class to run it with Maven.
 * More about that in the future lessons.
 */
public class HelloSeleniumTest {
    @Test
    public void FirstTest() {
        /**
         * Setting up chrome driver via WebDriver Manager and WebDriver
         * There was another way in the video, but I wanted it to be done this way.
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.quit(); //quitting the driver to close the browser
    }
}
