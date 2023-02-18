package Pages;

import Utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Iterator;
import java.util.List;

public class TechCrunchElements extends BaseClass {

    WebDriver driver;

    public TechCrunchElements(WebDriver driver) {
        this.driver = driver;
    }

    By authors = By.cssSelector("span[class='river-byline__authors']");
    By images = By.cssSelector("div[class='river river--homepage '] img[src]");
    By articles = By.xpath("//*[starts-with(@class,'post-block post-block')]");
    By clickedArticle=By.cssSelector("article:nth-of-type(1) .post-block__title__link");


    public List<WebElement> getAuthors() {
        return driver.findElements(authors);
    }
    public List<WebElement> getImages() {
        return driver.findElements(images);
    }

    public List<WebElement> getArticles() {
        return driver.findElements(articles);
    }

    public void clickOneOfLatestNews() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,700)");
        driver.findElement(clickedArticle).click();

        String url="";
        List<WebElement> links = driver.findElements(By.cssSelector(".article-content a[href*='https']"));
        System.out.println("Total links within the selected news content: " + links.size());
        Iterator<WebElement> iterator = links.iterator();
        while (iterator.hasNext()) {
            url = iterator.next().getText();
            System.out.println(url);
        }

        }

    }




