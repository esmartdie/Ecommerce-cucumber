package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AddToCartSteps extends BaseSteps{


    @Given("user login into the application with  {string} and {string}")
    public void userLoginIntoTheApplicationWithAnd(String username, String password) {
        driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='btn btn-dark']")).click();
        WebElement mainHeader = driver.findElement(By.xpath("//header[@class='jumbotron my-4']"));
        wait.until(ExpectedConditions.visibilityOf(mainHeader));
    }
    @Given("user search for an {string}")
    public void userSearchForAn(String item) {
        driver.findElement(By.cssSelector("input[type='search']")).sendKeys(item);
        driver.findElement(By.xpath("//form/button[@class=\"btn btn-outline-success my-2 my-sm-0\"]")).click();
        driver.findElement(By.xpath("//a[contains(@href, 'producthome')]")).click();
    }
    @When("user add the item to the cart")
    public void userAddTheItemToTheCart() {
        driver.findElement(By.xpath("//button[text()=\"Add to Cart\"]")).click();;
    }
    @Then("the cart should get updated")
    public void theCartShouldGetUpdated() {
        String text = driver.findElement(By.xpath("//*[@id=\"update-cart-form\"]/div/div[1]/table/tbody/tr[1]/td[1]")).getText();
        Assert.assertEquals(text.length()>0, true);
    }
}
