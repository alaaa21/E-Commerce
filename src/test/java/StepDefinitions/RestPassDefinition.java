package StepDefinitions;

import Pages.ResetPass;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RestPassDefinition {

    WebDriver driver = null;
    ResetPass reset=new ResetPass();
    @And("enter email")
    public void resetPass() {
        reset.enterEmailPOM(driver).sendKeys("");
    }
    @Then("the new password sent to email successfully")
    public void resetSuccess(){
        String expectedResult= "Email with instructions has been sent to you.";
        String actualResult = driver.findElement(By.className("content")).getText();
        Assert.assertEquals(actualResult.concat(expectedResult),true);
    }
}
