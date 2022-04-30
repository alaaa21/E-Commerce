package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addToShoppingCart {
    public WebElement addToShoppingCartPOM(WebDriver driver){
        return driver.findElement(By.cssSelector("button[type=\"button\"]"));
}}
