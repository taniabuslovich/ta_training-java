package page;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
    protected WebDriver driver;

    protected AbstractPage(WebDriver driver)
    {
        this.driver = driver;
    }

    protected void closePage() {
        driver.quit();
    }
}
