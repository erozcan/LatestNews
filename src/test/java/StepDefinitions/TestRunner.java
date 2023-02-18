package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="/Users/betbull/IdeaProjects/LatestNews/src/test/resources/features/latestnews.feature",
        glue = "StepDefinitions",
        monochrome = true,
        tags ="@smoke"
 )

public class TestRunner {

}
