package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wishlist {
    public WebElement wishlistPOM(WebDriver driver){
        return driver.findElement(By.id("add-to-wishlist-button-40"));
    }
}
