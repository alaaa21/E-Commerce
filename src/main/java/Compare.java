import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Compare {
    public WebElement ComparePOM(WebDriver driver){
        return driver.findElement(By.className("button-2"));}
}
