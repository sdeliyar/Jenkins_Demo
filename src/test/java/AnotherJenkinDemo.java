import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AnotherJenkinDemo {

    WebDriver driver;

    @Test
    public  void testJenkins() throws Exception {
        System.out.println("Welcome to Jenkins...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        assertEquals("Expecting Google and actual title from Google website: ","Welcome Google", driver.getTitle());
        System.out.println("Test passed, this is Jenkins with Maven...");
        driver.close();
        driver.quit();
    }
}
