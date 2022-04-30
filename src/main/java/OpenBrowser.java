import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class OpenBrowser {
    WebDriver driver = null;
    Login login=new Login();
    Register register=new Register();
    Search search=new Search();
    filterColor filter=new filterColor();
    subCategory subcat =new subCategory();
    ResetPass reset = new ResetPass();
    wishlist wish=new wishlist();
    addToShoppingCart addToShop =new addToShoppingCart();
    Compare compare=new Compare();



@beforeTest
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
public void validDataRegister()
{
    driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");

register.firstnamePOM(driver).sendKeys("");
    register.lastnamePOM(driver).sendKeys("");
   register.emailPOM(driver).sendKeys("");
   register.companyPOM(driver).sendKeys("");
   register.ConfirmPasswordPOM(driver).sendKeys("");
    String expectedResult= "Your registration completed";
    String actualResult = driver.findElement(By.className("result")).getText();
    Assert.
    Assert.assertEquals(actualResult.concat(expectedResult),true);
}
public void validDataLogin() {
    driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    login.emailPOM(driver).sendKeys("");
    login.passwordPOM(driver).sendKeys("");
    String expectedResult = "https://demo.nopcommerce.com/";
    String actualResult = driver.findElement(By.className("html")).getText();
    Assert.assertEquals(actualResult.concat(expectedResult), true);
}
public void Search(){

        search.enterSearchItem(driver).sendKeys("");
    String expectedResult = "https://demo.nopcommerce.com/books";
    String actualResult = driver.findElement(By.className("master")).getText();
    Assert.assertEquals(actualResult.concat(expectedResult), true);
}
public void filterColor(){

   filter.filterColorPOM(driver);

}
public void subCategory(){
        subcat.subCategoryPOM(driver).click();

}
public void resetPass(){
        reset.enterEmailPOM(driver).sendKeys("");
    String expectedResult= "Email with instructions has been sent to you.";
    String actualResult = driver.findElement(By.className("content")).getText();
    Assert.assertEquals(actualResult.concat(expectedResult),true);
}
public void wishlist(){
        wish.wishlistPOM(driver).click();
    String expectedResult= "The product has been added to your https://demo.nopcommerce.com/wishlist ";
    String actualResult = driver.findElement(By.className("content")).getText();
    Assert.assertEquals(actualResult.concat(expectedResult),true);
}
    public void compare(){
        compare.ComparePOM(driver).click();
        String expectedResult= "The product has been added to your https://demo.nopcommerce.com/compareproducts";
        String actualResult = driver.findElement(By.className("content")).getText();
        Assert.assertEquals(actualResult.concat(expectedResult),true);
    }
    public void shoppingCart(){
        wish.wishlistPOM(driver).click();
        addToShop.addToShoppingCartPOM(driver).click();
        String expectedResult= "The product has been added to your https://demo.nopcommerce.com/cart ";
        String actualResult = driver.findElement(By.className("content")).getText();
        Assert.assertEquals(actualResult.concat(expectedResult),true);
    }

}
