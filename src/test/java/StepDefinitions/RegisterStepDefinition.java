package StepDefinitions;

import Pages.Register;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegisterStepDefinition {
    WebDriver driver = null;
    Register register = new Register();

    @Given("user navigates to register page")
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @When("user enter valid username and password and email")
    public void validDataRegister() {
        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");

        register.firstnamePOM(driver).sendKeys("");
        register.lastnamePOM(driver).sendKeys("");
        register.emailPOM(driver).sendKeys("");
        register.companyPOM(driver).sendKeys("");
        register.ConfirmPasswordPOM(driver).sendKeys("");
    }




public void successRegister(){
        String expectedResult = "Your registration completed";
        String actualResult = driver.findElement(By.className("result")).getText();
        Assert.
                Assert.assertEquals(actualResult.concat(expectedResult), true);
    }


}

