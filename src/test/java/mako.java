import javafx.scene.control.DatePicker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class mako {
    private WebDriver driver;
    private WebDriverWait wait;
    public int Count;

    @Before
    public void start() {
        driver = new ChromeDriver();
       /* driver = new FirefoxDriver();
        driver = new EdgeDriver();
        driver = new InternetExplorerDriver();
        driver = new SafariDriver();*/
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void search() {
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("hotelbeds.com");
        driver.findElement(By.xpath("//ul[@class='erkvQe']//li[1]//div[1]//div[1]")).click();

    }

    @After
    public void quit(){
        driver.quit();
        driver=null;
    }

}
