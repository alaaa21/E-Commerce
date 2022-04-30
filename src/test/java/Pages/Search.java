package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
    public WebElement enterSearchItem(WebDriver driver)
    {

        return driver.findElement(By.id("small-searchterms"));
    }
}
