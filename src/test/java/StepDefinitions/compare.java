package StepDefinitions;

import Pages.Compare;
import Pages.ResetPass;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class compare {
    WebDriver driver = null;
    Compare compare =new Compare();
    @When("user navigates to comapre page")
    public void enterButton() {
     compare.ComparePOM(driver).sendKeys("");
    }

}
