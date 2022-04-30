package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    public WebElement emailPOM(WebDriver driver)
    {

        return driver.findElement(By.id("Email"));
    }
    public WebElement passwordPOM(WebDriver driver)
    {

        return driver.findElement(By.name("Password"));
    }
}
