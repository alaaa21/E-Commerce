package StepDefinitions;

import Pages.ResetPass;
import Pages.Search;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searc {
    WebDriver driver = null;
    Search search= new Search();
    @And("user click on search button")
    public void setSearch() {
        search.enterSearchItem(driver).sendKeys("");
    }

}
