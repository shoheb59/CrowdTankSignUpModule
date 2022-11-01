package Setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class SetUpPage {

    public WebDriver driver;
    DevTools devTools;

    @BeforeTest
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


//
//        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headed");
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//
//        driver = new ChromeDriver(options);
        //



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

}
