package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class filterColor {
    public String filterColorPOM(WebDriver driver)
    {

        return driver.findElement(By.cssSelector("span[itemprop=\"name\"]")).getCssValue("Color");
    }

}
