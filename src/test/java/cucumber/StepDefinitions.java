package cucumber;

import io.cucumber.java.en.*;

import static org.testng.AssertJUnit.assertEquals;

public class StepDefinitions extends Driver {

    private String actualTitle;
    private String expectedTitle = "Selenium";

    @Given("The user navigates to the test page")
    public void navigateToTestPage() {
        driver.get("https://www.selenium.dev/");

    }

    @When("The user checks the title")
    public void getTitle() {
        actualTitle = driver.getTitle();
    }

    @Then("The user confirms they are on the test page")
    public void confirmsPage() {
        assertEquals(expectedTitle, actualTitle);
        driver.quit();
    }
}
