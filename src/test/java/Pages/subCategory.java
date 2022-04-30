package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class subCategory {
    public  WebElement subCategoryPOM( WebDriver driver) {


        return driver.findElement(By.linkText("Electronics "));
    }
}
