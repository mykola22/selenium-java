import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Exercise for opening different pages with any other browser except chrome.
 * Tried with FireFox but it doesn't work.
 * So I've just used Edge.
 */
public class SeleniumTest {
    //Method that runs once before all class
    @BeforeClass
    public static void BeforeClass(){
        WebDriverManager.edgedriver().setup();
    }

    //open https://the-internet.herokuapp.com/
    @Test
    public void edgeTest1() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.quit();
    }
    //open https://example.cypress.io/
    @Test
    public void edgeTest2() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://example.cypress.io/");
        driver.quit();
    }
    //open https://react-shopping-cart-67954.firebaseapp.com/
    @Test
    public void edgeTest3() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        driver.quit();
    }


}
