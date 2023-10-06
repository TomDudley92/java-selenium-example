package cucumber;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import static org.testng.AssertJUnit.assertEquals;

public class StepDefinitions extends Driver {

    private String actualTitle;
    private String expectedTitle = "Selenium";

    @Given("the user is on the calculator application")
    public void navigateToCalcPage() {
        driver.get("http://localhost:8081/calc0");
    }

    @When("two numbers are added together")
    public void twoNumbersAreAddedTogether() {
        driver.findElement(By.cssSelector("#num1")).sendKeys("10");
        driver.findElement(By.cssSelector("#num2")).sendKeys("15");
        driver.findElement(By.id("add")).click();
        driver.findElement(By.id("calc")).click();
    }

    @Then("the result is displayed on screen")
    public void theResultIsDisplayedOnScreen() {
       String result = driver.findElement(By.id("result")).getAttribute("placeholder");
       String expectResult = "25";
       assertEquals(expectResult, result);

    }
}
