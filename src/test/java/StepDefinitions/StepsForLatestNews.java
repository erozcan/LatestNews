package StepDefinitions;

import Pages.TechCrunchElements;
import Utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class StepsForLatestNews extends BaseClass {

    TechCrunchElements object1;

    @Before
    public void openDriver() {
        setDriver();
    }

    @Given("user is on techcrunch website")
    public void user_is_on_techcrunch_website() {
        object1 = new TechCrunchElements(driver);
        System.out.println("Tech crunch home page is opened");

    }

    @And("each news has an author")
    public void each_news_has_an_author() {
        Assert.assertEquals(object1.getArticles().size(), object1.getAuthors().size());
        System.out.println("--compare articles and authors counts---");
        System.out.println("Articles numbers=" +object1.getArticles().size());
        System.out.println("Author numbers=" +object1.getAuthors().size());
    }

    @And("each news has an image")
    public void each_news_has_an_image() {
        Assert.assertEquals(object1.getArticles().size(), object1.getImages().size());
        System.out.println("--compare articles and images counts---");
        System.out.println("Articles numbers=" +object1.getArticles().size());
        System.out.println("Images numbers=" +object1.getImages().size());
    }

    @When("user clicked one of the news on The Latest News")
    public void user_clicked_one_of_the_news_on_the_latest_news(){
    object1.clickOneOfLatestNews();
    }

    @Then("Check the browser title and full content title is same")
    public void check_the_browser_title_and_full_content_title_is_same() {
        String browserTitle= driver.getTitle();
        String clickedNewsTitle=driver.findElement(By.cssSelector(".article__title")).getText();
        Assert.assertEquals(browserTitle,clickedNewsTitle);
    }

    @Then("Check the links of the content")
    public void check_the_links_of_the_content() {

      object1.clickOneOfLatestNews();

    }

    @After
    public void clsDriver() {
        closeDriver();
    }

}
