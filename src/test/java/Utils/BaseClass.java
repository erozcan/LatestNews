package Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class BaseClass {

    public static WebDriver driver;

    public static void setDriver() {

        System.setProperty("webdriver.chrome.driver","/Users/betbull/IdeaProjects/LatestNews/src/test/resources/drivers/chromedriver" );
        driver=new ChromeDriver();
        driver.navigate().to("https://techcrunch.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

    }

    public static void closeDriver()  {

        driver.quit();
    }


}
