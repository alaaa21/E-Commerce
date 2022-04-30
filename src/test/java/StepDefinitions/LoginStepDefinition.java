package StepDefinitions;

import Pages.Login;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {
    WebDriver driver = null;
    Login login=new Login();
    @Given("user navigates to login page")
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @When("user enter valid username and password")
    public void validDataLogin() {

        login.emailPOM(driver).sendKeys("");
        login.passwordPOM(driver).sendKeys("");
    }
    @Then("the user login successfully")
            public void successLogin(){
        String expectedResult = "https://demo.nopcommerce.com/";
        String actualResult = driver.findElement(By.className("html")).getText();
        Assert.assertEquals(actualResult.concat(expectedResult), true);
    }

}
