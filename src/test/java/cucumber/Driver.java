package cucumber;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

class Driver {

    WebDriver driver = WebDriverManager.chromedriver().create();

    @AfterEach
    public void stopChrome()
    {
        driver.quit();
    }

}
