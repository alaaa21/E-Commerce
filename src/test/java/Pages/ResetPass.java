package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPass {
    public WebElement enterEmailPOM(WebDriver driver)
    {

        return driver.findElement(By.id("Email"));
    }
}