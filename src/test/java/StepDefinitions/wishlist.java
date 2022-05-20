package StepDefinitions;

import Pages.ResetPass;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wishlist {
    WebDriver driver = null;
 wishlist wish = new wishlist();
    @When(" user click on add item to wishlist button")
    public void wishlist(WebDriver driver) {
        wish.
        wish.wishlistPOM(driver).sendKeys("");
    }

}
