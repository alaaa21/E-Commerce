package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {
    public WebElement firstnamePOM(WebDriver driver)
    {

        return driver.findElement(By.id("FirstName"));
    }
    public WebElement lastnamePOM(WebDriver driver)
    {

        return driver.findElement(By.id("LastName"));
    }
    public WebElement emailPOM(WebDriver driver)
    {

        return driver.findElement(By.id("Email"));
    }
    public WebElement companyPOM(WebDriver driver)
    {

        return driver.findElement(By.id("Company"));
    }
    public WebElement PasswordPOM(WebDriver driver)
    {

        return driver.findElement(By.id("Password"));
    }
    public WebElement ConfirmPasswordPOM(WebDriver driver)
    {

        return driver.findElement(By.id("ConfirmPassword"));
    }
}
